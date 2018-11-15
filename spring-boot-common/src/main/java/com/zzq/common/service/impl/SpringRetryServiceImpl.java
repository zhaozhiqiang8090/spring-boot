package com.zzq.common.service.impl;

import com.zzq.common.service.SpringRetryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class SpringRetryServiceImpl implements SpringRetryService {

    private static final Logger logger = LoggerFactory.getLogger(SpringRetryServiceImpl.class);

    private int time = 0;

    @Retryable(value= {RuntimeException.class},maxAttempts = 3,backoff = @Backoff(delay = 5000l,multiplier = 2))
    public void call() throws RuntimeException {
//        if (time < 2) {
        if (time < 3) {
            time ++;
            logger.info("do something...");
            throw new RuntimeException("RPC调用异常");
        }
    }

    @Recover
    @SuppressWarnings("unused")
    public void recover(RuntimeException e) {
        logger.info(" ---------------------------  ");
        logger.info(e.getMessage());
    }

}

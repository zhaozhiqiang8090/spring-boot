package com.zzq.common.address;

import org.apache.commons.lang3.StringUtils;

public class CheckUtil {

    /**
     * 是否直辖市
     *
     * @param address
     * @return
     */
    public static boolean isMunicipality(String address) {
        // 实现丢失，暂时写死
        if (StringUtils.isNotBlank(address)) {
            return true;
        }

        return false;
    }
}

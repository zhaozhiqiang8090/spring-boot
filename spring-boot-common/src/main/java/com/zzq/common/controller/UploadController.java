package com.zzq.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;

@Controller
@RequestMapping("/upload")
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @RequestMapping("/test")
    public String test() {
        return "upload";
    }

    @RequestMapping("/file")
    @ResponseBody
    public String upload(@RequestParam("pic") MultipartFile file, HttpServletRequest request) {
        String contentType = file.getContentType();
        logger.info("current content type:" + contentType);

        String fileName = file.getOriginalFilename();
//        String filePath = request.getSession().getServletContext().getRealPath("upload/");
        String filePath = "E:/upload/";

        try {
            this.fileUpload(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }

    public static void fileUpload(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}

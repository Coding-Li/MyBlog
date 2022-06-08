package cn.lijunhaoit.myblog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.transform.Result;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 博客文件控制
 */
@RestController
public class BlogFileController {

    @PostMapping({"img"})
    public Result uploadFile(@RequestParam(value = "file", required = false) MultipartFile file, String module){
        Result uploadResult = upload(file, module);
        return uploadResult;
    }


    @PostMapping({"file"})
    public Result upload(@RequestParam(value = "file", required = false) MultipartFile file, String module) throws IOException {
        if (file == null)
            return Result.error("no");
                    String originalFilename = file.getOriginalFilename();
        boolean pass = false;
        try {
            pass = FileCheckUtils.checkFileType(file.getBytes(), originalFilename.substring(originalFilename.lastIndexOf(".") + 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!pass)
            return Result.error("no");
                    String uploadPath = this.uploadService.upload(file, module);
        return Result.ok(uploadPath);
    }



}

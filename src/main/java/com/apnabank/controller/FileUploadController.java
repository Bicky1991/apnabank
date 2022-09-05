package com.apnabank.controller;

import com.apnabank.helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;

    @PostMapping("uploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file)
    {
//        System.out.println(file.getOriginalFilename());
//        System.out.println(file.getSize());

        try {

            if (file.isEmpty()) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Must Contain File");
            }
//        if(!file.getContentType().equals("image/jpeg"))
//        {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Must Contain jprg File");
//        }

            //Upload Code

            boolean f=fileUploadHelper.uploadFile(file);
            if(f)
            {
                return ResponseEntity.ok("File Uploaded");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong");
    }
}

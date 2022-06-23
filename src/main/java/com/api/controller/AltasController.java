package com.api.controller;

import com.api.entity.Altas;
import com.api.helper.Helper;
import com.api.service.AltasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class AltasController {

    @Autowired
    private AltasService altasService;

    @PostMapping("/excel/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            //true

            this.altasService.save(file);

            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));


        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
    }


    @GetMapping("/excel")
    public List<Altas> getAllProduct() {
        return this.altasService.getAllProducts();
    }

}


//http://localhost:8080/excel/upload (POST)
//http://localhost:8080/excel (GET)
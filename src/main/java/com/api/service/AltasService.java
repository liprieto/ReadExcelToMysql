package com.api.service;

import com.api.entity.Altas;
import com.api.helper.Helper;
import com.api.repo.AltasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class AltasService {

    @Autowired
    private AltasRepo altasRepo;

    public void save(MultipartFile file) {

        try {
            List<Altas> altas = Helper.convertExcelToListOfAltas(file.getInputStream());
            this.altasRepo.saveAll(altas);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Altas> getAllProducts() {
        return this.altasRepo.findAll();
    }


}
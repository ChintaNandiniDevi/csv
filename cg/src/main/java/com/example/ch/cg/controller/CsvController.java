package com.example.ch.cg.controller;

import com.example.ch.cg.entity.CsvData;
import com.example.ch.cg.service.CsvReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/csv")
public class CsvController {

    @Autowired
    private CsvReaderService csvReaderService;

    @PostMapping("/upload")
    public void uploadCsvFile(@RequestParam("file") MultipartFile file) {
        csvReaderService.saveCsvData(file);
    }

    @GetMapping("/data")
    public List<CsvData> getCsvData() {
        return csvReaderService.getAllCsvData();
    }
}

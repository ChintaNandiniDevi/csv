package com.example.ch.cg.service;

import com.example.ch.cg.entity.CsvData;
import com.example.ch.cg.repository.CsvDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CsvReaderService  {

    @Autowired
    private CsvDataRepository csvDataRepository;

    @Transactional
    public void saveCsvData(MultipartFile file) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                CsvData csvData = new CsvData();
                csvData.setColumn1(data[0]);
               // csvData.setColumn2(data[1]);
                // Set other columns as needed
                csvDataRepository.save(csvData);
            }
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }

    @Transactional
    public List<CsvData> getAllCsvData() {
        return csvDataRepository.findAll();
    }
}

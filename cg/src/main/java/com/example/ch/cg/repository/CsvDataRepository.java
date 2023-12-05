package com.example.ch.cg.repository;

import com.example.ch.cg.entity.CsvData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CsvDataRepository extends JpaRepository<CsvData, Long> {

    CsvData save(CsvData csvData);
}

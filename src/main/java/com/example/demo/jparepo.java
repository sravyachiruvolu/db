package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jparepo extends JpaRepository<StudentData,Integer> {
@Override
List<StudentData> findAll();
}

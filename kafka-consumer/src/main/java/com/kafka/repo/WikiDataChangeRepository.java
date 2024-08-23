package com.kafka.repo;


import com.kafka.entity.WikiDataChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiDataChangeRepository extends JpaRepository<WikiDataChange, Long> {
}
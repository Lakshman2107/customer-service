package com.project.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.model.CoustomerDetailsEntity;

@Repository
public interface CoustomerDetailsRepository extends JpaRepository<CoustomerDetailsEntity, Integer>
{

}

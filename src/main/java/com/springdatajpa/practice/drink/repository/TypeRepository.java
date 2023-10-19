package com.springdatajpa.practice.drink.repository;

import com.springdatajpa.practice.drink.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface TypeRepository extends JpaRepository<Type, Integer> {
    @Query(value = "SELECT type_code, type_name FROM tbl_type ORDER BY type_code", nativeQuery = true)
    public List<Type> findAllType();
}

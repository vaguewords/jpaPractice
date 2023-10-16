package com.springdatajpa.practice.product.repository;

import com.springdatajpa.practice.product.entity.Type;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface TypeRepository extends JpaRepository<Type, Integer> {

}

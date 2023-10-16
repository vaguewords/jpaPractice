package com.springdatajpa.practice.drink.repository;

import com.springdatajpa.practice.drink.entity.Drink;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
    List<Drink> findByDrinkPriceGreaterThan(Integer drinkPrice);
    //일정가격초과 + 가격순정렬
    List<Drink> findByDrinkPriceGreaterThanOrderByDrinkPrice(Integer drinkPrice);
    //일정가격초과 + 커스텀정렬
    List<Drink> findByDrinkPriceGreaterThan(Integer drinkPrice, Sort sort);
}

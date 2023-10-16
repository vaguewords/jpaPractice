package com.springdatajpa.practice.product.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DrinkDTO {
    private int drinkCode;
    private int drinkName;
    private int calorie;
    private int sugar;
    private int fat;
    private int drinkTypeCode;
}

package com.springdatajpa.practice.drink.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DrinkDTO {
    private int drinkCode;
    private String drinkName;
    private int drinkPrice;
    private int calorie;
    private int sugar;
    private int fat;
    private int typeCode;
}

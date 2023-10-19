package com.springdatajpa.practice.drink.dto;


public class DrinkDTO {
    private int drinkCode;
    private String drinkName;
    private int drinkPrice;
    private int calorie;
    private int sugar;
    private int fat;
    private int typeCode;

    public DrinkDTO() {
    }

    public DrinkDTO(int drinkCode, String drinkName, int drinkPrice, int calorie, int sugar, int fat, int typeCode) {
        this.drinkCode = drinkCode;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.calorie = calorie;
        this.sugar = sugar;
        this.fat = fat;
        this.typeCode = typeCode;
    }

    public int getDrinkCode() {
        return drinkCode;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public int getCalorie() {
        return calorie;
    }

    public int getSugar() {
        return sugar;
    }

    public int getFat() {
        return fat;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setDrinkCode(int drinkCode) {
        this.drinkCode = drinkCode;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    @Override
    public String toString() {
        return "DrinkDTO{" +
                "drinkCode=" + drinkCode +
                ", drinkName='" + drinkName + '\'' +
                ", drinkPrice=" + drinkPrice +
                ", calorie=" + calorie +
                ", sugar=" + sugar +
                ", fat=" + fat +
                ", typeCode=" + typeCode +
                '}';
    }
}

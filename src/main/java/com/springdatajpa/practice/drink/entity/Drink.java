package com.springdatajpa.practice.drink.entity;

import javax.persistence.*;

@Entity(name = "drink")
@Table(name = "tbl_drink")
public class Drink {
    @Id
    @Column(name = "drink_code")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int drinkCode;
    @Column(name = "drink_name")
    private String drinkName;
    @Column(name = "drink_price")
    private int drinkPrice;
    @Column(name = "calorie")
    private int calorie;
    @Column(name = "sugar")
    private int sugar;
    @Column(name = "fat")
    private int fat;
    @Column(name = "type_code")
    private int typeCode;

    protected Drink() {}

    public Drink(int drinkCode, String drinkName, int calorie, int sugar, int fat, int typeCode) {
        this.drinkCode = drinkCode;
        this.drinkName = drinkName;
        this.calorie = calorie;
        this.sugar = sugar;
        this.fat = fat;
        this.typeCode = typeCode;
    }

    public int getDrinkCode() {
        return drinkCode;
    }

    public void setDrinkCode(int drinkCode) {
        this.drinkCode = drinkCode;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    @Override
    public String toString() {
        return "Drink{" +
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

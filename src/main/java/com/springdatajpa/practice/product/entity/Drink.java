package com.springdatajpa.practice.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "drink")
@Table(name = "tbl_drink")
public class Drink {
    @Id
    @Column(name = "drink_code")
    private int coffeeCode;
    @Column(name = "drink_name")
    private int coffeeName;
    @Column(name = "calorie")
    private int calorie;
    @Column(name = "sugar")
    private int sugar;
    @Column(name = "fat")
    private int fat;
    @Column(name = "type_code")
    private int typeCode;

    protected Drink() {}

    public Drink(int coffeeCode, int coffeeName, int calorie, int sugar, int fat, int typeCode) {
        this.coffeeCode = coffeeCode;
        this.coffeeName = coffeeName;
        this.calorie = calorie;
        this.sugar = sugar;
        this.fat = fat;
        this.typeCode = typeCode;
    }

    public int getCoffeeCode() {
        return coffeeCode;
    }

    public void setCoffeeCode(int coffeeCode) {
        this.coffeeCode = coffeeCode;
    }

    public int getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(int coffeeName) {
        this.coffeeName = coffeeName;
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
                "coffeeCode=" + coffeeCode +
                ", coffeeName=" + coffeeName +
                ", calorie=" + calorie +
                ", sugar=" + sugar +
                ", fat=" + fat +
                ", typeCode=" + typeCode +
                '}';
    }
}

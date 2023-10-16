package com.springdatajpa.practice.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "type")
@Table(name = "tbl_type")
public class Type {
    @Id
    @Column(name = "drink_type_code")
    private int drinkTypeCode;
    @Column(name = "drink_type_name")
    private int drinkTypeName;

    public Type() {
    }

    public Type(int drinkTypeCode, int drinkTypeName) {
        this.drinkTypeCode = drinkTypeCode;
        this.drinkTypeName = drinkTypeName;
    }

    public int getDrinkTypeCode() {
        return drinkTypeCode;
    }

    public void setDrinkTypeCode(int drinkTypeCode) {
        this.drinkTypeCode = drinkTypeCode;
    }

    public int getDrinkTypeName() {
        return drinkTypeName;
    }

    public void setDrinkTypeName(int drinkTypeName) {
        this.drinkTypeName = drinkTypeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "drinkTypeCode=" + drinkTypeCode +
                ", drinkTypeName=" + drinkTypeName +
                '}';
    }
}

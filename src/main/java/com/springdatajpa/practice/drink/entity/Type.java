package com.springdatajpa.practice.drink.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "type")
@Table(name = "tbl_type")
public class Type {
    @Id
    @Column(name = "type_code")
    private int typeCode;
    @Column(name = "type_name")
    private String typeName;

    public Type() {
    }

    public Type(int typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeCode=" + typeCode +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}

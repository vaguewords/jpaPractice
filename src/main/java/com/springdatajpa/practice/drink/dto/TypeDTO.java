package com.springdatajpa.practice.drink.dto;


public class TypeDTO {
    private int typeCode;
    private int typeName;


    public TypeDTO() {
    }

    public TypeDTO(int typeCode, int typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public int getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "TypeDTO{" +
                "typeCode=" + typeCode +
                ", typeName=" + typeName +
                '}';
    }
}

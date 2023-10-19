package com.springdatajpa.practice.drink.dto;


public class TypeDTO {
    private int typeCode;
    private String typeName;


    public TypeDTO() {
    }

    public TypeDTO(int typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeDTO{" +
                "typeCode=" + typeCode +
                ", typeName=" + typeName +
                '}';
    }
}

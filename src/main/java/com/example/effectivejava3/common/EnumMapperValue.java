package com.example.effectivejava3.common;

public class EnumMapperValue {
    private String code;
    private String title;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        code = enumMapperType.getCode();
        title = enumMapperType.getTitle();
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
}
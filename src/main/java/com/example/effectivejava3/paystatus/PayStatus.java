package com.example.effectivejava3.paystatus;

import com.example.effectivejava3.common.EnumMapperType;

public abstract class PayStatus {
    public enum PayStatusGroup implements EnumMapperType {
        CANCEL("결제취소"),
        COMPLET("결제완료");

        private String title;

        PayStatusGroup(String title) {
            this.title = title;
        }

        @Override
        public String getCode() {
            return name();
        }

        @Override
        public  String getTitle() {
            return title;
        }
    }
}

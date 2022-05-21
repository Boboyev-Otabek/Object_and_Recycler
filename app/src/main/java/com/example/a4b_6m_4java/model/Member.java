package com.example.a4b_6m_4java.model;

import java.io.Serializable;

public class Member implements Serializable {
    private String ism;
    private String familiya;

    public Member(String ism, String familiya){
        this.ism=ism;
        this.familiya=familiya;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    @Override
    public String toString() {
        return "Member{" +
                "ism='" + ism + '\'' +
                ", familiya='" + familiya + '\'' +
                '}';
    }
}

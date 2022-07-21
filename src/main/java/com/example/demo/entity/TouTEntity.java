package com.example.demo.entity;

import java.util.List;

public class TouTEntity {
    private String sta;
    private String msg;
    private List<PhoneConts> phoneConts;

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<PhoneConts> getPhoneConts() {
        return phoneConts;
    }

    public void setPhoneConts(List<PhoneConts> phoneConts) {
        this.phoneConts = phoneConts;
    }
}

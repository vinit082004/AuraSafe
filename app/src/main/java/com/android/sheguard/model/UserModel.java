package com.android.sheguard.model;

@SuppressWarnings("unused")
public class UserModel {

    String name, blood, email, phone;

    public UserModel(String name, String blood, String email, String phone) {
        this.name = name;
        this.blood = blood;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setBlood(String name) {
        this.name = name;
    }

    public String getBlood() {
        return blood;
    }

    public void setName(String blood) {
        this.blood = blood;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

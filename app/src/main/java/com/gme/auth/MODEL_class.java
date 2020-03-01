package com.gme.auth;

public class MODEL_class {
    private String FullName;
    private String phone;

    private MODEL_class(){}

    private MODEL_class(String FullName, String phone){

        this.FullName=FullName;
        this.phone=phone;
    }

    public String getFullName() {
        return FullName;
    }
    public String getPhone() {
        return phone;
    }
}

package com.example.a4hw3monthcontinents;

import java.io.Serializable;

public class Country implements Serializable {
    public String name;
    public String flag;

    public Country(String name, String flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}

package com.netwebx.hackerrank.generics;

/**
 * Created by apple on 2017/2/26.
 */
public class Pet {
    private String petName;
    public Pet() {

    }
    public Pet(String name) {
        petName = name;
    }

    public void setName(String name) {
        petName = name;
    }

    public String getName() {
        return petName;
    }
}

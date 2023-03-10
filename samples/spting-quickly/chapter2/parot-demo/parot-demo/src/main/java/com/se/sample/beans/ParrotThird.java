package com.se.sample.beans;

public class ParrotThird {

    private String name ;

    public ParrotThird() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParrotThird{" +
                "name='" + name + '\'' +
                '}';
    }
}

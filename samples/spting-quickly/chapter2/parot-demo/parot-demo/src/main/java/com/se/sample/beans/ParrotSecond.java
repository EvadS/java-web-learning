package com.se.sample.beans;

public class ParrotSecond {
    private String name;

    public ParrotSecond() {
    }

    public ParrotSecond(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParrotSecond{" +
                "name='" + name + '\'' +
                '}';
    }
}

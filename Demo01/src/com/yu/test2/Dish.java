package com.yu.test2;

public class Dish {
    private String name;
    private Boolean flag;
    private Integer num;

    public Dish() {
    }

    public Dish(String name, Boolean flag, Integer num) {
        this.name = name;
        this.flag = flag;
        this.num = num;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", flag=" + flag +
                ", num=" + num +
                '}';
    }
}

package com.itheima.bean;

import java.util.ArrayList;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
public class Pet {
    private int id;
    private String name;
    private ArrayList<String> skills;

    public Pet() {
    }

    public Pet(int id, String name, ArrayList<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    //@MyZhuJie("eat")
    public void eat() {
        System.out.println("eat.....");
    }

    public void drink() {
        System.out.println("drink.....");
    }

    //@MyZhuJie("sleep")
    public void sleep() {
        System.out.println("sleep.....");
    }


    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}

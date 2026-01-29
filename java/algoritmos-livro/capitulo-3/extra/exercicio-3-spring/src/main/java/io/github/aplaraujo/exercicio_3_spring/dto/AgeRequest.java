package io.github.aplaraujo.exercicio_3_spring.dto;

public class AgeRequest {
    private String name1;
    private int age1;
    private String name2;
    private int age2;

    public AgeRequest(String name1, int age1, String name2, int age2) {
        this.name1 = name1;
        this.age1 = age1;
        this.name2 = name2;
        this.age2 = age2;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }
}

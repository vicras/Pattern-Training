package com.company.model;

public class Person implements PersonInterface {
    String interest;
    String name;
    String gender;
    int hotOrNot;
    int markCounter;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getInterest() {
        return interest;
    }

    @Override
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getHotOrNot() {
        if(markCounter == 0 ) return 0;
        return hotOrNot/markCounter;
    }

    @Override
    public void setHotOrNot(int hotOrNot) {
        this.hotOrNot += hotOrNot;
        markCounter++;
    }
}

package org.example;

import java.util.ArrayList;

public class CodeGeneration {

    private int age;
    private ArrayList<String> names;
    private enum emotionalState {
        HAPPY, ECSTATIC, SAD, ANGRY
    }

    public CodeGeneration(int age, ArrayList<String> names){
        this.age = age;
        this.names = names;

    }

    public CodeGeneration(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }
}

package com.wjnovoa.herencia;

public class Student extends Person {
    private double score;
    private String school;

    public Student(String name, int edad, double score, String school) {
        super(name, edad);
        this.score = score;
        this.school = school;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void showInfo(){
        System.out.println("Nombre: "+getName());
        System.out.println("edad: "+getEdad());
        System.out.println("Score: "+score);
        System.out.println(("School: "+getSchool()));
    }
}

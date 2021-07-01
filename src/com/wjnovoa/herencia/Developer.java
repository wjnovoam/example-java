package com.wjnovoa.herencia;

public class Developer extends Person {

    private double salary;
    private String company;

    public Developer(String name, int edad, double salary, String company) {
        super(name, edad);
        this.salary = salary;
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void showInfo(){
        System.out.println("Nombre: "+getName());
        System.out.println("edad: "+getEdad());
        System.out.println("Salary: "+salary);
        System.out.println(("Company: "+getCompany()));
    }
}

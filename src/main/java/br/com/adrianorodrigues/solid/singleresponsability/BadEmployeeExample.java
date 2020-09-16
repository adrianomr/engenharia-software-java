package br.com.adrianorodrigues.solid.singleresponsability;

public class BadEmployeeExample {
    /*
    This is a bad example
    It shows what we try to avoid with Single Responsibility Principle
    It's bad because it mixes employee business logic and database persistence logic
    It difficulties reading code and can result into a fat class
     */
    private Integer id;
    private String name;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void salva() {
        //implements some databese persistence logic
    }
}

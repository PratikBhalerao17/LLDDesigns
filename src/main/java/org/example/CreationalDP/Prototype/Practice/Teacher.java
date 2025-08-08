package org.example.CreationalDP.Prototype.Practice;

public class Teacher implements Prototype<Teacher> {

    private String name;
    private String schoolName;
    private String subject;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Teacher(){

    }

    public Teacher(Teacher t) {
        this.name = t.name;
        this.schoolName = t.schoolName;
        this.subject = t.subject;
        this.age = t.age;
        this.salary = t.salary;
    }

    @Override
    public Teacher clone() {
        return new Teacher(this);
    }
}

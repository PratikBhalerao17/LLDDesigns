package org.example.CreationalDP.Prototype;

public class Student implements Prototype<Student>{
    private String name;
    private String univName;
    private float PSP;
    private String batch;
    private String currentTopic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public float getPSP() {
        return PSP;
    }

    public void setPSP(float PSP) {
        this.PSP = PSP;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCurrentTopic() {
        return currentTopic;
    }

    public void setCurrentTopic(String currentTopic) {
        this.currentTopic = currentTopic;
    }

    public Student(Student student) {
        this.name = student.name;
        this.univName = student.univName;
        this.PSP = student.PSP;
        this.batch = student.batch;
        this.currentTopic = student.currentTopic;
    }

    public Student(){

    }

    @Override
    public Student clone() {
        //inside this method we need to copy the object attributes
        return new Student(this);
    }
}

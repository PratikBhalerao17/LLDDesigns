package org.example.CreationalDP.Builder.Practice;

public class Student {
    String Name;
    String Univ;
    double PSP;
    int age;

    //Now we will create a static method to create builder class
    public static Builder getBuilder(){
        return new Builder();
    }

    //Now we will create the constructor of Student which takes the builder object and which is private to prevent from access from outside.
    private Student(Builder builder){
        this.age = builder.getAge();
        this.Name = builder.getName();
        this.PSP = builder.getPSP();
        this.Univ = builder.getUniv();
    }

    //We need builder method for that we create class

    public static class Builder{
        private String Name;
        private String Univ;
        private double PSP;
        private int age;

        public String getName() {
            return Name;
        }

        public Builder setName(String name) {
            Name = name;
            return this;
        }

        public String getUniv() {
            return Univ;
        }

        public Builder setUniv(String univ) {
            Univ = univ;
            return this;
        }

        public double getPSP() {
            return PSP;
        }

        public Builder setPSP(double PSP) {
            this.PSP = PSP;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            if (this.age< 18)
                throw new RuntimeException("Age must ne greater than 18");

            return new Student(this);
        }
    }
}

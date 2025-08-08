package org.example.CreationalDP.Builder;

public class Student {
    String Name;
    String UnivName;
    String Batch;
    int age;
    double PSP;

    private Student(Builder builder) {
//        if (builder.getAge() < 18)
//            throw new RuntimeException("Age need to be above 18");
        this.age = builder.getAge();
        this.Name = builder.getName();
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {
        private String Name;
        private String UnivName;
        private String Batch;
        private int age;
        private double PSP;

        public String getName() {
            return Name;
        }

        public String getUnivName() {
            return UnivName;
        }

        public String getBatch() {
            return Batch;
        }

        public int getAge() {
            return age;
        }

        public double getPSP() {
            return PSP;
        }

        public Builder setName(String name) {
            Name = name;
            return this;

        }

        public Builder setUnivName(String univName) {
            UnivName = univName;
            return this;

        }

        public Builder setBatch(String batch) {
            Batch = batch;
            return this;

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPSP(double PSP) {
            this.PSP = PSP;
            return this;

        }

    public Student buildStudent(){
        if (this.getAge() < 18)
            throw new RuntimeException("Age need to be above 18");

        return new Student(this);
    }

    }

}


package org.example.CreationalDP.Builder.Practice;

public class Client {
    public static void main(String[] args) {
        Student obj = Student.getBuilder()
                .setAge(26)
                .setName("Pratik")
                .setPSP(88.8)
                .setUniv("MU")
                .build();

        System.out.println(obj.age);
    }
}

package org.example.CreationalDP.Builder;


public class Main {
    public static void main(String[] args) {
//        Student.Builder builder = Student.getBuilder();
//        builder.setAge(25);
//        builder.setBatch("Evening");
//        builder.setName("Pratik");
//        builder.setPSP(98.9);
//        System.out.println(builder);
//
//        Student st = builder.buildStudent();
//        System.out.println(st.age);

        Student obj = Student.getBuilder()
                .setAge(25)
                .setBatch("Evening")
                .setName("Pratik")
                .setPSP(98.9)
                .setUnivName("MU")
                .buildStudent();

        System.out.println(obj.age);



    }
}

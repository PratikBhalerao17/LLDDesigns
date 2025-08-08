package org.example.CreationalDP.Prototype;

public class Client {
    private static void createStudentRegistry(StudentRegistry studentRegistry){
        Student st = new Student();

        st.setBatch("May2025");
        st.setCurrentTopic("LLD");
        st.setUnivName("Scaler");

        studentRegistry.register("May25LLD",st);

        Student st2 = new Student();
        st.setBatch("JULY2026");
        st.setCurrentTopic("HLD");
        st.setUnivName("Scaler");

        studentRegistry.register("July26LLD",st);

    }
    public static void main(String[] args) {
        // We are creating the registry object without exposing it to client
        StudentRegistry studentRegistry = StudentRegistry.registryObject();
        createStudentRegistry(studentRegistry);



        Student st3 = studentRegistry.get("May25LLD").clone();
        st3.setName("Pratik");

        System.out.println(st3.getCurrentTopic());
        System.out.println(st3.getBatch());
        System.out.println(st3.getName());
        System.out.println(st3.getPSP());


        Student st4 = studentRegistry.get("July26LLD").clone();
        st4.setName("Avinash");
        st4.setPSP((float)98.8);
        st4.setBatch("Evening");

        System.out.println(st4.getCurrentTopic());
        System.out.println(st4.getBatch());
        System.out.println(st4.getName());
        System.out.println(st4.getPSP());





    }
}

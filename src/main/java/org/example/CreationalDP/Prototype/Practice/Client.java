package org.example.CreationalDP.Prototype.Practice;

public class Client {
    private static void createRegistry(TeacherRegistry registry){
        Teacher t1 = new Teacher();
        t1.setSalary(25000);
        t1.setSchoolName("ViMEET");
        t1.setSubject("Physics");

        registry.register(registryNames.PHYSICSTEACHER,t1);

    }
    public static void main(String[] args) {
        TeacherRegistry registry = TeacherRegistry.getTeacherRegistryInstance();
        createRegistry(registry);

        Teacher t2 = registry.get(registryNames.PHYSICSTEACHER).clone();
        System.out.println(t2.getSubject());
        System.out.println(t2.getSalary());
        System.out.println(t2.getSchoolName());

    }
}

package org.example.CreationalDP.Prototype;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String,Student> map = new HashMap<>();

    public void register(String key,Student student){
        map.put(key,student);
    }

    public Student get(String key){
        return map.get(key);
    }

    //let's create one more method for static object of StudentRegistry as we don't want to create it outside the class

    public static StudentRegistry registryObject(){
        return new StudentRegistry();
    }

}

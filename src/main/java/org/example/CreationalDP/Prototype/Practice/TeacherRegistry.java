package org.example.CreationalDP.Prototype.Practice;

import java.util.HashMap;

public class TeacherRegistry {
    private HashMap<registryNames,Teacher> map = new HashMap<>();

    public void register(registryNames key,Teacher teacher){
        map.put(key,teacher);
    }

    public Teacher get(registryNames key){
        return map.get(key);
    }

    public static TeacherRegistry getTeacherRegistryInstance(){
        return new TeacherRegistry();
    }
}

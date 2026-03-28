package org.practice.designPatterns.creational.singleton;

/*
    Singleton → ensures only one instance of a class exists (like a global configuration manager).
 */

public class ConfigManager {
     private static volatile ConfigManager instance;

     private ConfigManager(){}

     public static ConfigManager getInstance() {
         if(instance == null){
             synchronized (ConfigManager.class){  //double-checking lock
                 if(instance == null){
                     instance = new ConfigManager();
                 }
             }
         }
         return instance;
     }
}

package org.practice.designPatterns.creational.factory;

public interface OS {
   void specs();
}

class IOS implements OS{
    public void specs(){
        System.out.println("Apple OS");
    }
}

class Android implements OS{
    public void specs(){
        System.out.println("Android OS");
    }
}

class Windows implements OS{
    public void specs(){
        System.out.println("Windows");
    }
}

class OperatingSystemFactory{
    public OS getInstance(String value){
        if(value.equals("Open")){
            return new Android();
        } else if (value.equals("Closed")){
            return new IOS();
        } else {
            return new Windows();
        }
    }
}

class OSMain{
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS os = osf.getInstance("Open");
        os.specs();
    }
}

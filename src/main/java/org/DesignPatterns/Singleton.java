package org.DesignPatterns;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton private constructor");
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void doSomething(){
        System.out.println("do something");
    }
}

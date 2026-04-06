package dev.learning.creational.singleton;

public class Driver {
    static void main() {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.hashCode());;

        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());
    }
}

package dev.learning.creational.singleton;

public class Driver {
    static void main() {
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());;

        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());
        // both Singleton variables refer to the same Object
    }
}

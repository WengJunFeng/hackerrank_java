package com.netwebx.hackerrank.generics;

/**
 * Created by apple on 2017/2/26.
 */
public class Test1 {
    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<Pet>(new Dog("The Dog Class extended from PET"));
        System.out.println(h3.get().getName());

        Holder3<Dog> h3sub = new Holder3<Dog>(new SpottedDog("This is sub class of Dog"));
        System.out.println(h3sub.get().getName());
    }
}

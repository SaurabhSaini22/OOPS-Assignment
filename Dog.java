package com.inheritance;
public class Dog
{
    public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.speak();
        Beagle b = new Beagle();
        b.speak();
    }
}

class Beagle extends Dog
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}

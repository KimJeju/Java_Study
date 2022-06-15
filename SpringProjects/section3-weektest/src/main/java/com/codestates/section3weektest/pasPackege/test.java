package com.codestates.section3weektest.pasPackege;

public class test {
    public static void main(String[] args) {

        Child newBornBaby = new NewBornBaby();
        Child toddler = new Toddler();

        newBornBaby.cry();
        toddler.cry();
    }




}

abstract class Child{
    private String name;
    private double weight;
    private double height;
    private int age;

    protected abstract void smile();

    protected abstract void cry();

    protected abstract void sleep();

    protected abstract void eat();
}

class NewBornBaby extends Child {
    @Override
    protected void cry() {
        System.out.println("신생아 : 으앵");
    }

    @Override
    protected void smile(){
        System.out.println("마냥 웃어요");
    }

    @Override
    protected void sleep(){
        System.out.println("자고싶을 때 자요");
    }

    @Override
    protected void eat(){
        System.out.println("이유식 먹어요");
    }

}

class Toddler extends Child {
    @Override
    protected void cry(){
        System.out.println("아");
    }

    @Override
    protected void smile(){
        System.out.println("열심히하자");
    }

    @Override
    protected void sleep(){
        System.out.println("개발은");
    }

    @Override
    protected void eat(){
        System.out.println("it 건설업..");
    }
}


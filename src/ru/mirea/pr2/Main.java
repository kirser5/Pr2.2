package ru.mirea.pr2;

public class Main {
    public static void main(String[] args){
        Ball b1=new Ball(1.0,1.0);
        System.out.println(b1);
        b1.move(5.0,6.0);
        System.out.println(b1);
    }
}

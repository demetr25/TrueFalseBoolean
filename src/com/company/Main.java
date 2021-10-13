package com.company;

public class Main {

    public static void main(String[] args) {
        boolean t1 = 10>5;
        boolean t2 = 5>6;
        boolean t3 = 7>2;
        System.out.println(!t1 || t2 && t3); // если && то если один фолс то все выражение фолс; если || то если один true то все true
        // ! делает reverse !false => true; !true => false
    }
}
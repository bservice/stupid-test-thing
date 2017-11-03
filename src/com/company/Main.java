package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine();
        System.out.println("I don't know what to do");
        Code myster = new Code(word);
        myster.hide(1,3);
        System.out.println(myster.getCode());
        myster.recover(1,3);
        System.out.println(myster.getCode());
    }
}

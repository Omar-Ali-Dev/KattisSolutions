package org.example;

import java.util.Scanner;

public class completedSolutions {
    public void Aaaah(){
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            if (s.next().length() >= s.next().length()){
                System.out.println("go");
            }else {
                System.out.println("no");
            }
        }
    }
    public  void AlphabetSpam(){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char [] b = a.toCharArray();
        float upperCase = 0;
        float lowerCase = 0;
        float underLine = 0;
        float symbol = 0;

        for (char c : b) {
            if (Character.isUpperCase(c)) {
                upperCase += 1;
            } else if (Character.isLowerCase(c)) {
                lowerCase += 1;
            } else if (c == '_') {
                underLine += 1;
            } else {
                symbol += 1;
            }
        }
        float e = b.length;
        float d = upperCase/e;
        float h = lowerCase/e;
        float f = underLine/e;
        float g = symbol/e;
        System.out.println(f);
        System.out.println(h);
        System.out.println(d);
        System.out.println(g);
    }
    public  void AddTwoNumbers(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        System.out.println( a + b );
    }
    public  void HelloWorld(){
        System.out.println("Hello world!");
    }
}

package com.company;

public class AsciiChars {
    public static void printNumbers()
    {
        System.out.print("Valid numbers: ");
        for(char ch=48; ch<58; ch++) {
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }

    public static void printLowerCase()
    {
        System.out.print("Valid lowercase characters: ");
        for(char ch=97; ch<123; ch++) {
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }

    public static void printUpperCase()
    {
        System.out.print("Valid uppercase characters: ");
        for(char ch=65; ch<91; ch++) {
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }
}

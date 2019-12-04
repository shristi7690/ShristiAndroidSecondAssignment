package com.example.secondassignment.Class;

public class Reverse {
    private String someString, reverseString = "";

    public Reverse(String someString) {
        this.someString = someString;
    }

    public String reverseNumber() {
        int length = someString.length();

        for (int i = length - 1; i >= 0; i--) {
            this.reverseString = this.reverseString + this.someString.charAt(i);
        }
        return this.reverseString;
    }
}

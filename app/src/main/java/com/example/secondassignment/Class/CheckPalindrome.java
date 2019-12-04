package com.example.secondassignment.Class;

public class CheckPalindrome {
    private String someString, reverseString = "";

    public CheckPalindrome(String someString) {
        this.someString = someString;
    }

    public boolean check() {
        int length = someString.length();

        for (int i = length - 1; i >= 0; i--) {
            this.reverseString = this.reverseString + this.someString.charAt(i);
        }

        if (this.someString.equals(this.reverseString)) {
            return true;
        }
        else {
            return false;
        }
    }
}

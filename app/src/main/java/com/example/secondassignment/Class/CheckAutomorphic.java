package com.example.secondassignment.Class;

public class CheckAutomorphic {
    int number;
    int squareNumber;

    public CheckAutomorphic(int number) {
        this.number = number;
        this.squareNumber = number * number;
    }

    public boolean checkAutomorphic() {
        String str_num = Integer.toString(this.number);
        String square = Integer.toString(this.squareNumber);

        if(square.endsWith(str_num))
            return true;
        else
            return false;
    }
}

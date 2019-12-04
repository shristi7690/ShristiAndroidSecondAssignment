package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.Fragment.AutomorphicFragment;
import com.example.secondassignment.Fragment.CircleFragment;
import com.example.secondassignment.Fragment.PalindromeFragment;
import com.example.secondassignment.Fragment.ReverseNumberFragment;
import com.example.secondassignment.Fragment.ReverseStringFragment;
import com.example.secondassignment.Fragment.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSum, btnAreaOfCircle, btnAutomorphic, btnPalindrome, btnReverseString, btnReverseNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnSum = findViewById(R.id.btnSum);
        this.btnAreaOfCircle = findViewById(R.id.btnAreaOfCircle);
        this.btnAutomorphic = findViewById(R.id.btnAutomorphic);
        this.btnPalindrome = findViewById(R.id.btnPalindrome);
        this.btnReverseString = findViewById(R.id.btnReverseString);
        this.btnReverseNumber = findViewById(R.id.btnReverseNumber);

        this.btnSum.setOnClickListener(this);
        this.btnAreaOfCircle.setOnClickListener(this);
        this.btnAutomorphic.setOnClickListener(this);
        this.btnPalindrome.setOnClickListener(this);
        this.btnReverseString.setOnClickListener(this);
        this.btnReverseNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnSum:
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, sumFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnAreaOfCircle:
                CircleFragment circleFragment = new CircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, circleFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnAutomorphic:
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnReverseString:
                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseStringFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnReverseNumber:
                ReverseNumberFragment reverseNumberFragment = new ReverseNumberFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseNumberFragment);
                fragmentTransaction.commit();
                break;
        }
    }
}

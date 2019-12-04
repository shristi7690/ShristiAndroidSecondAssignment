package com.example.secondassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.Class.CheckPalindrome;
import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromeFragment extends Fragment {
    EditText etNumber;
    Button check;
    TextView txtResult;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        this.bindProperties(view);
        this.configureListeners();

        return view;
    }

    private void bindProperties(View view) {
        this.etNumber = view.findViewById(R.id.etNumber);
        this.check = view.findViewById(R.id.btnCheck);
        this.txtResult = view.findViewById(R.id.txtResult);
    }

    private void configureListeners() {
        this.check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "";
                boolean isPalindrome;

                try {
                    number = etNumber.getText().toString();
                }
                catch(Exception error) {
                    etNumber.setError("Invalid number!");
                }

                CheckPalindrome checkPalindrome = new CheckPalindrome(number);
                isPalindrome = checkPalindrome.check();
                if (isPalindrome) {
                    txtResult.setText("The number is Palindrome");
                }
                else {
                    txtResult.setText("The provided number is not Palindrome");
                }
            }
        });
    }

}

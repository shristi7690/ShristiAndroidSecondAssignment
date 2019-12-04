package com.example.secondassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.Class.Reverse;
import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseNumberFragment extends Fragment {
    EditText etNumber;
    Button btnReverse;
    TextView txtResult;

    public ReverseNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_number, container, false);

        this.bindProperties(view);
        this.configureListeners();

        return view;
    }

    private void bindProperties(View view) {
        this.etNumber = view.findViewById(R.id.etNumber);
        this.btnReverse = view.findViewById(R.id.btnReverse);
        this.txtResult = view.findViewById(R.id.txtResult);
    }

    private void configureListeners() {
        this.btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "";

                try {
                    number = etNumber.getText().toString();
                }
                catch(Exception error) {
                    etNumber.setError("Invalid number!");
                }

                Reverse reverse = new Reverse(number);
                txtResult.setText(String.valueOf(reverse.reverseNumber()));
            }
        });
    }

}

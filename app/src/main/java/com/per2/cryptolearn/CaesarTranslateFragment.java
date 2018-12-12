package com.per2.cryptolearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CaesarTranslateFragment extends android.support.v4.app.Fragment implements View.OnClickListener{
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonTranslate;
    private EditText editTextInput;
    private TextView textViewShift;
    private TextView textViewOutput;
    private int shiftNum = 0;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_binary_translate, container, false);
        wireWidgets(rootView);
        setListeners();
        textViewShift.setText(shiftNum);
        return rootView;
    }

    private void setListeners() {
        buttonTranslate.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
    }

    private void wireWidgets(View view) {
        buttonMinus = view.findViewById(R.id.button_caesarTranslate_minus);
        buttonPlus = view.findViewById(R.id.button_caesarTranslate_plus);
        editTextInput = view.findViewById(R.id.edittext_caesarTranslate_input);
        textViewShift = view.findViewById(R.id.textview_caesarTranslate_shiftnum);
        buttonTranslate = view.findViewById(R.id.button_caesarTranslate_translate);
        textViewOutput = view.findViewById(R.id.textview_caesarTranslate_output);
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_caesarTranslate_translate:
                translate(editTextInput.getText().toString());
                break;
            case R.id.button_caesarTranslate_minus:
                increaseShift();
                break;
            case R.id.button_caesarTranslate_plus:
                decreaseShift();
                break;
        }
    }

    private void decreaseShift() {
        if(shiftNum!=0){
            shiftNum--;
        }
        else{
            shiftNum=0;
        }

    }

    private void increaseShift() {
        if(shiftNum<=25){
            shiftNum++;
        }
        else{
            shiftNum=25;
        }
    }

    private void translate(String s) {
    }
}

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

import java.lang.reflect.Array;

public class binaryTranslateFragment extends android.support.v4.app.Fragment implements View.OnClickListener{
    private Button buttonTranslate;
    private TextView textViewOutput;
    private EditText editTextInput;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_binary_translate, container, false);
        wireWidgets(rootView);
        setListeners();
        return rootView;
    }

    private void setListeners() {
        buttonTranslate.setOnClickListener(this);
    }

    private void wireWidgets(View view) {
        buttonTranslate = view.findViewById(R.id.button_binaryTranslate_translate);
        editTextInput = view.findViewById(R.id.editText_binaryTranslate_input);
        textViewOutput = view.findViewById(R.id.textView_binaryTranslate_output);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_binaryTranslate_translate:
                translate(editTextInput.getText().toString());
                break;

        }
    }

    private void translate(String phrase) {
        byte[] bytes = phrase.getBytes();
        textViewOutput.setText(bytes.toString());
    }
}

package com.per2.cryptolearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CaesarFragment extends android.support.v4.app.Fragment implements View.OnClickListener{
    private Button buttonLearn;
    private Button buttonTranslate;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_caesar, container, false);
        wireWidgets(rootView);
        setListeners();
        return rootView;
    }

    private void setListeners() {
        buttonTranslate.setOnClickListener(this);
        buttonLearn.setOnClickListener(this);
    }

    private void wireWidgets(View view) {
        buttonLearn = view.findViewById(R.id.button_caesar_learn);
        buttonTranslate = view.findViewById(R.id.button_caesar_translate);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Fragment newFragment = null;
        if(id==R.id.button_caesar_learn){
            newFragment = new CaesarLearnFragment();
        }
        else if(id==R.id.button_caesar_translate){
            newFragment = new CaesarTranslateFragment();
        }

        if(newFragment!= null){
            FragmentManager fm = getActivity().getSupportFragmentManager();
            //in the builder pattern, you can keep calling
            //methods in a row because it returns the same
            //data type. Before the commit, we could
            //set the transition, change the back stack, etc
            fm.beginTransaction()
                    .replace(R.id.container_main, newFragment).addToBackStack(null)
                    .commit();
        }
    }
}

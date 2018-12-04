package com.per2.cryptolearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BinaryFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    private Button learnButton;
    private Button translateButton;
    private Button practiceButton;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_binary, container, false);
        wireWidgets(rootView);
        setListeners();
        return rootView;
    }

    private void setListeners() {
        learnButton.setOnClickListener(this);
        translateButton.setOnClickListener(this);
        practiceButton.setOnClickListener(this);
    }
    private void wireWidgets(View view){
        learnButton = view.findViewById(R.id.button_binary_learn);
        translateButton = view.findViewById(R.id.button_binary_translate);
        practiceButton = view.findViewById(R.id.button_binary_practice);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Fragment newFragment = null;
        if(id==R.id.button_binary_practice){
            newFragment = new binaryPracticeFragment();
        }
        else if(id==R.id.button_binary_translate){
            newFragment = new binaryTranslateFragment();
        }
        else if(id==R.id.button_binary_learn){
            newFragment = new binaryLearnFragment();
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

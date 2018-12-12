package com.per2.cryptolearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BinaryLearnFragment extends android.support.v4.app.Fragment {
    private TextView article;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_binary_learn, container, false);
        wireWidgets(rootView);
        return rootView;
    }

    public void wireWidgets(View view)
    {
        article = view.findViewById(R.id.textView_main_article);
    }
}

package com.per2.cryptolearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WelcomeFragment extends Fragment {
    private TextView welcome;
    private TextView usesTitle;
    private TextView uses;
    private TextView missionTitle;
    private TextView mission;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);
        wireWidgets(rootView);
        rootView.setBackgroundColor(100);
        return rootView;
    }

    private void wireWidgets(View rootView) {
        welcome = rootView.findViewById(R.id.textview_welcome_welcome);
        usesTitle = rootView.findViewById(R.id.textview_welcome_uses);
        uses = rootView.findViewById(R.id.textview_welcome_whattododesc);
        mission = rootView.findViewById(R.id.textview_welcome_ourmissiondesc);
        missionTitle = rootView.findViewById(R.id.textview_welcome_ourmission);
    }
}

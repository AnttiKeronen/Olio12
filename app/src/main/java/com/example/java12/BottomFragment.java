package com.example.java12;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment {
    private TextView textImportant;

    public BottomFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        textImportant = view.findViewById(R.id.viewArea);

        return view;
    }

    public void updateImportant(String importantText) {
        textImportant.setText(importantText);
    }
}

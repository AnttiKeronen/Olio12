package com.example.java12;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListGroceryFragment extends Fragment {
    private RecyclerView rvGroceries;
    private GroceryListAdapter adapter;

    public ListGroceryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_grocery, container, false);

        rvGroceries = view.findViewById(R.id.rvGroceries);
        adapter = new GroceryListAdapter(getContext());
        rvGroceries.setAdapter(adapter);
        rvGroceries.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}


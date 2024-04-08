package com.example.java12;

// GroceryListAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {
    private final Context context;
    private final List<Grocery> groceries;

    public GroceryListAdapter(Context context) {
        this.context = context;
        groceries = ListGrocery.getInstance().getGroceries();
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_grocery, parent, false);
        return new GroceryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        Grocery grocery = groceries.get(position);
        holder.textGroceryName.setText(grocery.getName());
        holder.textGroceryNote.setText(grocery.getNote());
    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }
}


package sg.edu.rp.c346.id19045083.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> ToDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.ToDoList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvToDo = rowView.findViewById(R.id.textViewToDo);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position
        ToDoItem currentToDo = ToDoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvToDo.setText(currentToDo.getTitle());
        tvDate.setText(currentToDo.toString());

        return rowView;
    }
}

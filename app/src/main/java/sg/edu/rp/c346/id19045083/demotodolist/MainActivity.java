package sg.edu.rp.c346.id19045083.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle;
    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.textViewTitle);
        lvToDo = findViewById(R.id.ListViewToDo);

        alToDoList = new ArrayList<ToDoItem>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8, 2);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        alToDoList.add(item1);
        alToDoList.add(new ToDoItem("Go for haircut", date2));

        caToDo = new CustomAdapter(MainActivity.this, R.layout.row, alToDoList);
        lvToDo.setAdapter(caToDo);
    }
}
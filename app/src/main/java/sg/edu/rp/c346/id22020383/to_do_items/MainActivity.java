package sg.edu.rp.c346.id22020383.to_do_items;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoList;
    Button btnAddItem;
    ArrayList<ToDoItem> toDoItems = new ArrayList<>();
    ArrayAdapter<ToDoItem> lvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDoList = findViewById(R.id.lvToDoList);

        // Sample data to display in the list
        toDoItems.add(new ToDoItem("Buy groceries", Calendar.getInstance()));
        toDoItems.add(new ToDoItem("Finish project", Calendar.getInstance()));

        lvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, toDoItems);
        lvToDoList.setAdapter(lvAdapter);

    }
}
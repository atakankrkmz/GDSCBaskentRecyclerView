package tech.otokon.gdscdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tech.otokon.gdscdemo.adapter.MyAdapter;
import tech.otokon.gdscdemo.model.Todo;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTodoList;
    List<Todo> todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTodoList = findViewById(R.id.rvTodoList);

        todoList = new ArrayList<>();

        todoList.add(new Todo("Android Kursuna Git", "GDSC kursu", true));
        todoList.add(new Todo("Markete Git", "GDSC kursu", false));
        todoList.add(new Todo("Kitap Oku", "GDSC kursu", false));
        todoList.add(new Todo("Dişini Fırçala", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));
        todoList.add(new Todo("Arabanı Yıka", "GDSC kursu", false));


        MyAdapter adapter = new MyAdapter(todoList);
        rvTodoList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvTodoList.setAdapter(adapter);
    }
}
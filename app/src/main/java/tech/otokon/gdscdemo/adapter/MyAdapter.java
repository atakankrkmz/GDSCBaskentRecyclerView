package tech.otokon.gdscdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tech.otokon.gdscdemo.R;
import tech.otokon.gdscdemo.model.Todo;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<Todo> todoList;

    public MyAdapter(List<Todo> todoList) {
        this.todoList = todoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Todo todo = todoList.get(position);

        holder.tvTask.setText(todo.task);
        holder.tvDescription.setText(todo.description);
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvTask, tvDescription;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTask = itemView.findViewById(R.id.tvTask);
            tvDescription = itemView.findViewById(R.id.tvDescription);
        }
    }
}

package com.thisisabir.mvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.thisisabir.mvvm.R;
import com.thisisabir.mvvm.model.Student;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.Holder>{


    private List<Student> studentList;
    private Context context;

    public StudentAdapter(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Picasso.with(context).load(studentList.get(position).getImageurl()).placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher_round).into(holder.image);
        holder.name.setText(studentList.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class Holder extends RecyclerView.ViewHolder
    {
        TextView name;
        CircleImageView image;


        Holder(View fview)
        {
            super(fview);
            name = fview.findViewById(R.id.name);
            image = fview.findViewById(R.id.profile_image);
        }


    }
}

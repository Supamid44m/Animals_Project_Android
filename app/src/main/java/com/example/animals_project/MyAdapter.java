package com.example.animals_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.animals_project.model.Animal;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Animal> values;
    private Context context;


    public MyAdapter(List<Animal> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = (ImageView) v.findViewById(R.id.icon);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
        }
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Animal animal=values.get(position);
        holder.txtHeader.setText(animal.getAnimal_name());
        holder.txtFooter.setText(animal.getAnimal_name2());

        Glide.with(context)
                .load(animal.getAnimal_image())
                .into(holder.imgView);
        holder.imgView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, animal.getAnimal_name(), Toast.LENGTH_SHORT);
                Toast toast2 = Toast.makeText(context, "ประเภท:"+animal.getAnimal_type(), Toast.LENGTH_SHORT);
                Toast toast3 = Toast.makeText(context, "จำนวนที่เหลือในโลก:"+animal.getAnimal_pop()+"ตัว", Toast.LENGTH_SHORT);
                toast.show();
                toast2.show();
                toast3.show();



            }
        });
    }
    @Override
    public int getItemCount() {
        return values.size();
    }



}
package com.example.btrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecycelrView extends RecyclerView.Adapter<ModelRecycelrView.ViewHolder> {

    Context context;
    ArrayList<Model> arrayList = new ArrayList<>();

    public ModelRecycelrView(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView1.setText(arrayList.get(position).getName());
        holder.textView2.setText(arrayList.get(position).getDescribe());
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(context,MainActivity2.class);
//                context.startActivity(intent);
                Toast.makeText(context, "message" + position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("name", arrayList.get(position).getName());
                intent.putExtra("image", arrayList.get(position).getImage());
                intent.putExtra("describe", arrayList.get(position).getDescribe());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1, textView2;
        CardView cardView;

       public ViewHolder (@NonNull View itemView){
           super(itemView);

           imageView = itemView.findViewById(R.id.imageview);
           textView1 = itemView.findViewById(R.id.name);
           textView2 = itemView.findViewById(R.id.describe);
           cardView = itemView.findViewById(R.id.cardView);
       }
    }





}

package com.example.myselfapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/*
Fadli Adhitia Mahardika
10120237
IF6
10 - 06 - 2023 - 16:00
*/

public class GalleryRvAdapter extends RecyclerView.Adapter<GalleryRvAdapter.GalleryViewHolder> {

    ArrayList<GalleryModel> dataHolder3;

    public GalleryRvAdapter(ArrayList<GalleryModel> dataHolder3) {
        this.dataHolder3 = dataHolder3;
    }

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item,parent,false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder3, int position) {

        holder3.img3.setImageResource(dataHolder3.get(position).getImg3());

    }

    @Override
    public int getItemCount() {
        return dataHolder3.size();
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder{

        ImageView img3;

        public GalleryViewHolder(@NonNull View itemView) {
            super(itemView);
            img3 = itemView.findViewById(R.id.gallery_image);
        }
    }

}

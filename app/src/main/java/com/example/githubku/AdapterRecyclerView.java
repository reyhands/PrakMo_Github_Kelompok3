package com.example.githubku;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.widget.Toast;
import com.example.githubku.model.*;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

       List<repository> mrepository ;
        private Context context;
        private Bundle bundle;
        private ItemDetail itemdetail;


        AdapterRecyclerView(Context context1, List <repository> repositoryList) {

            mrepository = repositoryList;
            context = context1;
        }

        static class ViewHolder extends RecyclerView.ViewHolder {

            TextView Judul;
            TextView Deskripsi;
            TextView Date;
            ImageView Gambar;
            LinearLayout listdata;


            ViewHolder(View v) {

                super(v);

                Judul = v.findViewById(R.id.Judul);
                Deskripsi = v.findViewById(R.id.deksripsi);
                Date = v.findViewById(R.id.tanggal);
                Gambar = v.findViewById(R.id.imageview);
                listdata = v.findViewById(R.id.listitem);



            }
        }

        @NonNull
        @Override
        public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.item_row,parent, false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            holder.Judul.setText(mrepository.get(position).getNama());

            holder.listdata.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context = v.getContext();
                    System.out.println("asu");

                    Intent intent = new Intent(context, com.example.githubku.ItemDetail.class);
                    //context.startActivity();

                    context.startActivity(intent);
                    //context.startActivity(Intent.createChooser(intent, "Send To"));

                }
            });


        }

        @Override
        public int getItemCount() {

            return mrepository.size();
        }
    }


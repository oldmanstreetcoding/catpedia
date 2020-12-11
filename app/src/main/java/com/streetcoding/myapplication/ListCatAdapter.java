package com.streetcoding.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCatAdapter extends RecyclerView.Adapter<ListCatAdapter.ListViewHolder> {
    private ArrayList<Cats> listCat;

    public ListCatAdapter(ArrayList<Cats> list) {
        this.listCat = list;
    }

    private OnDetilBtnClickCallback onDetilBtnClickCallback;
    public void setOnDetilBtnClickCallback(OnDetilBtnClickCallback onDetilBtnClickCallback) {
        this.onDetilBtnClickCallback = onDetilBtnClickCallback;
    }

    private OnShareBtnClickCallback onShareBtnClickCallback;
    public void setOnShareBtnClickCallback(OnShareBtnClickCallback onShareBtnClickCallback) {
        this.onShareBtnClickCallback = onShareBtnClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_cat, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Cats cats = listCat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cats.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(cats.getName());
        holder.tvDetail.setText(cats.getDetail());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDetilBtnClickCallback.onDetilBtnClicked(listCat.get(holder.getAdapterPosition()));
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onShareBtnClickCallback.onShareBtnClicked(listCat.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCat.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnDetail, btnShare;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btn_set_detil);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }

    public interface OnDetilBtnClickCallback {
        void onDetilBtnClicked(Cats data);
    }

    public interface OnShareBtnClickCallback {
        void onShareBtnClicked(Cats data);
    }
}

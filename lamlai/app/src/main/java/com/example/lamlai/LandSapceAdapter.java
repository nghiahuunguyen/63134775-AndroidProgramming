package com.example.lamlai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandSapceAdapter extends RecyclerView.Adapter<LandSapceAdapter.ItemLand> {
    Context context;
    ArrayList<LandSapce>list;

    public LandSapceAdapter(Context context, ArrayList<LandSapce> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ItemLand onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_land,parent,false);
        return new ItemLand(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLand holder, int position) {
        LandSapce landScapehienthi = list.get(position);
        String caption = landScapehienthi.getLandCaption();
        String tenAnh = landScapehienthi.getLandImageFileName();

        holder.tvCaption.setText(caption);
        int imageID = context.getResources().getIdentifier(tenAnh, "mipmap", context.getPackageName());
        holder.ivLandSapce.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ItemLand extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandSapce;

        public ItemLand(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandSapce = itemView.findViewById(R.id.imageViewLand);
        }
    }
}

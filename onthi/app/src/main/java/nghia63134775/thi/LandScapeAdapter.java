package nghia63134775.thi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lsData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lsData) {
        this.context = context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vItem = LayoutInflater.from(context).inflate(R.layout.item_land, parent, false);
        return new ItemLandHolder(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        LandScape landScapehienthi = lsData.get(position);
        String caption = landScapehienthi.getLandCaption();
        String tenAnh = landScapehienthi.getLandImageFileName();

        holder.tvCaption.setText(caption);
        int imageID = context.getResources().getIdentifier(tenAnh, "mipmap", context.getPackageName());
        holder.ivLandscape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int vitriduocclick=getAdapterPosition();
            LandScape phantuduocclick=lsData.get(vitriduocclick);
            //bóc thông tin
            String ten=phantuduocclick.getLandCaption();
            String tenfile=phantuduocclick.getLandImageFileName();
            //toast tên
            String chuoithongbao="Bạn vừa click vào "+ten;
            Toast.makeText(v.getContext(),chuoithongbao,Toast.LENGTH_SHORT).show();
        }
    }
}

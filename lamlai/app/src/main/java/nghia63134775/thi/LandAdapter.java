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

public class LandAdapter extends RecyclerView.Adapter<LandAdapter.Item> {
    Context context;
    ArrayList<Land> lsData;

    public LandAdapter(Context context, ArrayList<Land> lsData) {
        this.context = context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public Item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vItem = LayoutInflater.from(context).inflate(R.layout.item_land, parent, false);
        return new Item(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull Item holder, int position) {
        Land landScapehienthi = lsData.get(position);
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

    class Item extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLandscape;

        public Item(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int vitriduocclick=getAdapterPosition();
            Land phantuduocclick=lsData.get(vitriduocclick);
            //bóc thông tin
            String ten=phantuduocclick.getLandCaption();
            String tenfile=phantuduocclick.getLandImageFileName();
            //toast tên
            String chuoithongbao="Bạn vừa click vào "+ten;
            Toast.makeText(v.getContext(),chuoithongbao,Toast.LENGTH_SHORT).show();
        }
    }
}

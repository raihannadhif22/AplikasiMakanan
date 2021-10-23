package com.example.aplikasimakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.AdapterViewHolder> {
    Context context;
    List<ModelMenu> mList;

    public AdapterMenu(Context context, List<ModelMenu> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public AdapterMenu.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_row,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMenu.AdapterViewHolder holder, int position) {
        final ModelMenu list = mList.get(position);

        holder.tvTitle.setText(list.getNAMA_MAKANAN());
        holder.tvDesc.setText(list.getDESC_MAKANAN());
        holder.tvHarga.setText(""+list.getHARGA_MAKANAN());
        Glide.with(context).load(list.getIMAGE_MAKANAN()).into(holder.imageView);
        holder.divItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), DetailMenuActivity.class);
                intent.putExtra("extra_list",list);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvDesc, tvHarga;
        private ImageView imageView;
        private LinearLayout divItem;
        AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            imageView = itemView.findViewById(R.id.imageView);
            divItem = itemView.findViewById(R.id.divItem);

        }
    }

}



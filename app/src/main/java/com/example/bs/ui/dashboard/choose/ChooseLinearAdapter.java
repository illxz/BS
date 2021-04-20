package com.example.bs.ui.dashboard.choose;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bs.R;

import java.util.List;

public class ChooseLinearAdapter extends RecyclerView.Adapter<ChooseLinearAdapter.LinearViewHolder>{

    private Context mContext;
    private List<Option>  options;
    private LinearViewHolder viewHolder;
    public ChooseLinearAdapter(){ }
    public ChooseLinearAdapter(Context context,List<Option> options){
        this.mContext = context;
        this.options = options;
    }

    @NonNull
    @Override
    public LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        viewHolder = new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_choose,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder holder, int position) {
        Option option = options.get(position);
        holder.textView.setText(option.name);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"onClick..."+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return options==null?0:options.size();
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_choose);

        }
    }
}

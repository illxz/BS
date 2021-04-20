package com.example.bs.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bs.Books;
import com.example.bs.MainActivity;
import com.example.bs.R;

import java.util.LinkedList;
import java.util.List;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    private Context mContext;
    List<Books> list;
    public LinearAdapter(Context context, List<Books> list){
        this.mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_book,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, int position) {
        Books book = list.get(position);
        Glide.with(mContext).load(book.image).into(holder.imageBook);
      //  holder.imageBook.setImageResource(book.image);
        holder.textBookName.setText(book.book_name);
        holder.textName.setText(book.name);
        holder.textTime.setText(book.time);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { 
                Toast.makeText(mContext,"click..."+position,Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageBook;
        private TextView textBookName, textName, textTime;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageBook = itemView.findViewById(R.id.image_book);
            textBookName = itemView.findViewById(R.id.text_bookname);
            textName = itemView.findViewById(R.id.text_name);
            textTime = itemView.findViewById(R.id.text_time);
        }
    }
}

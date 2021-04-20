package com.example.bs.ui.home;

import android.content.Context;
import android.graphics.Rect;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.bs.Books;
import com.example.bs.R;

import java.util.LinkedList;
import java.util.List;

public class HomeFragment extends Fragment {


    private static final String TAG = "HomeFragment";
    List<Books> list = new LinkedList<Books>();


//    private HomeViewModel homeViewModel;
    View root;
    private RecyclerView mRecBook;
    private LinearAdapter linearAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        addBook();
//        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        if(root==null)root = inflater.inflate(R.layout.fragment_home, container, false);
        mRecBook = root.findViewById(R.id.recycler_book);
        mRecBook.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecBook.addItemDecoration(new MyDecoration());
        linearAdapter = new LinearAdapter(getContext(),list);
        mRecBook.setAdapter(linearAdapter);
        Log.d(TAG, "onCreateView: ");
        return root;
    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }


    /**
     * Add book.
     */
    void addBook(){
    //    ImageView imageView = mRecBook.findViewById(R.id.image_book);
   //     Glide.with(this).load("https://www.baidu.com/img/flexible/logo/pc/result.png").into(imageView);
        list.add(new Books("https://www.shicimingju.com/public/image/book/xiyouji.jpg","西游记","吴承恩","1566"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/hongloumeng.jpg","红楼梦","曹雪芹","1792"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/sanguoyanyi.jpg","三国演义","罗贯中","1522"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/shuihuzhuan.jpg","水浒传","施耐庵","1367"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/xiyouji.jpg","西游记","吴承恩","1566"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/hongloumeng.jpg","红楼梦","曹雪芹","1792"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/sanguoyanyi.jpg","三国演义","罗贯中","1522"));
        list.add(new Books("https://www.shicimingju.com/public/image/book/shuihuzhuan.jpg","水浒传","施耐庵","1367"));
        list.add(new Books("https://bkimg.cdn.bcebos.com/pic/32fa828ba61ea8d3fd1f8a2a5942274e251f95caf2ce?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_jpg","计算机组成原理","唐朔飞","2017-11-01"));
        list.add(new Books("https://pic2.zhimg.com/v2-7f8424370b601e57393db2e6154f3c44_1440w.jpg?source=172ae18b","C++Primer第五版","李普曼","2013-09-01"));
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);   
        Log.d(TAG, "onAttach: 1");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: 2");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated: 3");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "onViewStateRestored: 4");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 5");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 6");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 7");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 8");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: 9");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: 10");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 11");
    }
}






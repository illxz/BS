package com.example.bs.ui.dashboard;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bs.R;
import com.example.bs.ui.dashboard.choose.ChooseLinearAdapter;
import com.example.bs.ui.dashboard.choose.Option;

import java.util.LinkedList;
import java.util.List;

public class DashboardFragment extends Fragment {
    private static final String TAG = "DashboardFragment";
    Context mContext;
    private View root;
    private RecyclerView mRecChoose;
    private ChooseLinearAdapter chooseLinearAdapter;
    List<Option> options = new LinkedList<Option>();
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        Log.d(TAG, "onCreateView: ");
        add();
        mRecChoose = root.findViewById(R.id.recycler_Choose);
        mRecChoose.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecChoose.addItemDecoration(new MyDecoration());
        chooseLinearAdapter = new ChooseLinearAdapter(getContext(), options);
        mRecChoose.setAdapter(chooseLinearAdapter);
        return root;
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }


    void add(){
        options.add(new Option("000","全部"));
        options.add(new Option("001","计算机"));
        options.add(new Option("002","法律"));
        options.add(new Option("003","农业"));
        options.add(new Option("004","数学"));
        options.add(new Option("005","医学"));
        options.add(new Option("006","哲学"));
        options.add(new Option("007","物理"));
        options.add(new Option("008","化学"));
    }
}
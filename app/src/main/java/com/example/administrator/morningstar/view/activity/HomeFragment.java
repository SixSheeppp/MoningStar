package com.example.administrator.morningstar.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.morningstar.R;

/**
 * Created by anson on 2017/4/5.
 */

public class HomeFragment extends BaseFragment{

    private TextView mTextView;

    @Override
    protected int getViewLayout() {
        return R.layout.fragment_main_home;
    }

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {
        mTextView = (TextView) getRootView().findViewById(R.id.tv_test_name);
        mTextView.setText("动画");
    }
}
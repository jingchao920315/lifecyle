package com.example.jingchao.lifecyle;

import android.os.Bundle;

import com.example.jingchao.lifecyle.databinding.ActivityMainBinding;
import com.example.jingchao.lifecyle.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding>  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}



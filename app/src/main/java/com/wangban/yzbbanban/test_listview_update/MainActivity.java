package com.wangban.yzbbanban.test_listview_update;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lumenghz.com.pullrefresh.PullToRefreshView;

public class MainActivity extends AppCompatActivity {
    private PullToRefreshView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (PullToRefreshView) findViewById(R.id.pull_to_refresh);
        view.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        view.setRefreshing(false);
                    }
                }, 1500);
            }
        });
    }
}

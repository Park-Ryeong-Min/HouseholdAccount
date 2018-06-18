package com.ved.min.householdaccount.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ved.min.householdaccount.Adapters.FragmentPagerAdapter;
import com.ved.min.householdaccount.R;

public class MainActivity extends AppCompatActivity {

    final String TAG = "MAIN_ACTIVITY";

    // Components using in Activity
    private ViewPager pager;
    private Button itemInputFragmentButton;
    private Button itemListFragmentButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        pager = (ViewPager)findViewById(R.id.main_view_pager);
        itemListFragmentButton = (Button)findViewById(R.id.main_tab_btn_item_list);
        itemInputFragmentButton = (Button)findViewById(R.id.main_tab_btn_item_input);

        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()));
        pager.setCurrentItem(0);

        View.OnClickListener movePageListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (int)v.getTag();
                pager.setCurrentItem(tag);
            }
        };

        itemInputFragmentButton.setOnClickListener(movePageListener);
        itemInputFragmentButton.setTag(0);

        itemListFragmentButton.setOnClickListener(movePageListener);
        itemListFragmentButton.setTag(1);
    }
}

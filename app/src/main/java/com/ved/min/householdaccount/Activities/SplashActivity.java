package com.ved.min.householdaccount.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    /**
     * 스플래시 스크린을 Runnable 을 통해 시간을 지연하는 방식으로 구현하면
     * 실제로 스플래시 동안 아무런 작업을 하지 않지만 사용자는 무작정 기다려야 하는 문제가 있음
     * 또한 Application 이나 Launch Activity 에 많은 작업이 이루어진다면
     * Activity 에서 레이아웃 인플레이트가 지연되어 스플래시 화면이 늦게 뜨는 문제점이 발생됨
     * -> 해결법 : drawable/splash.xml 로 Activity 의 테마를 지정하고
     * -> Activity 사이에서 어플리케이션의 로딩 작업을 수행하고 다음 MainActivity 로 넘기고 finish();
     */

    final String TAG = "SPLASH_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // for TEST
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 2000);

        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);

        finish();
    }
}

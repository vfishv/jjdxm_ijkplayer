package com.dou361.jjdxm_ijkplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dou361.ijkplayer.activity.PlayerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_h;
    private Button btn_v;
    private Button btn_live;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_h = (Button) findViewById(R.id.btn_h);
        btn_v = (Button) findViewById(R.id.btn_v);
        btn_live = (Button) findViewById(R.id.btn_live);
        btn_h.setOnClickListener(this);
        btn_v.setOnClickListener(this);
        btn_live.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_h) {
            Intent intent = new Intent(this, HPlayerActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_v) {
            Intent intent = new Intent(this, PlayerActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_live) {
            Intent intent = new Intent(this, PlayerLiveActivity.class);
            startActivity(intent);
        }
    }
}

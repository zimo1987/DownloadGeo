package com.gxbdx.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private static MainActivity main = null;
    private TextView tvScore;
    private int score = 0;
    private RelativeLayout rl;

    public MainActivity() {
        main = this;
    }

    public static MainActivity getMain() {
        return main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvScore = (TextView) findViewById(R.id.tvScore);
        rl = (RelativeLayout) findViewById(R.id.rl);
        rl.setOnClickListener(this);
    }

    public void clearScore() {
        score = 0;
    }

    public void showScore() {
        tvScore.setText(score + "");
    }

    public void addScore(int s) {
        score += s;
        showScore();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl:
                Toast.makeText(main, "桥头富水堂科技有限公司出品", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

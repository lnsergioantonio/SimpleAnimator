package com.example.sergio.simpleexampleviewanimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewAnimator viewAnimator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewAnimator = findViewById(R.id.viewAnimator);

        findViewById(R.id.btnNext).setOnClickListener(this);
        findViewById(R.id.btnPrevious).setOnClickListener(this);
        findViewById(R.id.btnGoActivityFlipper).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNext:
                if(viewAnimator.getCurrentView().getId()!=R.id.three)
                    viewAnimator.showNext();
                break;
            case R.id.btnPrevious:
                if(viewAnimator.getCurrentView().getId()!=R.id.one)
                    viewAnimator.showPrevious();
                break;
            case R.id.btnGoActivityFlipper:
                Intent intent = new Intent(this,ViewFlipperActivity.class);
                startActivity(intent);
                break;
        }
    }
}

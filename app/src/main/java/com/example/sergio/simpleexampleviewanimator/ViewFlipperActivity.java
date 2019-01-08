package com.example.sergio.simpleexampleviewanimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class ViewFlipperActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper);
        viewFlipper = findViewById(R.id.viewFlipper);
    }
    public void next(View v){
        viewFlipper.showNext();
        viewFlipper.stopFlipping();
    }
    public void previous(View v){
        viewFlipper.showPrevious();
        viewFlipper.stopFlipping();
    }
    public void goToSwitcher(View v){
        Intent intent = new Intent(this,ViewSwitcherActivity.class);
        intent.putExtra("ParamOne","Valor de parametro");
        startActivity(intent);
    }
}

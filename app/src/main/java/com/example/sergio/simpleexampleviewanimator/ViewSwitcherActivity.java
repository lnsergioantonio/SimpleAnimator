package com.example.sergio.simpleexampleviewanimator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class ViewSwitcherActivity extends AppCompatActivity {
    ViewSwitcher viewSwitcher;
    String paramOne ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_switcher);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            paramOne = bundle.getString("ParamOne");
            Toast.makeText(getApplicationContext()," ParamOne="+paramOne,Toast.LENGTH_SHORT).show();
        }
        viewSwitcher = findViewById(R.id.viewSwitcher);
        /*viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return null;
            }
        });*/
    }
    public void next(View V){
        viewSwitcher.showNext();
    }
    public void previous(View v){
        viewSwitcher.showPrevious();
    }
}

package com.example.sergio.simpleexampleviewanimator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class TextImageSwitcherActivity extends AppCompatActivity {
    TextSwitcher textSwitcher;
    ImageSwitcher imageSwitcher;

    int[] images = {R.drawable.codi2,R.drawable.keka,R.drawable.codi};
    String[] text = {"Codi 2","Keka","Codi"};
    int position=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_image_switcher);
        imageSwitcher= findViewById(R.id.imageSw);
        textSwitcher=findViewById(R.id.textSw);

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView txtView = new TextView(TextImageSwitcherActivity.this);
                return txtView;
            }
        });
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(TextImageSwitcherActivity.this);
                return imageView;
            }
        });
        next(null);
    }
    public  void next(View v){
        textSwitcher.setText(text[position]);
        imageSwitcher.setImageResource(images[position]);
        position = (position+1) % text.length;
    }
}

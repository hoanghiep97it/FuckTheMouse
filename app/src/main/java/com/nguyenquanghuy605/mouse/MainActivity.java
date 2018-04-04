package com.nguyenquanghuy605.mouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    ImageView imgMouseLeft, imgMouseRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        final Animation animMouseLeft = AnimationUtils.loadAnimation(this,R.anim.anim_mouseleft);

        imgMouseLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animMouseLeft);
            }
        });

        // Chuột di chuyển
        final Animation animTranslate =  AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        imgMouseRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animTranslate);
            }
        });
    }

    public void AnhXa(){
        btnPlay = (Button) findViewById(R.id.btnPlay);
        imgMouseLeft = (ImageView) findViewById(R.id.imgMouseLeft);
        imgMouseRight = (ImageView) findViewById(R.id.imgMouseRight);
    }
}

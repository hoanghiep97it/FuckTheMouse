package com.nguyenquanghuy605.mouse;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import java.nio.file.Path;

public class Level5 extends AppCompatActivity {

    ImageView imgMouseRight, imgMouseLeft , imgCake;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        AnhXa();
//        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
//        final Animation animation1= AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
//        imgMouseLeft.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                v.startAnimation(animTranslate);
//            }
//        });

//        imgMouseRight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                v.startAnimation(animation1);
//                v.startAnimation(animTranslate);
//            }
//        });


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Khi nhấn nút start thì sẽ chuột  bắt đầu chạy
                ObjectAnimator animatorLeft = ObjectAnimator.ofFloat(imgMouseLeft, "translationX", 200f);
                animatorLeft.setDuration(5000);
                animatorLeft.start();


                    ObjectAnimator animatorRight = ObjectAnimator.ofFloat(imgMouseRight , "translationY", 600f);
                    animatorRight.setDuration(4000);
                    animatorRight.start();

                    ObjectAnimator animatorRight1 = ObjectAnimator.ofFloat(imgMouseRight , "translationX", -210f);
                    animatorRight1.setDuration(4000);
                    animatorRight1.start();


            }
        });
    }
    public void AnhXa(){
        imgMouseLeft = (ImageView) findViewById(R.id.imgMouseLeft);
        imgMouseLeft.setX(-300f);
        imgMouseRight = (ImageView) findViewById(R.id.imgMouseRight);
        imgMouseRight.setX(300f);
        imgCake = (ImageView) findViewById(R.id.imgCake);
        btnPlay = (Button) findViewById(R.id.btnPlay);
    }
}

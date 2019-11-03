package com.example.ebooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation);

        TextView textview = (TextView)findViewById(R.id.welcome);
        Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        textview.startAnimation(textAnim);

        animation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        textAnim.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation textAnim) {
            }

            @Override
            public void onAnimationRepeat(Animation textAnim) {
            }

            @Override
            public void onAnimationEnd(Animation textAnim) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}

package com.example.ebooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim_activity);

        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation);

        TextView text = (TextView)findViewById(R.id.log);
        Animation animatext = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        text.startAnimation(animatext);

        animation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(AnimActivity.this, OptionActivity.class));
            }
        });

        animatext.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animatext) {
            }

            @Override
            public void onAnimationRepeat(Animation animatext) {
            }

            @Override
            public void onAnimationEnd(Animation animattext) {
                startActivity(new Intent(AnimActivity.this, OptionActivity.class));
            }
        });
    }
}

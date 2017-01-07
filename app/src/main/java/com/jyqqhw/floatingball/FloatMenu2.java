package com.jyqqhw.floatingball;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

/**
 * Created by floyd1992 on 2017/1/5 0005.
 */

public class FloatMenu2 extends LinearLayout{

    private LinearLayout layout;

    private Rect rect = new Rect();

    private TranslateAnimation animation;

    public FloatMenu2(final Context context) {
        super(context);
        View root = View.inflate(context, R.layout.float_menu2, null);
        layout = (LinearLayout) root.findViewById(R.id.layout);
        animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 1.0f,
                Animation.RELATIVE_TO_SELF, 0);
        animation.setDuration(500);
        animation.setFillAfter(true);
        layout.setAnimation(animation);
        root.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                FloatingViewManager manager = FloatingViewManager.getInstance(context);
                manager.showFloatBall();
                manager.hideFloatMenu();
                return false;
            }
        });
        addView(root);
    }

    private void init(){

    }



    public void startAnimation() {
        animation.start();
    }


}

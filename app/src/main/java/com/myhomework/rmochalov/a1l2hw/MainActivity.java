package com.myhomework.rmochalov.a1l2hw;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;


public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mySkillBox = (LinearLayout) findViewById(R.id.skillBox);
        String[] myProfSkills = getResources().getStringArray(R.array.mySkills);

        for (int i=0; i<myProfSkills.length;i++){
            TextView txt = new TextView(this);
            txt.setId(i);
            txt.setText(myProfSkills[i]);
            txt.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            txt.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
            txt.setTextColor(getResources().getColor(R.color.txt_color));
            mySkillBox.addView(txt);

        }

    }

}

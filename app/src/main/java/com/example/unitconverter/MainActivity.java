package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout.LayoutParams  lp;
        RelativeLayout rl = new RelativeLayout(this);
        lp = new RelativeLayout.LayoutParams (RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        rl.setLayoutParams(lp);

        CheckBox cbox = new CheckBox(this);
        lp = new RelativeLayout.LayoutParams (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
        cbox.setLayoutParams(lp);
        cbox.setId(101);

        EditText etext = new EditText(this);
        etext.setId(102);
        lp = new RelativeLayout.LayoutParams (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_BASELINE, 101);
        lp.addRule(RelativeLayout.ALIGN_BOTTOM, 101);
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        lp.addRule(RelativeLayout.RIGHT_OF, 101);
        etext.setLayoutParams(lp);

        Button genBtn = new Button(this);
        genBtn.setId(103);
        genBtn.setGravity(Gravity.CENTER);

        lp.addRule(RelativeLayout.BELOW, 101);
        genBtn.setLayoutParams(lp);



        rl.addView(cbox);
        rl.addView(etext);
        this.setContentView(rl);

    }
}
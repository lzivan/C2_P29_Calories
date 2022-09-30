package com.lzivan.calories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText pz;
    private EditText cc;
    private EditText cw;
    private EditText gs;
    private EditText ps;
    private TextView opt;
    private int pzval = 0;
    private int psval = 0;
    private int ccval = 0;
    private int gsval = 0;
    private int cwval = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pz = findViewById(R.id.inpPz);
        cc = findViewById(R.id.inpCc);
        cw = findViewById(R.id.inputCw);
        gs = findViewById(R.id.inpGs);
        ps = findViewById(R.id.inpPs);
        opt = findViewById(R.id.output);
    }

    public void calCal(View view) {


        if (gs.getText().toString().length() != 0) {
            gsval = Integer.valueOf((gs.getText().toString()));
        }else{
            gsval = 0;
        }
        if (pz.getText().toString().length() != 0) {
            pzval = Integer.valueOf((pz.getText().toString()));
        }else{
            pzval = 0;
        }
        if (ps.getText().toString().length() != 0) {
            psval = Integer.valueOf((ps.getText().toString()));
        }else{
            psval = 0;
        }
        if (cw.getText().toString().length() != 0) {
            cwval = Integer.valueOf((cw.getText().toString()));
        }else{
            cwval = 0;
        }
        if (cc.getText().toString().length() != 0) {
            ccval = Integer.valueOf((cc.getText().toString()));
        }else{
            ccval = 0;
        }

        int finalval = (pzval * 285) +
                (ccval * 400) +
                (psval * 220) +
                (cwval* 195) +
                (gsval * 15);

        opt.setText("The calories in total are " + (finalval));
    }
}
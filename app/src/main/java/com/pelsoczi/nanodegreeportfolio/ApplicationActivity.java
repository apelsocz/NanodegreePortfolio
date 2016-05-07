package com.pelsoczi.nanodegreeportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ApplicationActivity extends AppCompatActivity implements Button.OnClickListener {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg = "";
        if (v.equals(one)) {
            msg = "one";
        }
        else if (v.equals(two)) {
            msg = "two";
        }
        else if (v.equals(three)) {
            msg = "three";
        }
        else if (v.equals(four)) {
            msg = "four";
        }
        else if (v.equals(five)) {
            msg = "five";
        }
        else if (v.equals(six)) {
            msg = "six";
        }
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}

package com.example.danielhwang.buttoncounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button Increment;
    private Button Decrement;
    private int count = 0;
    private Button Reset;
    private TextView number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null)
        {
            count = savedInstanceState.getInt("count");
        }

        Reset = (Button) findViewById(R.id.Reset);
        Reset.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                count = 0;
                number.setText(Integer.toString(count));
                Reset.setText("Reset");
            }
        });

        Increment = (Button) findViewById(R.id.Increment);
        Increment.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View view)
            {
                count++;
                number.setText(Integer.toString(count));
                Increment.setText("Increment");
            }

        });

        Decrement = (Button) findViewById(R.id.Decrement);
        Decrement.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                count--;
                number.setText(Integer.toString(count));
                Decrement.setText("Decrement");
            }
        });


        number =(TextView) findViewById(R.id.number);
        number.setText(Integer.toString(count));


    }

    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("count", count);
        savedInstanceState.putBoolean("resume", true);
    }

}

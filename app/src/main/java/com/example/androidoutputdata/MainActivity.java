package com.example.androidoutputdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout liner = findViewById(R.id.liner);
        String[] classNames = new String[]{"Nam", "Hoa", "Lan", "Phuong"};
        for (int i = 0 ; i < classNames.length; i++){
            LinearLayout linearLayout = new LinearLayout(MainActivity.this);
            linearLayout.setOrientation(linearLayout.HORIZONTAL);

            TextView textView = new TextView(MainActivity.this);
            textView.setText(classNames[i]);
            Button button = new Button(MainActivity.this);
            button.setText("+");
            textView.setWidth(300);

            linearLayout.addView(textView);
            linearLayout.addView(button);

            liner.addView(linearLayout);
        }


        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edt = findViewById(R.id.text);
                String text = edt.getText().toString();

                TextView textView = new TextView(MainActivity.this);
                textView.setText(text);

                LinearLayout liner = findViewById(R.id.liner);
                liner.addView(textView);
//                TextView show = findViewById(R.id.show);
//                show.setText(show.getText().toString() + text +'\n');
            }
        });
    }
}
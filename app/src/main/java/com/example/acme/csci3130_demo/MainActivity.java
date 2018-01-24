package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewbox;
    Button button;
    EditText inputbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputbox = (EditText) findViewById(R.id.inputbox);
        button = (Button) findViewById(R.id.button);
        viewbox = (TextView) findViewById(R.id.viewbox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewbox.setText(inputbox.getText());
            }
        });
    }
}

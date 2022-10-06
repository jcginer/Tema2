package com.gin.tema2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);

        Button deleteButton = (Button) findViewById(R.id.buttonBorrar);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                textView5.setText("");
                textView6.setText("");
                textView7.setText("");
            }
        });

        Button saveButton = (Button) findViewById(R.id.buttonGuardar);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(((EditText) findViewById(R.id.editView1)).getText());
                textView2.setText(((EditText) findViewById(R.id.editView2)).getText());
                textView3.setText(((EditText) findViewById(R.id.editView3)).getText());
                textView4.setText(((EditText) findViewById(R.id.editView4)).getText());
                textView5.setText(((EditText) findViewById(R.id.editView5)).getText());
                textView6.setText(((EditText) findViewById(R.id.editView6)).getText());
                textView7.setText(((EditText) findViewById(R.id.editView7)).getText());
            }
        });
    }
}
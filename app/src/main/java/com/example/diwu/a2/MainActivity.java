package com.example.diwu.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText t1;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Validator check = new Validator();
        String result= "";
        if(check.validate(t1.getText().toString())== 5){
            result = "level 5, Max strength";
        } else {

            result = "level " +check.validate(t1.getText().toString()) + ", can be better";
        }
        t2.setText(result);

    }
}

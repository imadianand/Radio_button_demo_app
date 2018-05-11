package com.example.android.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup rg;
RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
    }

public void radiobuttonclick(View view){

        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb =(RadioButton) findViewById(radiobuttonid);
    Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
}

}

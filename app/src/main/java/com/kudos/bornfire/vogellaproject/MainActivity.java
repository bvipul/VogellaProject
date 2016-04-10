package com.kudos.bornfire.vogellaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE =1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intentButtonClick(View view) {
        EditText edt = (EditText) findViewById(R.id.inputforintent);
        String s = edt.getText().toString();
        Intent secondActivity = new Intent(MainActivity.this,ResultActivity.class);
        secondActivity.putExtra("str",s);
        startActivityForResult(secondActivity,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK)
        {
            if(data.hasExtra("name")) {
                String result = data.getStringExtra("name").toString();
                if (result != null && result.length() > 0) {
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}

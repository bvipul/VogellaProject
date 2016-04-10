package com.kudos.bornfire.vogellaproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Lucifer on 4/9/2016.
 */
public class ResultActivity extends Activity {
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ed = (EditText) findViewById(R.id.returnValue);
        Intent edx = getIntent();
        String name = edx.getStringExtra("str");
        ed.setText(name);

    }

    @Override
    public void finish() {
        String name = ed.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("name",name);
        setResult(RESULT_OK,intent);
        super.finish();
    }

    public void finish_activity(View view) {
        finish();
    }
}

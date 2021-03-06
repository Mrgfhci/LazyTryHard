package com.example.dadeeo.lazytryhard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {
    Button btnGreetings;
    TextView tvGreetings;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        btnGreetings = (Button)findViewById(R.id.btnHello);
        tvGreetings = (TextView)findViewById(R.id.tvGreetings);
        etName = (EditText)findViewById(R.id.etName);
        btnGreetings.setOnClickListener(new View.OnClickListener() {
            int nCount = 0;
            @Override
            public void onClick(View v) {
                String sName;
                sName = etName.getText().toString();
                nCount++;
                tvGreetings.setText("Howdy "+nCount + " times " + sName);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

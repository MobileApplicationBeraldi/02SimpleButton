package com.example.roberto.simplebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = (Button) findViewById(R.id.button1);
        //btn.setOnClickListener(new listener());
        btn.setOnClickListener(this);
    }

    public void btnClicked(View view) {
        Button btn = (Button) findViewById(R.id.button2);
                btn.setText("OK");
        Toast.makeText(this,"btn 2 clicked....",Toast.LENGTH_SHORT).show();
    }

    class listener implements Button.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplication().getApplicationContext(),"btn 2 clicked....",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplication().getApplicationContext(),"btn 1 clicked....",Toast.LENGTH_SHORT).show();

    }
}

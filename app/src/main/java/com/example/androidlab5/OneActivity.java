package com.example.androidlab5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class OneActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "myLogs";
    TextView textView;
    Button button;
    Button button2;
    Button button3;
    int k = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"One activity: create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_activity);

        Intent intent = getIntent();
        k = intent.getIntExtra("k",k);

        textView = findViewById(R.id.textView2);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        textView.setText("One "+k);

    }

    @Override
    public void onClick(View v) {
        k++;
        Intent intent = null;
        textView.setText(" "+k);
        switch (v.getId()){
            case R.id.button: intent = new Intent(this, MainActivity.class);break;
            case R.id.button3: intent= new Intent(this,OneActivity.class); break;
            case R.id.button4: intent= new Intent(this,TwoActivity.class); break;
        }
        intent.putExtra("k",k);
        startActivity(intent);
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG,"One activity: restore");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG,"One activity: save");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"One activity: restart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"One activity: resume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"One activity: destroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"One activity: pause");
        super.onPause();
    }
}

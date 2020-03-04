package com.example.androidlab5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "myLogs";
    TextView textView;
    Button button;
    Button button2;
    Button button3;
    int k = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"Two activity: create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);

        Intent intent = getIntent();
        k = intent.getIntExtra("k",k);

        textView = (TextView)findViewById(R.id.textView2);
        button = (Button)findViewById(R.id.button7);
        button2 = (Button)findViewById(R.id.button);
        button3 = (Button)findViewById(R.id.button6);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        textView.setText("Two "+k);

    }

    @Override
    public void onClick(View v) {
        k++;
        Intent intent = null;
        textView.setText(" "+k);
        switch (v.getId()){
            case R.id.button7: intent = new Intent(this, MainActivity.class);break;
            case R.id.button: intent= new Intent(this,OneActivity.class); break;
            case R.id.button6: intent= new Intent(this,TwoActivity.class); break;
        }
        intent.putExtra("k",k);
        startActivity(intent);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"Two activity: restore");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG,"Two activity: save");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"Two activity: restart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"Two activity: resume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"Two activity: destroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"Two activity: pause");
        super.onPause();
    }

}

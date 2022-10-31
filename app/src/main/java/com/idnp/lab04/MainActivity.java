package com.idnp.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputMessage = findViewById(R.id.inputMessage);
    }

    public void onBroadcastSendBtnClicked(View v){
        Intent i = new Intent();
        i.setAction("com.idnp.lab04");
        i.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        i.putExtra("msg", inputMessage.getText().toString());
        sendBroadcast(i);
    }
}
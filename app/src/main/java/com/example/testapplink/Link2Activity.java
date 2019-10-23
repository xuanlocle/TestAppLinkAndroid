package com.example.testapplink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class Link2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link2);
        Intent intent = getIntent();
        Uri data = intent.getData();

        ((TextView)(findViewById(R.id.txtDummy)))
                .setText(data.toString()
                             .substring(data.toString().indexOf("?")+1)
                             .replaceAll("&","\n"));
    }
}

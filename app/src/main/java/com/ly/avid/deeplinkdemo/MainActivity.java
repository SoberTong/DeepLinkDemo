package com.ly.avid.deeplinkdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = (TextView) findViewById(R.id.txt);
        Intent it = getIntent();
        if (it.getData() != null){
            Uri uri = it.getData();
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String id = uri.getQueryParameter("id");
            String name = uri.getQueryParameter("name");
            String path = "scheme:"+scheme+", host:"+host+", id:"+id+", name:"+name;
            Log.e("DeepLinkDemo", path);
            Toast.makeText(this, path, Toast.LENGTH_SHORT).show();
            txt.setText(path);
        }
    }
}

package com.anura.javabook.basics;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import com.anura.javabook.MainActivity;
import com.anura.javabook.R;

public class Enter extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basics_fragment_enter);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        WebView web = findViewById(R.id.webBrowser);
        web.loadUrl("file:///android_asset/Material/Basics/Enter/Enter.html");
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setSupportZoom(true);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        int id = v.getId();
        if (id == R.id.imageButton) {
            intent = new Intent(this, Basics.class);
            startActivity(intent);
        }
    }
}
package com.anura.javabook.strings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.anura.javabook.R;
import com.anura.javabook.oop.OOP;

public class Main extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strings_fragment_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        WebView web=findViewById(R.id.webBrowser);
        web.loadUrl("file:///android_asset/Material/String/Main/StringMain.html");
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
            intent = new Intent(this, Strings.class);
            startActivity(intent);
        }
    }
}

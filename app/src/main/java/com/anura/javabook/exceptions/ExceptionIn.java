package com.anura.javabook.exceptions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.anura.javabook.R;
import com.anura.javabook.cycles.Cycles;

public class ExceptionIn extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exceptions_fragment_exception_in);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        WebView web = findViewById(R.id.webBrowser);
        web.loadUrl("file:///android_asset/Material/Exception/ExceptionIn/ExceptionIn.html");
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
            intent = new Intent(this, Exception.class);
            startActivity(intent);
        }
    }
}

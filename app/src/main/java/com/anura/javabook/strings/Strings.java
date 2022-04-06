package com.anura.javabook.strings;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.anura.javabook.MainActivity;
import com.anura.javabook.R;

public class Strings extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;
    public CardView card0, card1,card2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.strings_fragment_strings);
        //спрятать верхнюю строку
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //нахождение кнопки "возвращение назад" по ID
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        //установка функции нажатия на кнопку "возвращение назад"
        imageButton.setOnClickListener(this);
        /**
         * нахождения наших CardView среди проекта
         */
        card0 = (CardView) findViewById(R.id.myCard_Main);
        card1 = (CardView) findViewById(R.id.myCard_Methods);
        card2 = (CardView) findViewById(R.id.myCard_Practice);
        /**
         * установка функции нажатия
         */
        card0.setOnClickListener(this);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        int id = v.getId();
        if (id == R.id.imageButton) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Main) {
            intent = new Intent(this, Main.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Methods) {
            intent = new Intent(this, Methods.class);
            startActivity(intent);
        }else if (id == R.id.myCard_Practice) {
            intent = new Intent(this, PracticeString.class);
            startActivity(intent);
        }
    }
}
package com.anura.javabook.exceptions;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.anura.javabook.MainActivity;
import com.anura.javabook.R;
import com.anura.javabook.cycles.CycOperators;
import com.anura.javabook.cycles.Operators;
import com.anura.javabook.cycles.Solving;

public class Exceptions extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;
    public CardView card0, card1, card2,card3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.exceptions_fragment_exceptions);
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
        card0 = (CardView) findViewById(R.id.myCard_Info);
        card1 = (CardView) findViewById(R.id.myCard_Processing);
        card2 = (CardView) findViewById(R.id.myCard_ExceptionIn);
        card3 = (CardView) findViewById(R.id.myCard_Practice);
        /**
         * установка функции нажатия
         */
        card0.setOnClickListener(this);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        int id = v.getId();
        if (id == R.id.imageButton) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Info) {
            intent = new Intent(this, Info.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Processing) {
            intent = new Intent(this, Processing.class);
            startActivity(intent);
        } else if (id == R.id.myCard_ExceptionIn) {
            intent = new Intent(this, ExceptionIn.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Practice) {
            intent = new Intent(this, PracticeException.class);
            startActivity(intent);
        }
    }
}
package com.anura.javabook.arrays;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.anura.javabook.MainActivity;
import com.anura.javabook.R;

public class Arrays extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;
    public CardView card0, card1, card2,card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.arrays_fragment_arrays);
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
        card0 = (CardView) findViewById(R.id.myCard_OneArray);
        card1 = (CardView) findViewById(R.id.myCard_TwoArray);
        card2 = (CardView) findViewById(R.id.myCard_MethodsArray);
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
        } else if (id == R.id.myCard_OneArray) {
            intent = new Intent(this, OneArray.class);
            startActivity(intent);
        } else if (id == R.id.myCard_TwoArray) {
            intent = new Intent(this, TwoArray.class);
            startActivity(intent);
        } else if (id == R.id.myCard_MethodsArray) {
            intent = new Intent(this, MethodsArray.class);
            startActivity(intent);
        }else if (id == R.id.myCard_Practice) {
            intent = new Intent(this, PracticeArray.class);
            startActivity(intent);
        }
    }
}
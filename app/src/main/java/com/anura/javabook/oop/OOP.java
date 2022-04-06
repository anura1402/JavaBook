package com.anura.javabook.oop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.anura.javabook.MainActivity;
import com.anura.javabook.R;

public class OOP extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;
    public CardView card0, card1, card2, card3,card4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.oop_fragment_o_o_p);
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
        card0 = (CardView) findViewById(R.id.myCard_Parent);
        card1 = (CardView) findViewById(R.id.myCard_Incapsule);
        card2 = (CardView) findViewById(R.id.myCard_Polymorphism);
        card3 = (CardView) findViewById(R.id.myCard_Abstract);
        card4 = (CardView) findViewById(R.id.myCard_Practice);
        /**
         * установка функции нажатия
         */
        card0.setOnClickListener(this);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        int id = v.getId();
        if (id == R.id.imageButton) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Parent) {
            intent = new Intent(this, Parent.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Incapsule) {
            intent = new Intent(this, Incapsule.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Polymorphism) {
            intent = new Intent(this, Polymorphism.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Abstract) {
            intent = new Intent(this, Abstract.class);
            startActivity(intent);
        }else if (id == R.id.myCard_Practice) {
            intent = new Intent(this, PracticeOOP.class);
            startActivity(intent);
        }
    }
}
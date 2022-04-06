package com.anura.javabook.basics;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.anura.javabook.MainActivity;
import com.anura.javabook.R;

public class Basics extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;
    public CardView card0, card1, card2, card3, card4,card5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.basics_fragment_basics);
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
        card0 = (CardView) findViewById(R.id.myCard_Install);
        card1 = (CardView) findViewById(R.id.myCard_Syntax);
        card2 = (CardView) findViewById(R.id.myCard_Types);
        card3 = (CardView) findViewById(R.id.myCard_Comments);
        card4 = (CardView) findViewById(R.id.myCard_Enter);
        card5 = (CardView) findViewById(R.id.myCard_Practice);
        /**
         * установка функции нажатия
         */
        card0.setOnClickListener(this);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        int id = v.getId();
        if (id == R.id.imageButton) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Install) {
            intent = new Intent(this, Install.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Syntax) {
            intent = new Intent(this, Syntax.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Types) {
            intent = new Intent(this, Types.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Comments) {
            intent = new Intent(this, Comments.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Enter) {
            intent = new Intent(this, Enter.class);
            startActivity(intent);
        }else if (id == R.id.myCard_Practice) {
            intent = new Intent(this, PracticeBasic.class);
            startActivity(intent);
        }
    }
}
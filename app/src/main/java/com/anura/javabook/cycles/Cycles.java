package com.anura.javabook.cycles;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.anura.javabook.MainActivity;
import com.anura.javabook.R;
import com.anura.javabook.basics.Comments;
import com.anura.javabook.basics.Enter;
import com.anura.javabook.basics.Install;
import com.anura.javabook.basics.Syntax;
import com.anura.javabook.basics.Types;

public class Cycles extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButton;
    public CardView card0, card1, card2,card3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.cycles_fragment_cycles);
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
        card0 = (CardView) findViewById(R.id.myCard_Operators);
        card1 = (CardView) findViewById(R.id.myCard_Solving);
        card2 = (CardView) findViewById(R.id.myCard_CycOperators);
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
        } else if (id == R.id.myCard_Operators) {
            intent = new Intent(this, Operators.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Solving) {
            intent = new Intent(this, Solving.class);
            startActivity(intent);
        } else if (id == R.id.myCard_CycOperators) {
            intent = new Intent(this, CycOperators.class);
            startActivity(intent);
        }else if (id == R.id.myCard_Practice) {
            intent = new Intent(this, PracticeCycle.class);
            startActivity(intent);
        }
    }
}
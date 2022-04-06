package com.anura.javabook.ui.home.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.anura.javabook.R;
import com.anura.javabook.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class Test extends AppCompatActivity {
    private TextView questions;
    private TextView question;
    private AppCompatButton opt1, opt2, opt3, opt4;
    private AppCompatButton nextBtn;
    private List<QuestionsList> questionsLists;
    private int currentQuestionsPosition = 0;
    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса экрана с выбором темы для изучения
        setContentView(R.layout.total_test);
        //спрятать верхнюю строку
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        final ImageView backBtn = findViewById(R.id.back);
        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);

        opt1 = findViewById(R.id.option1);
        opt2 = findViewById(R.id.option2);
        opt3 = findViewById(R.id.option3);
        opt4 = findViewById(R.id.option4);

        nextBtn = findViewById(R.id.nextBtn);

        questionsLists = QuestionsBank.getQuestions();

        questions.setText((currentQuestionsPosition + 1) + "/" + questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        opt1.setText(questionsLists.get(0).getOpt1());
        opt2.setText(questionsLists.get(0).getOpt2());
        opt3.setText(questionsLists.get(0).getOpt3());
        opt4.setText(questionsLists.get(0).getOpt4());

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = opt1.getText().toString();
                    opt1.setBackgroundResource(R.drawable.round_back_red);
                    opt1.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = opt2.getText().toString();
                    opt2.setBackgroundResource(R.drawable.round_back_red);
                    opt2.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = opt3.getText().toString();
                    opt3.setBackgroundResource(R.drawable.round_back_red);
                    opt3.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = opt4.getText().toString();
                    opt4.setBackgroundResource(R.drawable.round_back_red);
                    opt4.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedOptionByUser.isEmpty())
                    Toast.makeText(Test.this, "Пожалуйста, выберите ответ", Toast.LENGTH_SHORT).show();

                else {
                    changeNextQuestion();
                }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test.this, HomeFragment.class));
                finish();
            }
        });
    }

    private void changeNextQuestion() {
        currentQuestionsPosition++;
        if ((currentQuestionsPosition + 1) == questionsLists.size()) {
            nextBtn.setText("Закончить тест");
        }
        if (currentQuestionsPosition < questionsLists.size()) {
            selectedOptionByUser = "";
            opt1.setBackgroundResource(R.drawable.round_back_white_stroke);
            opt1.setTextColor(Color.parseColor(("#1F6BB8")));

            opt2.setBackgroundResource(R.drawable.round_back_white_stroke);
            opt2.setTextColor(Color.parseColor(("#1F6BB8")));

            opt3.setBackgroundResource(R.drawable.round_back_white_stroke);
            opt3.setTextColor(Color.parseColor(("#1F6BB8")));

            opt4.setBackgroundResource(R.drawable.round_back_white_stroke);
            opt4.setTextColor(Color.parseColor(("#1F6BB8")));

            questions.setText((currentQuestionsPosition + 1) + "/" + questionsLists.size());
            question.setText(questionsLists.get(currentQuestionsPosition).getQuestion());
            opt1.setText(questionsLists.get(currentQuestionsPosition).getOpt1());
            opt2.setText(questionsLists.get(currentQuestionsPosition).getOpt2());
            opt3.setText(questionsLists.get(currentQuestionsPosition).getOpt3());
            opt4.setText(questionsLists.get(currentQuestionsPosition).getOpt4());
        } else {
            Intent intent = new Intent(Test.this, TestResult.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);
            finish();
        }
    }

    private int getCorrectAnswers() {
        int correctAnswers = 0;
        for (int i = 0; i < questionsLists.size(); i++) {
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer))
                correctAnswers++;
        }
        return correctAnswers;
    }

    private int getIncorrectAnswers() {
        int incorrectAnswers = 0;
        for (int i = 0; i < questionsLists.size(); i++) {
            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer))
                incorrectAnswers++;
        }
        return incorrectAnswers;
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Test.this, HomeFragment.class));
        finish();
    }

    private void revealAnswer() {
        final String getAnswer = questionsLists.get(currentQuestionsPosition).getAnswer();
        if (opt1.getText().toString().equals(getAnswer)) {
            opt1.setBackgroundResource(R.drawable.round_back_green1);
            opt1.setTextColor(Color.WHITE);
        } else if (opt2.getText().toString().equals(getAnswer)) {
            opt2.setBackgroundResource(R.drawable.round_back_green1);
            opt2.setTextColor(Color.WHITE);
        } else if (opt3.getText().toString().equals(getAnswer)) {
            opt3.setBackgroundResource(R.drawable.round_back_green1);
            opt3.setTextColor(Color.WHITE);
        } else if (opt4.getText().toString().equals(getAnswer)) {
            opt4.setBackgroundResource(R.drawable.round_back_green1);
            opt4.setTextColor(Color.WHITE);
        }
    }
}

package com.anura.javabook;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    public CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //подключение интерфейса главного экрана
        setContentView(R.layout.main_activity_main);

        //нахождение панели инструментов по ID
        Toolbar toolbar = findViewById(R.id.toolbar);
        //настройка панели инструментов
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(Color.WHITE);
        toolbar.setTitleTextColor(Color.BLACK);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        toolbar.setNavigationIcon(R.drawable.icons8_menu_100_1);

//        /**
//         * нахождения наших CardView среди проекта
//         */
//        card1 = (CardView) findViewById(R.id.myCard_1);
//        card2 = (CardView) findViewById(R.id.myCard_2);
//        card3 = (CardView) findViewById(R.id.myCard_3);
//        card4 = (CardView) findViewById(R.id.myCard_4);
//        card5 = (CardView) findViewById(R.id.myCard_5);
//        card6 = (CardView) findViewById(R.id.myCard_6);
//
//        /**
//         * установка функции нажатия
//         */
//        card1.setOnClickListener(this);
//        card2.setOnClickListener(this);
//        card3.setOnClickListener(this);
//        card4.setOnClickListener(this);
//        card5.setOnClickListener(this);
//        card6.setOnClickListener(this);

    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    /**
     * обработка нажатия на CardView
     * @param v
     */
//    @Override
//    public void onClick(View v) {
//        Intent intent;
//        int id = v.getId();
//        if (id == R.id.myCard_1) {
//            intent = new Intent(this, Basics.class);
//            startActivity(intent);
//        } else if (id == R.id.myCard_2) {
//            intent = new Intent(this, Strings.class);
//            startActivity(intent);
//        } else if (id == R.id.myCard_3) {
//            intent = new Intent(this, Cycles.class);
//            startActivity(intent);
//        } else if (id == R.id.myCard_4) {
//            intent = new Intent(this, Arrays.class);
//            startActivity(intent);
//        } else if (id == R.id.myCard_5) {
//            intent = new Intent(this, OOP.class);
//            startActivity(intent);
//        } else if (id == R.id.myCard_6) {
//            intent = new Intent(this, Exceptions.class);
//            startActivity(intent);
//        }
//
//    }
}
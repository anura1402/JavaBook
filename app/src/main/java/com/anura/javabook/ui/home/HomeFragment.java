package com.anura.javabook.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.anura.javabook.arrays.Arrays;
import com.anura.javabook.basics.Basics;
import com.anura.javabook.cycles.Cycles;
import com.anura.javabook.exceptions.Exceptions;
import com.anura.javabook.oop.OOP;
import com.anura.javabook.R;
import com.anura.javabook.strings.Strings;
import com.anura.javabook.ui.home.test.Test;

public class HomeFragment extends Fragment implements View.OnClickListener {
    public CardView card1, card2, card3, card4, card5, card6,card7;

    public View onCreateView  (@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /**
         * подключение интерфейса главного экрана
         */
        View root = inflater.inflate(R.layout.main_fragment_home, container, false);
        /**
         * нахождения наших CardView среди проекта
         */
        card1 = (CardView) root.findViewById(R.id.myCard_Basics);
        card2 = (CardView) root.findViewById(R.id.myCard_Strings);
        card3 = (CardView) root.findViewById(R.id.myCard_Cycles);
        card4 = (CardView) root.findViewById(R.id.myCard_Array);
        card5 = (CardView) root.findViewById(R.id.myCard_OOP);
        card6 = (CardView) root.findViewById(R.id.myCard_Exceptions);
        card7 = (CardView) root.findViewById(R.id.myCard_Test);

        /**
         * установка функции нажатия
         */
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);

        return root;
    }
    /**
     * обработка нажатия на CardView
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent;
        int id = v.getId();
        if (id == R.id.myCard_Basics) {
            intent = new Intent(getActivity(), Basics.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Strings) {
            intent = new Intent(getActivity(), Strings.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Cycles) {
            intent = new Intent(getActivity(), Cycles.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Array) {
            intent = new Intent(getActivity(), Arrays.class);
            startActivity(intent);
        } else if (id == R.id.myCard_OOP) {
            intent = new Intent(getActivity(), OOP.class);
            startActivity(intent);
        } else if (id == R.id.myCard_Exceptions) {
            intent = new Intent(getActivity(), Exceptions.class);
            startActivity(intent);
        }else if (id == R.id.myCard_Test) {
            intent = new Intent(getActivity(), Test.class);
            startActivity(intent);
        }
    }
}

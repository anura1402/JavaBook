package com.anura.javabook.ui.home.test;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> javaQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что будет в результате выполнения операции 2 + 2 == 5 && 12 / 4 == 3 || 2 == 5 % 3?", "true", "false", "null", "0", "true", "");
        final QuestionsList question2 = new QuestionsList("Что такое класс в Java?", "Уровень сложности программы. Все операторы делятся на классы в зависимости от сложности их использования.", "Базовый элемент объектно-ориентированного программирования в языке Java", "Просто одно из возможных названий переменной.", "В Java такого понятия нет.", "Базовый элемент объектно-ориентированного программирования в языке Java", "");
        final QuestionsList question3 = new QuestionsList("Как объявить класс в коде?", "class MyClass {}", "new class MyClass {}", "select * from class MyClass {}", "MyClass extends class {}", "class MyClass {}", "");
        final QuestionsList question4 = new QuestionsList("Что означает ключевое слово extends?", "Что данный класс наследуется от другого.", "Что это дополнительный модуль класса, который расширяет его свойства.", "Что два класса делают одно и то же.", "Что это самый большой класс в программе.", "Что данный класс наследуется от другого.", "");
        final QuestionsList question5 = new QuestionsList("Какие математические операции есть в Java?", "+, -, *, /, --, ++", "+, -, *, /, %", "+, -, *, /", "Все перечисленные", "Все перечисленные", "");
        final QuestionsList question6 = new QuestionsList("Где правильно присвоено новое значение к многомерному массиву?", "a[0][0] = 1;", "a{0}{0} = 1;", "a(0)(0) = 1;", "a[0, 0] = 1;", "a[0][0] = 1;", "");
        final QuestionsList question7 = new QuestionsList("Где правильно создана простая переменная?", "int[] a;", "float x = 23.3f;", "char str = 'ab';", "bool isDone = true;", "float x = 23.3f;", "");
        final QuestionsList question8 = new QuestionsList("Где правильно осуществлен вывод?", "System.out.print(\"Hello World!\");", "print(\"Hello World!\");", "System.out.print = \"Hello World!\";", "System.out(\"Hello World!\");", "System.out.print(\"Hello World!\");", "");
        final QuestionsList question9 = new QuestionsList("Что общего у всех элементов массива?", "Их размер", "Их тип данных", "Их адрес в памяти", "Их названия", "Их тип данных", "");
        final QuestionsList question10 = new QuestionsList("Какой класс отвечает за получение информации от пользователя?", "Scanner", "Get", "Out", "System", "Scanner", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(){
        return javaQuestions();
    }
}

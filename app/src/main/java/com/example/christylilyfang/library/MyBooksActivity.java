package com.example.christylilyfang.library;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;

public class MyBooksActivity extends AppCompatActivity
{
    private TextView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybooks);
        content = (TextView) findViewById(R.id.view_books);
        String text1 = "book老人与海";
        String text2 = "book看见";
        String text3 = "book活着";
        String text4 = "book白夜行";
        String text5 = "book嫌疑人x的献身";
        String text6 = "book狼图腾";
        String text7 = "book平凡的世界";
        String text8 = "book霍乱时期的爱情";
        String text9 = "book欧·亨利短篇小说集";
        String text10 = "book倾城之恋";
        String text11 = "book目送";
        String text12 = "book百年孤独";
        String text13= "book红楼梦";
        String text14= "book天黑以后";
        String text15 = "book丰乳肥臀";
        String text16 = "book梦里花落知多少";
        String text17= "book星空";
        String text18 = "book我与地坛";
        String text19 = "book撒哈拉的故事";
        String text20 = "book生如夏花";
        content.setText(findBooks(text1)+findBooks(text2)+findBooks(text3)+findBooks(text4)+findBooks(text5)+findBooks(text6)+findBooks(text7)
                +findBooks(text8)+findBooks(text9)+findBooks(text10)+findBooks(text11)+findBooks(text12)+findBooks(text13)+findBooks(text14)
                +findBooks(text15)+findBooks(text16)+findBooks(text17)+findBooks(text18)+findBooks(text19)+findBooks(text20));

    }

    public String findBooks(String name) {
        String FILE_NAME = name+".txt";
        final String t = "";
        try (FileInputStream fileInputStream = openFileInput(FILE_NAME)) {
            byte[] contents = new byte[fileInputStream.available()];
            fileInputStream.read(contents);
            String text = new String(contents);
            fileInputStream.close();
            return text+"\n";
        } catch (IOException e) {
            return t;
        }
    }
}

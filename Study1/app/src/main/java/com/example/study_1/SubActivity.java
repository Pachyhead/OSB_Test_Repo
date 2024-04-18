package com.example.study_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        tv_sub1 = findViewById(R.id.tv_sub1);

        Intent intent = getIntent();
        // 출발 activity가 던진 intent를 잡는 함수임.
        String str = intent.getStringExtra("str");
        // intent 내부의 것들 중 별명이 "str"인걸 가져와서 str에 담음

        tv_sub1.setText(str);
        // tv_sub1 이라는 xml textView에 text 값을 넣음.

    }
}
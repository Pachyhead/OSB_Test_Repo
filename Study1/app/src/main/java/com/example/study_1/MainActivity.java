package com.example.study_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // 클래스가 import 안 되었을 떄는, alt enter을 해라. 물론 사용자 정의 class말고.

    private Button btn_move;
    private EditText et_test;
    private String str;
    private ImageView imageView;
    // 자바는 파일 하나하나가 클래스이다! private은 다른 class에서 못쓰게 하는거!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // onCreate: 어플을 실행했을 때, 처음으로 실행되는 생명주기.
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test);
        // getText()를 하면 String 형태가 아니다. 그래서 toString().

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent  = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str);
                // "str"은 별명임. sub에서 받을 때 쓸 별명.
                // 매개변수는 key, value 쌍으로 전달되는데, 자료형은 명시해도 되고, 알아서 적용해서 함수를 오버로드함.
                // intent라는 클래스에 str을 담는거임.
                startActivity(intent);
                // 액티비티 이동 구문.
                // startActivity는 intent에 저장된 activity를 스택 형식으로 시작함. 이때 intent도 목적 activity에 전달함.
                // 던져진 intent를 getIntent() 함수를 통해 받음.

            }
        });
        // xml에서 생성된 모든 id들은 xml 파일이 달라도 같은 R.id 클래스에서 전역적으로 관리함.
        // findViewId는 괄호 안의 element를 찾아서 반환하는 거임

        imageView = (ImageView) findViewById(R.id.img_android);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "여호와", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
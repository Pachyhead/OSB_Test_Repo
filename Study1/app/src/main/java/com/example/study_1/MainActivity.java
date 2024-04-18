package com.example.study_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;
    // 클래스가 import 안 되었을 떄는, alt enter을 해라. 물론 사용자 정의 class말고.

    private Button btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // onCreate: 어플을 실행했을 때, 처음으로 실행되는 생명주기.
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent); // 액티비티 이동 구문

            }
        });
        // R은 resource를 의미, 여기서는 activity_main.xml인듯?
        // xml에서 생성된 모든 id들은 xml 파일이 달라도 같은 R.id 클래스에서 전역적으로 관리함.
        // findViewId는 괄호 안의 element를 찾아서 반환하는 거임
    }
}
package io.vig.drawapp.mifysolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.vig.drawapp.mifysolution.Login.Vue.MainActivity;

public class FirstPage extends AppCompatActivity {
    private Button login;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        init();
    }

    private void init(){

        login=(Button) findViewById(R.id.login);
        register=(Button) findViewById(R.id.register);
       listenLogin();
    }

    private void listenLogin(){
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                   Intent intent= new Intent(FirstPage.this, MainActivity.class);
                        startActivity(intent);
                       // overridePendingTransition(R.anim.slide_in_rigth, fade_in);
            }


        });

    }
}
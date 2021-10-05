package io.vig.drawapp.mifysolution.Register.Vue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.vig.drawapp.mifysolution.R;

public class Register1 extends AppCompatActivity {
    private Button follow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        init();
    }

    private void init(){

        follow=(Button) findViewById(R.id.suivant);
       listenLogin();
    }

    private void listenLogin(){
        follow.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Register1.this, Register2.class);
                startActivity(intent);
                // overridePendingTransition(R.anim.slide_in_rigth, fade_in);
            }


        });

    }
}
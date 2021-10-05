package io.vig.drawapp.mifysolution.Login.Vue;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.vig.drawapp.mifysolution.HomePage.Vue.HomePage;
import io.vig.drawapp.mifysolution.Login.Controller.Controller;
import io.vig.drawapp.mifysolution.R;
import io.vig.drawapp.mifysolution.Register.Vue.Register1;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private Button login;
    private Button register;
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
        this.controller=Controller.getInstance();
    }

    private void init(){
        userName=(EditText)findViewById(R.id.UserName);
        password=(EditText)findViewById(R.id.Password);
        login=(Button) findViewById(R.id.login);
        register=(Button) findViewById(R.id.register);

        listenLogin();
    }

    private void listenLogin(){
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name="";
                String code="";
                try {
                    name= String.valueOf(userName.getText());
                    code =String.valueOf(password.getText());
                }catch (Exception e){};

                if (name.isEmpty()||code.isEmpty()){
                    Toast.makeText(MainActivity.this,"Saisi incorrecte",Toast.LENGTH_SHORT).show();
                } else {
                   if (checkProfile(name,code)){ Intent intent= new Intent(MainActivity.this, HomePage.class);
                        startActivity(intent);
                   }


                }
            }


        });

        register.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent = new Intent(MainActivity.this, Register1.class);
                    startActivity(intent);
                }
            }


        });

    }


    private boolean checkProfile(String name,String code){
        this.controller.checkProfile(name,code);
        Boolean ans=this.controller.ans();
        String message=this.controller.message();
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
        return ans;
    }
}
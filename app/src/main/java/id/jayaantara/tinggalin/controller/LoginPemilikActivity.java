package id.jayaantara.tinggalin.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.jayaantara.tinggalin.R;

public class LoginPemilikActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pemilik);

        tv_register =findViewById(R.id.tv_register);
        tv_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tv_register:
                toRegister();
                break;
        }
    }

    //    Register Function
    public void toRegister(){
        Intent toRegisterPemilikActivityIntent = new Intent(getApplicationContext(), RegisterPemilikActivity.class);
        startActivity(toRegisterPemilikActivityIntent);
    }
}
package com.hmdm.wifimanager.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.hmdm.wifimanager.R;

public class LoginActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    String user="";
    String pass="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName = findViewById(R.id.edtUserName);
        password = findViewById(R.id.edtUserPassword);
    }

    public void loginBtn(View view) {
        user = userName.getText().toString();
        pass = password.getText().toString();
        if (user.matches("")) {
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
            return;
        }else if (pass.matches("")) {
            Toast.makeText(this, "You did not enter a password", Toast.LENGTH_SHORT).show();
            return;
        }else {
            Intent intent = new Intent(LoginActivity.this, DashActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Login Successful...", Toast.LENGTH_SHORT).show();
        }
    }
}
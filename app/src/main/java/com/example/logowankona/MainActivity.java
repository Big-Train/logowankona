package com.example.logowankona;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("admin") && password.equals("password")) {
                    // Logowanie udane
                    Toast.makeText(MainActivity.this, "Logowanie udane!", Toast.LENGTH_SHORT).show();
                } else {
                    // Logowanie nieudane
                    Toast.makeText(MainActivity.this, "Błąd logowania. Spróbuj ponownie.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

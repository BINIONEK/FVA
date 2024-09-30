package com.example.formvalidationapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextSurname;
    private EditText editTextEmailAddress;
    private EditText editTextPhoneNumber;
    private EditText editTextPassword;
    private EditText editTextPasswordConfirmation;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextSurname = findViewById(R.id.editTextSurname);
        editTextEmailAddress = findViewById(R.id.editEmailAddress);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextPassword = findViewById(R.id.editTextPasssword);
        editTextPasswordConfirmation = findViewById(R.id.editTextPassswordConfirmation);
        buttonSubmit = findViewById(R.id.buttonSubmit);
    }
}
package com.example.mvponly.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvponly.R;
import com.example.mvponly.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{
    private static final String TAG = "MainActivity";
    private EditText enteredText;
    private TextView textAdded;
    private Button buttonAddText;
    private MainPresenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        enteredText = findViewById(R.id.enteredText);
        textAdded = findViewById(R.id.textViewAdded);
        buttonAddText = findViewById(R.id.buttonAdd);

        mainPresenter = new MainPresenter(this);

    }

    @Override
    public void setAddedText(String text) {

    }
}

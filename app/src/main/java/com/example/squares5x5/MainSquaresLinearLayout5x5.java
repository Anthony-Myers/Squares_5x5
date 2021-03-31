package com.example.squares5x5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainSquaresLinearLayout5x5 extends AppCompatActivity {
    Button goToConstraintLayoutButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_5x5_square);
        goToConstraintLayoutButton = findViewById(R.id.go_to_constraint_layout_button);
        goToConstraintLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToConstraintLayout();
            }
        });
    }

    public void goToConstraintLayout(){
        Intent intent = new Intent(this, SquaresConstraintLayout5x5.class);
        setIntent(intent);
    }
}

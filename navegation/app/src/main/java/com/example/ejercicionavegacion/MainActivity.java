package com.example.ejercicionavegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicionavegacion.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(binding.toolbar);

        binding.actionGotoDrawerActivity.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, DrawerActivity.class)));

        binding.actionGotoBottomActivity.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, BottonActivity.class)));

        binding.actionGotoOptionsActivity.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, OptionsActivity.class)));

        binding.actionGotoTabbedActivity.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, TabbedActivity.class)));
    }
}
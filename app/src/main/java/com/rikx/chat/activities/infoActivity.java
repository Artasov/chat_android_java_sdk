package com.rikx.chat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rikx.chat.R;
import com.rikx.chat.databinding.ActivityChatBinding;
import com.rikx.chat.databinding.ActivityInfoBinding;

public class infoActivity extends AppCompatActivity {
    private ActivityInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }


}
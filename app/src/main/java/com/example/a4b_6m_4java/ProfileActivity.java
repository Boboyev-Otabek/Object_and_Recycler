package com.example.a4b_6m_4java;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a4b_6m_4java.model.Member;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();
    }
    void initView(){
        TextView text=findViewById(R.id.text);

        Member member=(Member)getIntent().getSerializableExtra("full");
        text.setText(member.toString());
    }
}

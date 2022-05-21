package com.example.a4b_6m_4java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.a4b_6m_4java.adapter.AdapterMember;
import com.example.a4b_6m_4java.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    void initView() {
        context = this;
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new GridLayoutManager(context, 3));


        List<Member> members = MemberAdd();

        refreshAdapter(members);

    }

    void refreshAdapter(List<Member> members) {
        AdapterMember adapterMember = new AdapterMember(this, members);
        recyclerview.setAdapter(adapterMember);
    }

    public void open_profile(Member member) {
        Log.d("xxx", "click " + member.getIsm());

        Intent intent=new Intent(this,ProfileActivity.class);
        intent.putExtra("full",member);
        startActivity(intent);


    }

    List<Member> MemberAdd() {
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < 21; i++) {
            members.add(new Member("Otabek " + i, "Boboyev " + i));
        }
        return members;

    }

}
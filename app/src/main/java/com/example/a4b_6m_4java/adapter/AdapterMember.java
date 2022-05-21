package com.example.a4b_6m_4java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4b_6m_4java.MainActivity;
import com.example.a4b_6m_4java.R;
import com.example.a4b_6m_4java.model.Member;

import java.util.List;

public class AdapterMember extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Member> members;
    MainActivity mainActivity;

    public AdapterMember(MainActivity mainActivity, List<Member> members) {
        this.mainActivity = mainActivity;
        this.members = members;
    }



    @Override
    public int getItemCount() {
        return members.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new Memberholder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof Memberholder) {
            Member member = members.get(position);

            LinearLayout linear_layout= ((Memberholder) holder).linear_layout;
            TextView ism = ((Memberholder) holder).ism;
            TextView familiya = ((Memberholder) holder).familiya;

            linear_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                  mainActivity.open_profile(member);
                }
            });
            ism.setText(member.getIsm());
            familiya.setText(member.getFamiliya());
        }
    }



    class Memberholder extends RecyclerView.ViewHolder {

        View view;
        LinearLayout linear_layout;
        TextView ism, familiya;

        Memberholder(View v) {
            super(v);
            view = v;
            linear_layout=v.findViewById(R.id.linear_layout);
            ism = v.findViewById(R.id.ism);
            familiya = v.findViewById(R.id.familiya);
        }
    }
}

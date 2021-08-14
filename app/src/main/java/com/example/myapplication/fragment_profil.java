package com.example.myapplication.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;


public class fragment_profil extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            ,Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_profil, container, false);

        ImageView ivProfileFoto = rootView.findViewById(R.id.ivFotoProfile);
        Glide.with(this)
                .load(R.drawable.profile)
                .into(ivProfileFoto);
        return rootView;
    }
}
package com.example.pojikajiapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class ColorSelectFragment extends Fragment {

    public static Fragment newInstance(ColorSelectState state){
        Bundle args = new Bundle();
        args.putString("color",state.name());
        Fragment fragment = new ColorSelectFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        String colorName = getArguments().getString("color", ColorSelectState.tomato.name());
        int resId = R.drawable.gold_circle_shape;
        switch (colorName){
            case "gold":
                resId = R.drawable.gold_circle_shape;
                break;
            case "pink":
                resId = R.drawable.pink_circle_shape;
                break;
            case "royalblue":
                resId = R.drawable.royalblue_circle_shape;
                break;
            case "seagreen":
                resId = R.drawable.seagreen_circle_shape;
                break;
            case "skyblue":
                resId = R.drawable.skyblue_circle_shape;
                break;
            case "tomato":
                resId = R.drawable.tomato_circle_shape;
                break;
        }
        Drawable drawableRes = ContextCompat.getDrawable(getActivity(), resId);
        view.findViewById(R.id.color_view).setBackground(drawableRes);
    }

}

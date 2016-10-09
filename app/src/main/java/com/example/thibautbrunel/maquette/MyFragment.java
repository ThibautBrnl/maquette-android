package com.example.thibautbrunel.maquette;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by stamper on 08/10/2016.
 */
public class MyFragment extends Fragment {

    int layout;

    @Override
    public void setArguments(Bundle args) {
        this.layout = args.getInt("layout");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(this.layout, null);

        switch (this.layout) {
            case R.layout.content_main:
                v.findViewById(R.id.first_recipe).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), MyAccountActivity.class);
                        intent.putExtra("layout", R.layout.activity_recette);
                        startActivity(intent);
                    }
                });
                break;
        }
        return v;
    }
}

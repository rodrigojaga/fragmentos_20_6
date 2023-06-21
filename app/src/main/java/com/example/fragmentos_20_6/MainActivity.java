package com.example.fragmentos_20_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentContainer = findViewById(R.id.fragmentContainerView2);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            loadVerticalFragment();
        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            loadHorizontalFragment();

        }
    }

    private void loadVerticalFragment(){
        VerticalFragment verticalFragment = new VerticalFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView2,verticalFragment);
        ((FragmentTransaction)transaction).commit();
    }

    private void loadHorizontalFragment(){
        HorizontalFragment horizontalFragment = new HorizontalFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainerView2,horizontalFragment);
        ((FragmentTransaction)transaction).commit();
    }

}
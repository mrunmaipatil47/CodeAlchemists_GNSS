package com.example.codealchemistsgnss;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new HomeFragment());

//        Button Activate = findViewById(R.id.button_activate);
//        Activate.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mapFragment, null));
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.nav_host_fragment).navigateUp();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        System.out.println(uri);
    }




}
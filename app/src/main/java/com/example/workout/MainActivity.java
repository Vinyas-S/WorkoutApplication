package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements WorkoutListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public void itemClicked(long Id) {
        Intent intent=new Intent(this,DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID,(int) Id);
        startActivity(intent);
    }
}

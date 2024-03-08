package com.example.harittask4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

import com.example.harittask4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Binding main activity with view
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Setting rating bar value and text for Restaurant 1
        binding.restaurant1.rtAloette.setNumStars(5);
        binding.restaurant1.rtAloette.setRating(0);
        binding.restaurant1.tvRatingAloette.setText(String.valueOf(binding.restaurant1.rtAloette.getRating()));

        //Setting rating bar value and text for Restaurant 2
        binding.restaurant2.rtCanoe.setNumStars(5);
        binding.restaurant2.rtCanoe.setRating(0);
        binding.restaurant2.tvRatingCanoe.setText(String.valueOf(binding.restaurant1.rtAloette.getRating()));

        //Setting rating bar value and text for Restaurant 3
        binding.restaurant3.rtGrandMehfil.setNumStars(5);
        binding.restaurant3.rtGrandMehfil.setRating(0);
        binding.restaurant3.tvRatingGrandMehfil.setText(String.valueOf(binding.restaurant1.rtAloette.getRating()));

        //Setting rating bar value and text for Restaurant 4
        binding.restaurant4.rtLena.setNumStars(5);
        binding.restaurant4.rtLena.setRating(0);
        binding.restaurant4.tvRatingLena.setText(String.valueOf(binding.restaurant1.rtAloette.getRating()));

        //Setting rating bar value and text for Restaurant 5
        binding.restaurant5.rtScaramouch.setNumStars(5);
        binding.restaurant5.rtScaramouch.setRating(0);
        binding.restaurant5.tvRatingScaramouch.setText(String.valueOf(binding.restaurant1.rtAloette.getRating()));

        //Setting listeners for all restaurant
        setListeners();
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        //Check for which rating bar is clicked and set value according to text view
        if (ratingBar.getId() == R.id.rtAloette) {
            binding.restaurant1.tvRatingAloette.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == R.id.rtCanoe) {
            binding.restaurant2.tvRatingCanoe.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == R.id.rtGrandMehfil) {
            binding.restaurant3.tvRatingGrandMehfil.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == R.id.rtLena) {
            binding.restaurant4.tvRatingLena.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == R.id.rtScaramouch) {
            binding.restaurant5.tvRatingScaramouch.setText(String.valueOf(rating));
        }
    }
    private void setListeners(){
        binding.restaurant1.rtAloette.setOnRatingBarChangeListener(this);
        binding.restaurant2.rtCanoe.setOnRatingBarChangeListener(this);
        binding.restaurant3.rtGrandMehfil.setOnRatingBarChangeListener(this);
        binding.restaurant4.rtLena.setOnRatingBarChangeListener(this);
        binding.restaurant5.rtScaramouch.setOnRatingBarChangeListener(this);
    }
}
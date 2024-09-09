package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "onCreate() called");

        // Add WeatherFragment
        WeatherFragment weatherFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.weather_fragment, weatherFragment).commit();

        // Add ForecastFragment
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}

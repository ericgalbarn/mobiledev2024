package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ForecastFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Create the main LinearLayout
        LinearLayout mainLayout = new LinearLayout(requireContext());
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        // Set background color
        mainLayout.setBackgroundColor(0x200000FF); // Blue with 20% opacity

        // Create TextView for the day
        TextView dayText = new TextView(requireContext());
        dayText.setText(R.string.thursday);
        dayText.setTextSize(20);
        mainLayout.addView(dayText);


        // Create ImageView for the weather icon
        ImageView weatherIcon = new ImageView(getContext());
        weatherIcon.setImageResource(R.drawable.sunny);
        weatherIcon.setLayoutParams(new LinearLayout.LayoutParams(
                144, 144)); // Set the size to 144x144 pixels
        mainLayout.addView(weatherIcon);

        return mainLayout;
    }
}
package com.sanjidaahmed.sansandroidprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project gettingStartedProject = new Project("Getting Started App", "This is the demo description line of the app", 5);

        Project[] projects = {

                new Project("Getting Started App", "This is the demo description line of the app", R.drawable.getting_started),
                new Project("San Quote", "This is the demo description line of the app", R.drawable.quote),
                new Project("BMI Calculator", "This is the demo description line of the app", R.drawable.calculator),
                new Project("Inches Converter", "This is the demo description line of the app", R.drawable.tape),
                new Project("The Hungry Developer", "This is the demo description line of the app", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

        };
    }
package com.donaboyev.scorekeeperappandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textScoreTeam1;
    private TextView textScoreTeam2;
    private TextView textFoulTeam1;
    private TextView textFoulTeam2;
    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;
    private int foulsTeam1 = 0;
    private int foulsTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
    }

    private void loadViews() {
        textScoreTeam1 = findViewById(R.id.textScore1);
        textScoreTeam2 = findViewById(R.id.textScore2);
        textFoulTeam1 = findViewById(R.id.textFoulTeam1);
        textFoulTeam2 = findViewById(R.id.textFoulTeam2);
        final Button buttonAddFoulTeam1 = findViewById(R.id.buttonAddFoulTeam1);
        final Button buttonAddFoulTeam2 = findViewById(R.id.buttonAddFoulTeam2);
        final Button buttonAddScore1Team1 = findViewById(R.id.buttonAddScore1Team1);
        final Button buttonAddScore2Team1 = findViewById(R.id.buttonAddScore2Team1);
        final Button buttonAddScore3Team1 = findViewById(R.id.buttonAddScore3Team1);
        final Button buttonAddScore1Team2 = findViewById(R.id.buttonAddScore1Team2);
        final Button buttonAddScore2Team2 = findViewById(R.id.buttonAddScore2Team2);
        final Button buttonAddScore3Team2 = findViewById(R.id.buttonAddScore3Team2);
        final Button buttonReset = findViewById(R.id.buttonReset);

        buttonAddFoulTeam1.setOnClickListener(view -> addFoulTeam1());
        buttonAddFoulTeam2.setOnClickListener(view -> addFoulTeam2());
        buttonAddScore1Team1.setOnClickListener(view -> addScoreTeam1(1));
        buttonAddScore2Team1.setOnClickListener(view -> addScoreTeam1(2));
        buttonAddScore3Team1.setOnClickListener(view -> addScoreTeam1(3));
        buttonAddScore1Team2.setOnClickListener(view -> addScoreTeam2(1));
        buttonAddScore2Team2.setOnClickListener(view -> addScoreTeam2(2));
        buttonAddScore3Team2.setOnClickListener(view -> addScoreTeam2(3));
        buttonReset.setOnClickListener(view -> resetScores());
    }

    private void resetScores() {
        foulsTeam1 = 0;
        foulsTeam2 = 0;
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        textFoulTeam1.setText("0");
        textFoulTeam2.setText("0");
        textScoreTeam1.setText("0");
        textScoreTeam2.setText("0");
    }

    private void addScoreTeam1(int addScore) {
        scoreTeam1 += addScore;
        textScoreTeam1.setText(String.valueOf(scoreTeam1));
    }

    private void addScoreTeam2(int addScore) {
        scoreTeam2 += addScore;
        textScoreTeam2.setText(String.valueOf(scoreTeam2));
    }

    private void addFoulTeam1() {
        foulsTeam1++;
        textFoulTeam1.setText(String.valueOf(foulsTeam1));
    }

    private void addFoulTeam2() {
        foulsTeam2++;
        textFoulTeam2.setText(String.valueOf(foulsTeam2));
    }

}
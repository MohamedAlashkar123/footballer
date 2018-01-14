package com.example.alashkar.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int RedCardForTeamX = 0;

    int RedCardForTeamY = 0;

    int YellowCardForTeamX = 0;

    int YellowCardForTeamY = 0;

    int GoalForTeamX = 0;

    int GoalForTeamY = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addRedCardForTeamY(View view) {
        RedCardForTeamY = RedCardForTeamY + 1;
        TextView Red_Card_Y = (TextView) findViewById(R.id.red_card_team_y);
        Red_Card_Y.setText(String.valueOf(RedCardForTeamY));
    }

    public void addGoalForTeamX(View view) {
        GoalForTeamX = GoalForTeamX + 1;
        TextView Goals_X = (TextView) findViewById(R.id.add_goal_team_x);
        Goals_X.setText(String.valueOf(GoalForTeamX));
    }

    public void addRedCardForTeamX(View view) {
        RedCardForTeamX = RedCardForTeamX + 1;
        TextView Red_Card_X = (TextView) findViewById(R.id.red_card_team_x);
        Red_Card_X.setText(String.valueOf(RedCardForTeamX));
    }

    public void addYellowCardForTeamX(View view) {
        YellowCardForTeamX = YellowCardForTeamX + 1;
        TextView Yellow_Card_X = (TextView) findViewById(R.id.yellow_card_team_x);
        Yellow_Card_X.setText(String.valueOf(YellowCardForTeamX));
    }

    public void addGoalForTeamY(View view) {
        GoalForTeamY = GoalForTeamY + 1;
        TextView Goals_Y = (TextView) findViewById(R.id.add_goal_team_y);
        Goals_Y.setText(String.valueOf(GoalForTeamY));
    }

    public void addYellowCardForTeamY(View view) {
        YellowCardForTeamY = YellowCardForTeamY + 1;
        TextView Yellow_Card_Y = (TextView) findViewById(R.id.yellow_card_team_y);
        Yellow_Card_Y.setText(String.valueOf(YellowCardForTeamY));
    }

    public void resetScore(View view) {
        RedCardForTeamX = 0;

        RedCardForTeamY = 0;

        YellowCardForTeamX = 0;

        YellowCardForTeamY = 0;

        GoalForTeamX = 0;

        GoalForTeamY = 0;

        TextView Goals_X = (TextView) findViewById(R.id.add_goal_team_x);
        Goals_X.setText(String.valueOf(GoalForTeamX));

        TextView Goals_Y = (TextView) findViewById(R.id.add_goal_team_y);
        Goals_Y.setText(String.valueOf(GoalForTeamY));

        TextView Red_Card_X = (TextView) findViewById(R.id.red_card_team_x);
        Red_Card_X.setText(String.valueOf(RedCardForTeamX));

        TextView Red_Card_Y = (TextView) findViewById(R.id.red_card_team_y);
        Red_Card_Y.setText(String.valueOf(RedCardForTeamY));

        TextView Yellow_Card_X = (TextView) findViewById(R.id.yellow_card_team_x);
        Yellow_Card_X.setText(String.valueOf(YellowCardForTeamX));

        TextView Yellow_Card_Y = (TextView) findViewById(R.id.yellow_card_team_y);
        Yellow_Card_Y.setText(String.valueOf(YellowCardForTeamY));

    }
}

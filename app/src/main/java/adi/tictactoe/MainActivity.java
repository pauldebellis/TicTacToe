package adi.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView topLeft;
    TextView topMid;
    TextView topRight;
    TextView midLeft;
    TextView mid;
    TextView midRight;
    TextView lowerLeft;
    TextView lowerMid;
    TextView lowerRight;

    boolean turn = true; //true for X, false for O



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topLeft = (TextView) findViewById(R.id.topLeft);
        topMid = (TextView) findViewById(R.id.topMid);
        topRight = (TextView) findViewById(R.id.topRight);
        midLeft = (TextView) findViewById(R.id.midLeft);
        mid = (TextView) findViewById(R.id.mid);
        midRight = (TextView) findViewById(R.id.midRight);
        lowerLeft = (TextView) findViewById(R.id.lowerLeft);
        lowerMid = (TextView) findViewById(R.id.lowerMid);
        lowerRight = (TextView) findViewById(R.id.lowerRight);


        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn) {
                    topLeft.setText("X");
                } else {
                    topLeft.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        topMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                if (turn) {
                    topMid.setText("X");
                } else {
                    topMid.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        topRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {

                if (turn) {
                    topRight.setText("X");
                } else {
                    topRight.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        midLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {

                if (turn) {
                    midLeft.setText("X");
                } else {
                    midLeft.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {

                if (turn) {
                    mid.setText("X");
                } else {
                    mid.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        midRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {

                if (turn) {
                    midRight.setText("X");
                } else {
                    midRight.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        lowerLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view7) {

                if (turn) {
                    lowerLeft.setText("X");
                } else {
                    lowerLeft.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        lowerMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view8) {

                if (turn) {
                    lowerMid.setText("X");
                } else {
                    lowerMid.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });


        lowerRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view9) {

                if (turn) {
                    lowerRight.setText("X");
                } else {
                    lowerRight.setText("O");
                }
                turn = !turn;
                checkForWin();
            }
        });
    }



        void checkForWin() {
        boolean gameOver = false;

            if (topLeft.getText() == topMid.getText() && topMid.getText() == topRight.getText())
            gameOver = true;


        else if (topLeft.getText() == mid.getText() && mid.getText() == lowerRight.getText())
            gameOver = true;


        else if (topLeft.getText() == midLeft.getText() && midLeft.getText() == lowerLeft.getText())
            gameOver = true;


        else if (topMid.getText() == mid.getText() && mid.getText() == lowerMid.getText())
            gameOver = true;


        else if (topRight.getText() == mid.getText() && mid.getText() == lowerLeft.getText())
            gameOver = true;


        else if (topRight.getText() == midRight.getText() && midRight.getText() == lowerRight.getText())
            gameOver = true;


        else if (midLeft.getText() == mid.getText() && mid.getText() == midRight.getText())
            gameOver = true;


        else if (lowerLeft.getText() == lowerMid.getText() && lowerMid.getText() == lowerRight.getText())
            gameOver = true;

        if (gameOver){
            if (turn) {

            Toast.makeText(this, "Somebody Won?", Toast.LENGTH_SHORT).show();
        }

        }

}




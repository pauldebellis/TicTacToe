package adi.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    TextView[] squareArray;


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


//        TRYING TO DRY THE CODE
//        squareArray = new TextView[]{topLeft, topMid, topRight, midLeft, mid, midRight, lowerLeft, lowerMid, lowerRight};
//        for (TextView i : squareArray) {
//            i.setOnClickListener(this);
//        }


        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn) {
                    topLeft.setText("X");
                } else {
                    topLeft.setText("O");
                }
                topLeft.setClickable(false);
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
                topMid.setClickable(false);
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
                topRight.setClickable(false);
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
                midLeft.setClickable(false);
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
                mid.setClickable(false);
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
                midRight.setClickable(false);
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
                lowerLeft.setClickable(false);
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
                lowerMid.setClickable(false);
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
                lowerRight.setClickable(false);
                turn = !turn;
                checkForWin();
            }
        });
    }


    void checkForWin() {
        boolean gameOver = false;

        if (((topLeft.getText() == "X") || (topLeft.getText() == "O"))
                && ((topMid.getText() == "X") || (topMid.getText() == "O"))
                && ((topRight.getText() == "X") || (topRight.getText() == "O"))) {

            if (topLeft.getText() == topMid.getText() && topMid.getText() == topRight.getText())
                gameOver = true;

        } else if (((topLeft.getText() == "X") || (topLeft.getText() == "O"))
                && ((mid.getText() == "X") || (mid.getText() == "O"))
                && ((lowerRight.getText() == "X") || (lowerRight.getText() == "O"))) {

            if (topLeft.getText() == mid.getText() && mid.getText() == lowerRight.getText())
                gameOver = true;

        } else if (((topLeft.getText() == "X") || (topLeft.getText() == "O"))
                && ((midLeft.getText() == "X") || (midLeft.getText() == "O"))
                && ((lowerLeft.getText() == "X") || (lowerLeft.getText() == "O"))) {

            if (topLeft.getText() == midLeft.getText() && midLeft.getText() == lowerLeft.getText())
                gameOver = true;

        } else if (((topMid.getText() == "X") || (topMid.getText() == "O"))
                && ((mid.getText() == "X") || (mid.getText() == "O"))
                && ((lowerMid.getText() == "X") || (lowerMid.getText() == "O"))) {

            if (topMid.getText() == mid.getText() && mid.getText() == lowerMid.getText())
                gameOver = true;

        } else if (((topRight.getText() == "X") || (topRight.getText() == "O"))
                && ((mid.getText() == "X") || (mid.getText() == "O"))
                && ((lowerLeft.getText() == "X") || (lowerLeft.getText() == "O"))) {

            if (topRight.getText() == mid.getText() && mid.getText() == lowerLeft.getText())
                gameOver = true;

        } else if (((topRight.getText() == "X") || (topRight.getText() == "O"))
                && ((midRight.getText() == "X") || (midRight.getText() == "O"))
                && ((lowerRight.getText() == "X") || (lowerRight.getText() == "O"))) {

            if (topRight.getText() == midRight.getText() && midRight.getText() == lowerRight.getText())
                gameOver = true;

        } else if (((midLeft.getText() == "X") || (midLeft.getText() == "O"))
                && ((mid.getText() == "X") || (mid.getText() == "O"))
                && ((midRight.getText() == "X") || (midRight.getText() == "O"))) {

            if (midLeft.getText() == mid.getText() && mid.getText() == midRight.getText())
                gameOver = true;

        } else if (((lowerLeft.getText() == "X") || (lowerLeft.getText() == "O"))
                && ((lowerMid.getText() == "X") || (lowerMid.getText() == "O"))
                && ((lowerRight.getText() == "X") || (lowerRight.getText() == "O"))) {

            if (lowerLeft.getText() == lowerMid.getText() && lowerMid.getText() == lowerRight.getText())
                gameOver = true;

//      DRAW LOGIC
        } if ((topRight.getText().toString().equals("X")||topRight.getText().toString().equals("O"))
                &&(topMid.getText().toString().equals("X")||topMid.getText().toString().equals("O"))
                &&(topLeft.getText().toString().equals("X")||topLeft.getText().toString().equals("O"))
                &&(midLeft.getText().toString().equals("X")||midLeft.getText().toString().equals("O"))
                &&(mid.getText().toString().equals("X")||mid.getText().toString().equals("O"))
                &&(midRight.getText().toString().equals("X")||midRight.getText().toString().equals("O"))
                &&(lowerLeft.getText().toString().equals("X")||lowerLeft.getText().toString().equals("O"))
                &&(lowerMid.getText().toString().equals("X")||lowerMid.getText().equals("O"))
                &&(lowerRight.getText().toString().equals("X")||lowerRight.getText().toString().equals("O")))
                {
                 Toast.makeText(this, "A draw. Boring.", Toast.LENGTH_SHORT).show();

        } if (gameOver) {
            if (turn) {
                Toast.makeText(this, "O Wins!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "X Wins!", Toast.LENGTH_SHORT).show();
            }
            topLeft.setEnabled(false);
            topMid.setEnabled(false);
            topRight.setEnabled(false);
            midLeft.setEnabled(false);
            mid.setEnabled(false);
            midRight.setEnabled(false);
            lowerLeft.setEnabled(false);
            lowerRight.setEnabled(false);
            lowerMid.setEnabled(false);
        }
    }

    @Override
    public void onClick(View view) {

    }
}




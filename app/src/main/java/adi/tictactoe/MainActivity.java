package adi.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//TOP LEFT SQUARE
        final TextView mTopLeft = (TextView) findViewById(R.id.topLeft);
        mTopLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mTopLeft.getText().equals("X")) {
                    mTopLeft.setText("O");
                } else {
                    mTopLeft.setText("X");
                }
            }
        });
//TOP MIDDLE SQUARE
        final TextView mTopMid = (TextView) findViewById(R.id.topMid);
        mTopMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                if (mTopMid.getText().equals("X")) {
                    mTopMid.setText("O");
                } else {
                    mTopMid.setText("X");
                }
            }
        });
//TOP RIGHT SQUARE
        final TextView mTopRight = (TextView) findViewById(R.id.topRight);
        mTopRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {

                if (mTopRight.getText().equals("X")) {
                    mTopRight.setText("O");
                } else {
                    mTopRight.setText("X");
                }
            }
        });
//MIDDLE LEFT SQUARE
        final TextView mMidLeft = (TextView) findViewById(R.id.midLeft);
        mMidLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {

                if (mMidLeft.getText().equals("X")) {
                    mMidLeft.setText("O");
                } else {
                    mMidLeft.setText("X");
                }
            }
        });
//MIDDLE SQUARE
        final TextView mMid = (TextView) findViewById(R.id.mid);
        mMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {

                if (mMid.getText().equals("X")) {
                    mMid.setText("O");
                } else {
                    mMid.setText("X");
                }
            }
        });
//MIDDLE RIGHT SQUARE
        final TextView mMidRight = (TextView) findViewById(R.id.midRight);
        mMidRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {

                if (mMidRight.getText().equals("X")) {
                    mMidRight.setText("O");
                } else {
                    mMidRight.setText("X");
                }
            }
        });
        //LOWER LEFT SQUARE
        final TextView mLowerLeft = (TextView) findViewById(R.id.lowerLeft);
        mLowerLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view7) {

                if (mLowerLeft.getText().equals("X")) {
                    mLowerLeft.setText("O");
                } else {
                    mLowerLeft.setText("X");
                }
            }
        });
//        LOWER MIDDLE SQUARE
        final TextView mLowerMid = (TextView) findViewById(R.id.lowerMid);
        mLowerMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view8) {

                if (mLowerMid.getText().equals("X")) {
                    mLowerMid.setText("O");
                } else {
                    mLowerMid.setText("X");
                }
            }
        });
//        LOWER RIGHT SQUARE
        final TextView mLowerRight = (TextView) findViewById(R.id.lowerRight);
        mLowerRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view9) {

                if (mLowerRight.getText().equals("X")) {
                    mLowerRight.setText("O");
                } else {
                    mLowerRight.setText("X");
                }
            }
        });
    }
}

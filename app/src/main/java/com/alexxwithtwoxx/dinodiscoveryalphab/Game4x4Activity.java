package com.alexxwithtwoxx.dinodiscoveryalphab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class Game4x4Activity extends AppCompatActivity {

    private int numOfElements;

    private MemoryButton[] buttons;

    private int[] buttonGraphicLocations;
    private int[] buttonGraphics;

    private MemoryButton selectedButton1;
    private MemoryButton selectedButton2;

    private boolean isBusy = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4x4);

        GridLayout gridLayout = (GridLayout)findViewById(R.id.grid_layout_4x4);

        int numColumns = gridLayout.getColumnCount();
        int numRows = gridLayout.getRowCount();

        numOfElements = numColumns + numRows;

        buttons = new MemoryButton[numOfElements];

        buttonGraphics = new int[numOfElements / 2];

        buttonGraphics[0] = R.drawable.button_1;
    }
}

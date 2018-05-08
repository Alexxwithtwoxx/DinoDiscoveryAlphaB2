package com.alexxwithtwoxx.dinodiscoveryalphab;

import android.content.Context;

public class MemoryButton {

    protected  int row;
    protected int column;
    protected int frontDrawableID;

    protected boolean isFlipped = false;
    protected boolean isMatched = false;

    public MemoryButton(Context context, int r, int c, int frontImageDrawableID) {
        super(context);

        row = r;
        column = c;
        frontDrawableID = frontImageDrawableID;
    }

}

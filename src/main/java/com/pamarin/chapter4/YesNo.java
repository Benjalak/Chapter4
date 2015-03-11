
package com.pamarin.chapter4;


public enum YesNo {

    YES(1), NO(0);

    private int score;

    private YesNo(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}

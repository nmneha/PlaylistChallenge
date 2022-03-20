package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int up = 0;
        int down = 0;
        int loopClick = 0;
        //checking for clicks without looping around playlist
        for (int i = 0; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                if (i > startIndex) {
                    down = i - startIndex;
                } else if (i < startIndex) {
                    up = startIndex - i;
                }
                loopClick = (startIndex) + ((playList.length) - i);
            }
        }
        if (up == loopClick) {
            return up;
        } else if (down == loopClick) {
            return down;
        }
        return loopClick;
    }
}
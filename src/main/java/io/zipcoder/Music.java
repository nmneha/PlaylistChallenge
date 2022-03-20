package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int clicks = 0;
        for (int i = 0; i < playList.length; i++) {
            if (selection == playList[i]) {
                if (i > startIndex) {
                   clicks = i- startIndex;
                } else {
                    clicks = startIndex - i;
                }
            }
        }

        return clicks;
    }
}

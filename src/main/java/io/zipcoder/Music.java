package io.zipcoder;

import java.util.TreeMap;
import java.util.TreeSet;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int up = 0;
        int down = 0;
        int loopClick = 0;
        TreeSet<Integer> clicks = new TreeSet();
        for (int i = 0; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                if (i > startIndex) {
                    down = i - startIndex;
                    clicks.add(down);
                } else if (i < startIndex) {
                    up = startIndex - i;
                    clicks.add(up);
                }
                loopClick = (startIndex) + ((playList.length) - i);
                clicks.add(loopClick);
            }
        }
        System.out.println(clicks);
        return clicks.first();
    }
}
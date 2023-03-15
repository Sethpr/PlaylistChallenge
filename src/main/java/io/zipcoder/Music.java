package io.zipcoder;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        ArrayList<Integer> targets = new ArrayList<>();
        int variance = Integer.MAX_VALUE;
        for (int i = 0; i < playList.length; i++) {
            if(playList[i].equals(selection)){
                targets.add(i);
            }

        }
        
        targets.add(targets.get(targets.size()-1) - playList.length);
        targets.add(targets.get(0)+ playList.length);

        for(Integer i:targets){
            if(Math.abs(startIndex-i)<variance){
                variance = Math.abs(startIndex-i);
            }
        }


        return variance;
    }
}

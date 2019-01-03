package com.yun.learn.utils.threadsmasterwork;

import java.util.List;
import java.util.Map;

/**
 * @author Murphy
 * @date 2019/1/2
 */
public class Tasks {

    ImportService importSerivce;

    public Tasks(){

    }

    public List<Map<String, Object>> getMaplist() {
        return maplist;
    }

    public void setMaplist(List<Map<String, Object>> maplist) {
        this.maplist = maplist;
    }

    public List<Map<String,Object>> maplist;

    public int processdate(){
        //importSerivce.processdate(maplist);
        return maplist.size();
    }

}

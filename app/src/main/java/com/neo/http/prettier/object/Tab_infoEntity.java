package com.neo.http.prettier.object;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class Tab_infoEntity implements Serializable {

    /**
     * tab_type : choice
     * tab_name : 精选
     * content_type : 1
     */

    private String tab_type;
    private String tab_name;
    private int content_type;

    public String getTab_type() {
        return tab_type;
    }

    public void setTab_type(String tab_type) {
        this.tab_type = tab_type;
    }

    public String getTab_name() {
        return tab_name;
    }

    public void setTab_name(String tab_name) {
        this.tab_name = tab_name;
    }

    public int getContent_type() {
        return content_type;
    }

    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }
}

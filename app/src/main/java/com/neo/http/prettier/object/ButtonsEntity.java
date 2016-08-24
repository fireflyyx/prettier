package com.neo.http.prettier.object;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class ButtonsEntity implements Serializable {

    /**
     * url : gengmei://diaries?from=home
     * visible : true
     * name : 看日记
     * icon : http://hera.s.gmei.com/2016/05/27/b882bd7c97
     */

    private String url;
    private boolean visible;
    private String name;
    private String icon;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

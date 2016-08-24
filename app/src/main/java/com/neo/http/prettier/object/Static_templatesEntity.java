package com.neo.http.prettier.object;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class Static_templatesEntity implements Serializable {

    /**
     * url : gengmei://welfare_special?service_id=616
     * image : http://hera.s.gmei.com/2016/08/22/aa4ed9f9c3
     */

    private String url;
    private String image;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

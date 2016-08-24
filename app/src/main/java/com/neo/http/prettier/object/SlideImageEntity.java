package com.neo.http.prettier.object;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class SlideImageEntity implements Serializable {

    /**
     * slide_img : http://hera.s.gmei.com/slide/2016/08/19/d915a2b364
     * slide_url : gengmei://welfare_special?service_id=614
     * id : 1149
     */

    private String slide_img;
    private String slide_url;
    private int id;

    public String getSlide_img() {
        return slide_img;
    }

    public void setSlide_img(String slide_img) {
        this.slide_img = slide_img;
    }

    public String getSlide_url() {
        return slide_url;
    }

    public void setSlide_url(String slide_url) {
        this.slide_url = slide_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

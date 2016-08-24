package com.neo.http.prettier.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class DiariesEntity1 implements Serializable {

    /**
     * banner_id : 1146
     * url : gengmei://diary?diary_id=11075454
     * diary_id : 1146
     * content : 卷尾猫伢伢：医生技术太赞，恢复快效果好让人看不出做了整形~
     * images : [{"image_wide":"http://hera.s.gmei.com/banner/2016/08/18/18a96910e9-wide","image":"http://hera.s.gmei.com/banner/2016/08/18/18a96910e9","image_half":"http://hera.s.gmei.com/banner/2016/08/18/18a96910e9","desc":"","image_thumb":"http://hera.s.gmei.com/banner/2016/08/18/18a96910e9-thumb"}]
     * type : 1
     */

    private int banner_id;
    private String url;
    private int diary_id;
    private String content;
    private String type;
    /**
     * image_wide : http://hera.s.gmei.com/banner/2016/08/18/18a96910e9-wide
     * image : http://hera.s.gmei.com/banner/2016/08/18/18a96910e9
     * image_half : http://hera.s.gmei.com/banner/2016/08/18/18a96910e9
     * desc :
     * image_thumb : http://hera.s.gmei.com/banner/2016/08/18/18a96910e9-thumb
     */

    private List<ImagesBean> images;

    public int getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(int banner_id) {
        this.banner_id = banner_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDiary_id() {
        return diary_id;
    }

    public void setDiary_id(int diary_id) {
        this.diary_id = diary_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ImagesBean> getImages() {
        return images;
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }

    public static class ImagesBean {
        private String image_wide;
        private String image;
        private String image_half;
        private String desc;
        private String image_thumb;

        public String getImage_wide() {
            return image_wide;
        }

        public void setImage_wide(String image_wide) {
            this.image_wide = image_wide;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImage_half() {
            return image_half;
        }

        public void setImage_half(String image_half) {
            this.image_half = image_half;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getImage_thumb() {
            return image_thumb;
        }

        public void setImage_thumb(String image_thumb) {
            this.image_thumb = image_thumb;
        }
    }
}

package com.neo.http.prettier.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class DiariesEntity0 implements Serializable {

    /**
     * diary_num : 9
     * title_style_type :
     * reply_num : 228
     * is_following : false
     * images : [{"image_wide":"http://pic.gmei.com/2016/08/05/72d7c188a7-wide","image_thumb":"http://pic.gmei.com/2016/08/05/72d7c188a7-thumb","image":"http://pic.gmei.com/2016/08/05/72d7c188a7-w","image_half":"http://pic.gmei.com/2016/08/05/72d7c188a7-half","desc":"Before"},{"image_wide":"http://pic.gmei.com/2016/08/05/4109aea327-wide","image_thumb":"http://pic.gmei.com/2016/08/05/4109aea327-thumb","image":"http://pic.gmei.com/2016/08/05/4109aea327-w","image_half":"http://pic.gmei.com/2016/08/05/4109aea327-half","desc":"After"}]
     * latest_topic_id : 16485550
     * city : 北京
     * user_id : 24901668
     * title : null
     * user_portrait : http://pic.gmei.com/2016/07/28/a750fea12b-thumb
     * is_voted : false
     * diary_id : 12747475
     * tip : 发布 17 篇帖子，获得 1138 个赞
     * vote_num : 724
     * content : 马上已经20天了，脂肪已经相对来说稳定许多了，我把评论区的问题比较集中的回复一下...1.手术费多少钱？宝宝们，我做的时候还没出来活动价，所以全脸填充是19800，还需要另外付8800的prp，不过现在看到出活动了，好心痛啊！！！2.手术费好贵，没那么多钱怎么办？宝宝们问到重点了，可以办个分期付款每个月还几百块轻轻松松就变美啦！而且徐院长真的是很很恨负责呢~3.手术是全麻还是局麻？会痛吗？做全面部脂肪填充，我建议宝宝们还是做全麻吧，要是女战士做局麻也OK，全麻全程无痛（这话说的感觉像是要流产...）睡一觉就看到全都做好了哦！4.术后会肿吗？BB们，每个人的体质不一样，术后的反应也不一样...我术后输了三天液，所以完全没肿过一天....good！5.脂肪存活率高吗？BB们啊，宝宝也只是刚做十多天而已啊....存活率至少一个月以上才能看的出来吧。反正现在我觉得就挺好的~6.你填充了哪些部位？因为我面部凹陷太严重了，所以全脸额头，太阳穴，法令纹，鼻唇沟，泪沟，苹果肌我都有填很多7.填充完后大腿会留疤吗？大腿疼吗？有没有什么凹凸不平？只要忌口，护理的好不会留疤，大腿刚做完第一天疼，现在已经基本好了，没有凹凸不平哦！！！有其他问题，欢迎私信我哦~~~~来一起感受一下本公举~

     正看，侧看，斜看，45°看是不是都是超级童颜，超级美腻~对的没错，填充就是能起到这么神奇和unbelievable的功效。
     * user_nickname : Angelaruru
     * author_type : 0
     * tags : [{"type":"5","name":"美购日记","tag_id":1144},{"wiki_id":245,"type":"3","name":"自体脂肪丰面颊","tag_id":135}]
     * last_modified : 1471882904
     * date : 今天
     * membership_level : 0
     * view_num : 142655
     */

    private int diary_num;
    private String title_style_type;
    private int reply_num;
    private boolean is_following;
    private int latest_topic_id;
    private String city;
    private int user_id;
    private Object title;
    private String user_portrait;
    private boolean is_voted;
    private int diary_id;
    private String tip;
    private int vote_num;
    private String content;
    private String user_nickname;
    private String author_type;
    private int last_modified;
    private String date;
    private String membership_level;
    private String view_num;
    /**
     * image_wide : http://pic.gmei.com/2016/08/05/72d7c188a7-wide
     * image_thumb : http://pic.gmei.com/2016/08/05/72d7c188a7-thumb
     * image : http://pic.gmei.com/2016/08/05/72d7c188a7-w
     * image_half : http://pic.gmei.com/2016/08/05/72d7c188a7-half
     * desc : Before
     */

    private List<ImagesBean> images;
    /**
     * type : 5
     * name : 美购日记
     * tag_id : 1144
     */

    private List<TagsBean> tags;

    public int getDiary_num() {
        return diary_num;
    }

    public void setDiary_num(int diary_num) {
        this.diary_num = diary_num;
    }

    public String getTitle_style_type() {
        return title_style_type;
    }

    public void setTitle_style_type(String title_style_type) {
        this.title_style_type = title_style_type;
    }

    public int getReply_num() {
        return reply_num;
    }

    public void setReply_num(int reply_num) {
        this.reply_num = reply_num;
    }

    public boolean isIs_following() {
        return is_following;
    }

    public void setIs_following(boolean is_following) {
        this.is_following = is_following;
    }

    public int getLatest_topic_id() {
        return latest_topic_id;
    }

    public void setLatest_topic_id(int latest_topic_id) {
        this.latest_topic_id = latest_topic_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public String getUser_portrait() {
        return user_portrait;
    }

    public void setUser_portrait(String user_portrait) {
        this.user_portrait = user_portrait;
    }

    public boolean isIs_voted() {
        return is_voted;
    }

    public void setIs_voted(boolean is_voted) {
        this.is_voted = is_voted;
    }

    public int getDiary_id() {
        return diary_id;
    }

    public void setDiary_id(int diary_id) {
        this.diary_id = diary_id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getVote_num() {
        return vote_num;
    }

    public void setVote_num(int vote_num) {
        this.vote_num = vote_num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getAuthor_type() {
        return author_type;
    }

    public void setAuthor_type(String author_type) {
        this.author_type = author_type;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMembership_level() {
        return membership_level;
    }

    public void setMembership_level(String membership_level) {
        this.membership_level = membership_level;
    }

    public String getView_num() {
        return view_num;
    }

    public void setView_num(String view_num) {
        this.view_num = view_num;
    }

    public List<ImagesBean> getImages() {
        return images;
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public static class ImagesBean {
        private String image_wide;
        private String image_thumb;
        private String image;
        private String image_half;
        private String desc;

        public String getImage_wide() {
            return image_wide;
        }

        public void setImage_wide(String image_wide) {
            this.image_wide = image_wide;
        }

        public String getImage_thumb() {
            return image_thumb;
        }

        public void setImage_thumb(String image_thumb) {
            this.image_thumb = image_thumb;
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
    }

    public static class TagsBean {
        private String type;
        private String name;
        private int tag_id;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTag_id() {
            return tag_id;
        }

        public void setTag_id(int tag_id) {
            this.tag_id = tag_id;
        }
    }
}

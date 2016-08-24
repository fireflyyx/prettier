package com.neo.http.prettier.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.neo.http.prettier.R;
import com.neo.http.prettier.json_download.JSON_DownLoad;
import com.neo.http.prettier.object.ButtonsEntity;
import com.neo.http.prettier.object.DiariesEntity0;
import com.neo.http.prettier.object.DiariesEntity1;
import com.neo.http.prettier.object.ImageEntity;
import com.neo.http.prettier.object.SlideImageEntity;
import com.neo.http.prettier.object.Static_templatesEntity;
import com.neo.http.prettier.object.Tab_infoEntity;
import com.neo.http.prettier.url_interface.Url;
import com.neo.http.prettier.viewpager.CombinationViewPage;
import com.neo.http.utillibrary.base.BaseFragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/8/22 0022.
 */
public class MyHomeFragment extends BaseFragment implements JSON_DownLoad.DownLoadJsonSucc {


    @Bind(R.id.myhome_fragment_view)
    CombinationViewPage myhomeFragmentView;
    @Bind(R.id.kanriji)
    TextView kanriji;
    @Bind(R.id.zhaoyisheng)
    TextView zhaoyisheng;
    @Bind(R.id.zhaojigou)
    TextView zhaojigou;
    @Bind(R.id.chabaike)
    TextView chabaike;
    @Bind(R.id.img1)
    ImageView img1;
    @Bind(R.id.img2)
    ImageView img2;
    @Bind(R.id.img3)
    ImageView img3;
    @Bind(R.id.tabLayout)
    TabLayout tabLayout;
    @Bind(R.id.myhome_fragment_viewpager)
    ViewPager viewpager;


    private List<SlideImageEntity> img;
    private List<ButtonsEntity> button;
    private List<Static_templatesEntity> static_template;
    private List<Tab_infoEntity> tab_infos;
    private List<Object> diariesList;
    private List<String> tabnamelist;
    private List<Fragment> fragmentlist;

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myhome_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @Override
    protected void init(View view) {
        fragmentlist = new ArrayList<>();
        tabnamelist=new ArrayList<>();
    }

    //JSON下载
    @Override
    protected void loadDatas() {
        JSON_DownLoad.json_DownLoad(Url.URL_SHOUYE, this);
    }

    @Override
    public void downLoadSucc(String url, String strJson) {
        Json_Paring(url, strJson);
        List<ImageEntity> list = new ArrayList<>();
        for (SlideImageEntity imgs : img) {
            ImageEntity imageEntity = new ImageEntity();
            imageEntity.setImg_url(imgs.getSlide_img());
            list.add(imageEntity);
        }
        //加载ViewPager轮播图数据及设置
        myhomeFragmentView.setFragmentManager(getFragmentManager());
        myhomeFragmentView.setViewPagerAdapter(list);
        myhomeFragmentView.setTagImgchange(true);

        //button设置数据
        for (int i = 0; i < button.size(); i++) {
            String button_url = button.get(i).getIcon();
            ImageView imageView = new ImageView(getActivity());
            switch (i) {
                case 0:
                    Glide.with(this).load(button_url).centerCrop().into(new SimpleTarget<GlideDrawable>() {
                        @Override
                        public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                            kanriji.setCompoundDrawablesWithIntrinsicBounds(null, resource, null, null);
                        }
                    });
                    kanriji.setText(button.get(0).getName());
                    break;
                case 1:
                    Glide.with(this).load(button_url).centerCrop().into(new SimpleTarget<GlideDrawable>() {
                        @Override
                        public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                            zhaoyisheng.setCompoundDrawablesWithIntrinsicBounds(null, resource, null, null);
                        }
                    });
                    zhaoyisheng.setText(button.get(1).getName());
                    break;
                case 2:
                    Glide.with(this).load(button_url).centerCrop().into(new SimpleTarget<GlideDrawable>() {
                        @Override
                        public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                            zhaojigou.setCompoundDrawablesWithIntrinsicBounds(null, resource, null, null);
                        }
                    });
                    zhaojigou.setText(button.get(2).getName());
                    break;
                case 3:
                    Glide.with(this).load(button_url).centerCrop().into(new SimpleTarget<GlideDrawable>() {
                        @Override
                        public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                            chabaike.setCompoundDrawablesWithIntrinsicBounds(null, resource, null, null);
                        }
                    });
                    chabaike.setText(button.get(3).getName());
                    break;
                default:
                    break;
            }
        }
        //获取静态图片
        if (static_template != null) {
            if (static_template.get(0).getImage() != null) {
                Glide.with(getActivity()).load(static_template.get(0).getImage()).into(img1);
            }
            if (static_template.get(1).getImage() != null) {
                Glide.with(getActivity()).load(static_template.get(1).getImage()).into(img2);
            }
            if (static_template.get(2).getImage() != null) {
                Glide.with(getActivity()).load(static_template.get(2).getImage()).into(img3);
            }
        }

                //设置Tablayout标签
                for (int i = 0; i < tab_infos.size(); i++) {
                    tabnamelist.add(tab_infos.get(i).getTab_name());
                    getFragments(i);
                }
                //tabLayout模式设置，MODE_FIXED:固定tabs，并同时显示所有的tabs。
                //  MODE_SCROLLABLE：可滚动tabs，显示一部分tabs
                tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
                //        tabLayout.setTabMode(TabLayout.MODE_FIXED);
                tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

                MyFragmnetPagerAdapter myAdapter = new MyFragmnetPagerAdapter(getChildFragmentManager(), fragmentlist, tabnamelist);
                //下载的时候记得要刷新
                viewpager.setAdapter(myAdapter);
                tabLayout.setupWithViewPager(viewpager);



    }

    private void getFragments(int i) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("key", i);
        myFragment.setArguments(bundle);
        fragmentlist.add(myFragment);
    }

    /**
     * 首页JSON解析
     *
     * @param url
     * @param strJson
     */

    private void Json_Paring(String url, String strJson) {
        if (url.equals(Url.URL_SHOUYE) && strJson != null) {
            try {
                JSONObject jsonObject = new JSONObject(strJson);
                JSONObject dataJSON = jsonObject.getJSONObject("data");
                //解析出viewpager的对象
                JSONArray slides = dataJSON.getJSONArray("slides");
                //依赖GSON
                TypeToken<List<SlideImageEntity>> tt = new TypeToken<List<SlideImageEntity>>() {
                };
                img = new Gson().fromJson(slides.toString(), tt.getType());

                //解析出buttons的对象
                JSONArray buttons = dataJSON.getJSONArray("buttons");
                //依赖GSON
                TypeToken<List<ButtonsEntity>> tt1 = new TypeToken<List<ButtonsEntity>>() {
                };
                button = new Gson().fromJson(buttons.toString(), tt1.getType());

                //解析出Static_templatesEntity的对象
                static_template = new ArrayList<>();
                JSONArray static_templates = dataJSON.getJSONArray("static_templates");
                JSONObject objectabc = (JSONObject) static_templates.get(0);

                JSONObject obj = objectabc.getJSONObject("a");
                Static_templatesEntity static_templatesEntity1 = new Static_templatesEntity();
                static_templatesEntity1.setImage(obj.getString("image"));
                static_templatesEntity1.setUrl(obj.getString("url"));
                static_template.add(static_templatesEntity1);

                JSONObject obj2 = objectabc.getJSONObject("b");
                Static_templatesEntity static_templatesEntity2 = new Static_templatesEntity();
                static_templatesEntity2.setImage(obj2.getString("image"));
                static_templatesEntity2.setUrl(obj2.getString("url"));
                static_template.add(static_templatesEntity2);

                JSONObject obj3 = objectabc.getJSONObject("c");
                Static_templatesEntity static_templatesEntity3 = new Static_templatesEntity();
                static_templatesEntity3.setImage(obj3.getString("image"));
                static_templatesEntity3.setUrl(obj3.getString("url"));
                static_template.add(static_templatesEntity3);

                //解析出Tab_infoEntity的对象
                JSONArray tab_info = dataJSON.getJSONArray("tab_info");
                //依赖GSON
                TypeToken<List<Tab_infoEntity>> tt3 = new TypeToken<List<Tab_infoEntity>>() {
                };
                tab_infos = new Gson().fromJson(tab_info.toString(), tt3.getType());

                //解析diaries的对象
                JSONArray diaries = dataJSON.getJSONArray("diaries");

                diariesList = new ArrayList<>();
                for (int i = 0; i < diaries.length(); i++) {
                    JSONObject object = (JSONObject) diaries.get(i);
                    if (object.getString("author_type") != null && object.getInt("author_type") == 0) {
                        //依赖GSON
                        TypeToken<DiariesEntity0> tts = new TypeToken<DiariesEntity0>() {
                        };
                        DiariesEntity0 diariesEntity0 = new Gson().fromJson(object.toString(), tts.getType());
                        diariesList.add(diariesEntity0);
                    }
                    if (object.getString("type") != null && object.getInt("type") == 1) {
                        //依赖GSON
                        TypeToken<DiariesEntity1> tts = new TypeToken<DiariesEntity1>() {
                        };
                        DiariesEntity0 diariesEntity1 = new Gson().fromJson(object.toString(), tts.getType());
                        diariesList.add(diariesEntity1);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}

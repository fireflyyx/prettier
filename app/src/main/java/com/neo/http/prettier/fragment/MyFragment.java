package com.neo.http.prettier.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.neo.http.prettier.R;

/**
 * Created by Administrator on 2016/7/16 0016.
 */
public class MyFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.viewpager_view,container,false);
        TextView tv= (TextView) view.findViewById(R.id.viewpager_tv);


        int num=getArguments().getInt("key");
        switch(num){
            case 0:tv.setText("I am first page");break;
            case 1:tv.setText("I am second page");break;
            case 2:tv.setText("I am third page");break;
            case 3:tv.setText("I am fourth page");break;
            case 4:tv.setText("I am fifth page");break;
            case 5:tv.setText("I am sixth page");break;
            case 6:tv.setText("I am"+num+"page");break;
            case 7:tv.setText("I am"+num+"page");break;
            case 8:tv.setText("I am"+num+"page");break;
            case 9:tv.setText("I am"+num+"page");break;

            default:
            tv.setText("I am"+num+"page");
                break;

        }

        return view;
    }
}

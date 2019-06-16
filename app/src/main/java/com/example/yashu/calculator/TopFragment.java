package com.example.yashu.calculator;

import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class TopFragment extends Fragment {

    private TextView text1;
    private TextView text2;

    public TopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_top, container, false);

        text1 = (TextView) view.findViewById(R.id.textView);
        text2 = (TextView) view.findViewById(R.id.textView2);

        text1.setSelected(true);

        text1.setText("");
        text2.setText("Ans=");

        return view;
    }

    public void setText(String q, String a , boolean auth) {

        if (q.equals("")) {
            text1.setText("");
        } else {
            text1.setText("" + q);
        }
        if (a.equals("")) {
            text2.setText("Ans=");
        } else {
            text2.setText("Ans=" + a);
        }

        if(auth == true){
    //        int array[] = { R.drawable.try0 , R.drawable.try1 , R.drawable.try2 , R.drawable.try3 , R.drawable.try4 , R.drawable.try5 , R.drawable.try6 , R.drawable.try7};

    //        for(int i=0 ; i<array.length ; i++){
     //           text1.setBackgroundResource(array[i]);
     //           text2.setBackgroundResource(array[i]);
      //      }

            text1.setBackgroundColor(0xff000000);
            text2.setBackgroundColor(0xff000000);

            text1.postDelayed(new Runnable() {
                public void run() {
                    text1.setBackgroundColor(0xffffffff);
                    text2.setBackgroundColor(0xffffffff);
                }
            },500);


        }
    }
}

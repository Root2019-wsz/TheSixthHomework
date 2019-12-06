package com.example.thesixthhomework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    private TextView mTextView;

    public static MyFragment newInstance(String tag){
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("tag",tag);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment,null);
        mTextView = (TextView)view.findViewById(R.id.text_view);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle arguments = getArguments();
        mTextView.setText(arguments.getString("tag"));
    }
}

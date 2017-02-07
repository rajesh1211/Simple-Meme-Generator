package com.raikwar.rajesh.memegenerator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment{
    private static TextView top_text;
    private static TextView bottom_text;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        top_text = (TextView) view.findViewById(R.id.memeTextTop);
        bottom_text = (TextView) view.findViewById(R.id.memeTextBotttom);
        return view;
    }

    public void setMemeText(String top, String bottom) {
        top_text.setText(top);
        bottom_text.setText(bottom);
    }
}

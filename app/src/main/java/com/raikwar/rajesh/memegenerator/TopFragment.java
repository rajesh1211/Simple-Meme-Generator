package com.raikwar.rajesh.memegenerator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by rajesh on 08/02/17.
 */

public class TopFragment extends Fragment {

    private static EditText top_text;
    private static EditText bottom_text;
    private static Button generate_button;
    private TopFragmentListner fragmentListner;

    public interface TopFragmentListner {
        public void generateMeme(String top, String bottom);
    }


//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        try {
//            fragmentListner = (TopFragmentListner) activity;
//        }catch (ClassCastException e) {
//            throw new ClassCastException(e.getMessage().toString());
//        }
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            fragmentListner = (TopFragmentListner) context;
        }catch (ClassCastException e) {
            throw new ClassCastException(e.getMessage().toString());
        }
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        top_text = (EditText) view.findViewById(R.id.topText);
        bottom_text = (EditText) view.findViewById(R.id.bottomText);
        generate_button = (Button) view.findViewById(R.id.bottomButton);

        generate_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        generate(v);
                    }
                }
        );
        return view;
    }

    public void generate(View v) {
        fragmentListner.generateMeme(top_text.getText().toString(), bottom_text.getText().toString());
    }
}

package com.example.jgarciaamor.a2t1p;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import static android.app.Activity.RESULT_OK;


public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFrag2=inflater.inflate(R.layout.fragment_main2, container, false);

        TextView text2= (TextView) layFrag2.findViewById(R.id.text2);

        String str=getActivity().getIntent().getStringExtra("llamar");

        text2.setText(str);

        Button button2=(Button) layFrag2.findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent databack=new Intent();
                databack.putExtra("llamar2","mensaje desde fragment2");



                getActivity().setResult(RESULT_OK,databack);
                getActivity().finish();


            }


        });

        return layFrag2;
    }


}
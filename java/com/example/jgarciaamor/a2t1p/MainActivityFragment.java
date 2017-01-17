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


public class MainActivityFragment extends Fragment {


    public final static int COD=1;
    private TextView text;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layFragment=inflater.inflate(R.layout.fragment_main, container, false);
        Button button=(Button) layFragment.findViewById(R.id.button);
        text=(TextView)layFragment.findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getActivity(),Main2Activity.class);
                intent.putExtra("llamar","mensaje desde fragment");
                startActivityForResult(intent,COD);

            }

        });

        return layFragment;


    }

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode == COD){
            if(resultCode == RESULT_OK){
                String result=data.getStringExtra("llamar2");
                text.setText(result);
            }
        }
    }
}
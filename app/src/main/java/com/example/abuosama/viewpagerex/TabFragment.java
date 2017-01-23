package com.example.abuosama.viewpagerex;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {
    EditText et1,et2;
    Button b1;


    public TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_tab, container, false);

        et1 = (EditText) v.findViewById(R.id.edittext1);
        et2 = (EditText) v.findViewById(R.id.edittext2);
        b1 = (Button) v.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=et1.getText().toString();
                String course=et2.getText().toString();


            }
        });
        return  v;
    }

}

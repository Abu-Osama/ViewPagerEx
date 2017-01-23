package com.example.abuosama.viewpagerex;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclevFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Student>al;
    MyAdapter myAdapter;
    Cursor c;

    public  class  MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View v=getActivity().getLayoutInflater().inflate(R.layout.row,parent,false);
            ViewHolder viewHolder=new ViewHolder(v);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Student student=al.get(position);
            holder.tv1.setText(student.getSno());
            holder.tv2.setText(student.getSname());
            holder.tv3.setText(student.getScourse());


        }

        @Override
        public int getItemCount() {
            return al.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView tv1,tv2,tv3;
            public ViewHolder(View itemView) {
                super(itemView);
                tv1= (TextView) itemView.findViewById(R.id.textview1);
                tv2= (TextView) itemView.findViewById(R.id.textview2);
                tv3= (TextView) itemView.findViewById(R.id.textview3);
            }
        }
    }



    public RecyclevFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_recyclev, container, false);
        return v;
    }

}

package com.npluslabs.stockshop.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.npluslabs.stockshop.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    View view;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_blank, container, false);
        FloatingActionButton button =  view.findViewById(R.id.floating_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuyFragment showsMenu = new BuyFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
            }
        });
        LinearLayout first = view.findViewById(R.id.first);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StockListFragment showsMenu = new StockListFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
            }
        });

        LinearLayout second = view.findViewById(R.id.second);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StockFragment2 showsMenu = new StockFragment2();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
            }
        });

        LinearLayout third = view.findViewById(R.id.third);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StockFragment3 showsMenu = new StockFragment3();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
            }
        });

        LinearLayout fourth = view.findViewById(R.id.fourth);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StockFragment4 showsMenu5 = new StockFragment4();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu5).addToBackStack(null).commit();
            }
        });

        LinearLayout fifth = view.findViewById(R.id.fifth);
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StockFragment5 showsMenu6 = new StockFragment5();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu6).addToBackStack(null).commit();
            }
        });

        LinearLayout sixth = view.findViewById(R.id.sixth);
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StockFragment6 showsMenu = new StockFragment6();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
            }
        });
//
//        LinearLayout first = view.findViewById(R.id.first);
//        first.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                StockListFragment showsMenu = new StockListFragment();
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
//            }
//        });
        return view;
    }

}

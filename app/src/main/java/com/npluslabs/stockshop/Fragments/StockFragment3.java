package com.npluslabs.stockshop.Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.npluslabs.stockshop.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StockFragment3 extends Fragment {

    View view;
    public StockFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_stock_fragment3, container, false);
        FloatingActionButton button =  view.findViewById(R.id.floating_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuyFragment showsMenu = new BuyFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).addToBackStack(null).commit();
            }
        });
        return view;
    }

}

package com.npluslabs.stockshop.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.npluslabs.stockshop.R;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuyFragment extends Fragment {


    public BuyFragment() {
        // Required empty public constructor
    }
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.quote, container, false);
        Button buyButton  = view.findViewById(R.id.buy_now);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new SweetAlertDialog(getActivity(), SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Script added to your Portfolio")
                        .setContentText("Money deducted from your account")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog.dismissWithAnimation();
                                BlankFragment showsMenu = new BlankFragment();
                                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).commit();
                            }
                        })
                        .show();
            }
        });
        return view;
    }

}

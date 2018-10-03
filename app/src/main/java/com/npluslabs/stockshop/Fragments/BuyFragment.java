package com.npluslabs.stockshop.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.npluslabs.stockshop.R;

import java.util.ArrayList;
import java.util.List;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class BuyFragment extends Fragment {

    Spinner exchangeSymbol,stockSymbol;
    TextView currencySymbol;
    public BuyFragment() {
        // Required empty public constructor
    }
    View view;
    View v1;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.quote, container, false);
        Button buyButton  = view.findViewById(R.id.buy_now);
        currencySymbol = view.findViewById(R.id.currency_symbol);
        exchangeSymbol = view.findViewById(R.id.exchange_symbol);
        exchangeSymbol.setSelection(0, true);
        v = exchangeSymbol.getSelectedView();
        ((TextView)v).setTextColor(getResources().getColor(R.color.text_color));
        stockSymbol = view.findViewById(R.id.stock_symbol);

//        ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
        stockSymbol.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                v1 = stockSymbol.getSelectedView();
                ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        exchangeSymbol.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                v = exchangeSymbol.getSelectedView();
                ((TextView)v).setTextColor(getResources().getColor(R.color.text_color));
                String sp1= String.valueOf(exchangeSymbol.getSelectedItem());
                Toast.makeText(getActivity(), sp1, Toast.LENGTH_SHORT).show();
                if(sp1.contentEquals("CSI 300 Index")) {
//                    stockSymbol.setSelection(0, true);
//                    View v1 = stockSymbol.getSelectedView();
//                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                    currencySymbol.setText("¥ (CNY)");
                    List<String> list = new ArrayList<String>();
                    list.add("Ping An Insurance");
                    list.add("Kweichow Moutai");
                    list.add("Bank of Communications");
                    list.add("China Merchants Bank");
                    list.add("Industrial Bank");
                    list.add("China Minsheng Bank");
                    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter.notifyDataSetChanged();
                    stockSymbol.setAdapter(dataAdapter);
                    stockSymbol.setSelection(0, true);
                    v1 = stockSymbol.getSelectedView();
                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                }
                if(sp1.contentEquals("Nikkei 225 Index")) {
//                    stockSymbol.setSelection(0, true);
//                    View v1 = stockSymbol.getSelectedView();
//                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                    currencySymbol.setText("¥ (JPY)");
                    List<String> list = new ArrayList<String>();
                    list.add("Ajinomoto");
                    list.add("Aeon");
                    list.add("Advantest");
                    list.add("Alps Electric");
                    list.add("Amada");
                    list.add("ANA");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    stockSymbol.setAdapter(dataAdapter2);
                    stockSymbol.setSelection(0, true);
                    v1 = stockSymbol.getSelectedView();
                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                }

                if(sp1.contentEquals("CAC 40 Index")) {
//                    stockSymbol.setSelection(0, true);
//                    View v1 = stockSymbol.getSelectedView();
//                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                    currencySymbol.setText("€ (Euro)");
                    List<String> list = new ArrayList<String>();
                    list.add("AXA");
                    list.add("Atos SE");
                    list.add("ArcelorMittal Rg");
                    list.add("Airbus Br");
                    list.add("Air Liquide");
                    list.add("Accor SA");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    stockSymbol.setAdapter(dataAdapter2);
                    stockSymbol.setSelection(0, true);
                    v1 = stockSymbol.getSelectedView();
                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                }

                if(sp1.contentEquals("DAX 30 Index")) {

                    currencySymbol.setText("€ (Euro)");
                    List<String> list = new ArrayList<String>();
                    list.add("Adidas");
                    list.add("Allianz");
                    list.add("BASF");
                    list.add("Bayer");
                    list.add("Beiersdorf");
                    list.add("BMW");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    stockSymbol.setAdapter(dataAdapter2);
                    stockSymbol.setSelection(0, true);
                    v1 = stockSymbol.getSelectedView();
                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                }

                if(sp1.contentEquals("BSE Index")) {
//                    stockSymbol.setSelection(0, true);
//                    View v1 = stockSymbol.getSelectedView();
//                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                    currencySymbol.setText("₹ (INR)");
                    List<String> list = new ArrayList<String>();
                    list.add("HDFC Bank Ltd");
                    list.add("Coal India Ltd");
                    list.add("Bharti Airtel Ltd");
                    list.add("Bajaj Auto Ltd");
                    list.add("Axis Bank Ltd");
                    list.add("Asian Paints Ltd");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    stockSymbol.setAdapter(dataAdapter2);
                    stockSymbol.setSelection(0, true);
                    v1 = stockSymbol.getSelectedView();
                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                }

                if(sp1.contentEquals("NASDAQ-100")) {
//                    stockSymbol.setSelection(0, true);
//                    View v1 = stockSymbol.getSelectedView();
//                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                    currencySymbol.setText("$ (USD)");
                    List<String> list = new ArrayList<String>();
                    list.add("Autodesk Inc");
                    list.add("Automatic Data Processing Inc");
                    list.add("Analog Devices Inc");
                    list.add("Adobe Systems Inc");
                    list.add("Apple Inc");
                    list.add("American Airlines Group Inc");
                    ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_spinner_item, list);
                    dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter2.notifyDataSetChanged();
                    stockSymbol.setAdapter(dataAdapter2);
                    stockSymbol.setSelection(0, true);
                    v1 = stockSymbol.getSelectedView();
                    ((TextView)v1).setTextColor(getResources().getColor(R.color.text_color));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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
                                ExchangeListFragment showsMenu = new ExchangeListFragment();
                                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, showsMenu).commit();
                            }
                        })
                        .show();
            }
        });
        return view;
    }

}

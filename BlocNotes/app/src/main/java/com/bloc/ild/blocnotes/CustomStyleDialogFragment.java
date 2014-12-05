package com.bloc.ild.blocnotes;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CustomStyleDialogFragment extends DialogFragment {


    public CustomStyleDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Include a title within the dialog framelayout
        getDialog().setTitle("View Style Options");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_custom_style_dialog, container, false);

        return view;
    }

}

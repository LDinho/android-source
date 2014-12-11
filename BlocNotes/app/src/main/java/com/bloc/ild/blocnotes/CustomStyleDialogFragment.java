package com.bloc.ild.blocnotes;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


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
        getDialog().setTitle("Choose Font Style");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_custom_style_dialog, container, false);

        //Show spinner view layout
        Spinner spinner = (Spinner) view.findViewById(R.id.font_selector);

        //Set string values for the font spinner
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.font_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //show anything here?

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                //show message here?

            }
        });

        return view;
    }

}

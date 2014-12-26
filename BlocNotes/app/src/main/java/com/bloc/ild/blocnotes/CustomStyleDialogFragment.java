package com.bloc.ild.blocnotes;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class CustomStyleDialogFragment extends DialogFragment {

    // holds objects to be notified of changes
    private ArrayList<CustomStyleFont> mObserver;


    public CustomStyleDialogFragment() {

        mObserver = new ArrayList<CustomStyleFont>();
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
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                //
                String[] fonts = getResources().getStringArray(R.array.font_array);
                String font = fonts[parent.getSelectedItemPosition()] + ".ttf";
                font = font.toLowerCase();
                changeFont(font);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                //nothing
            }
        });

        return view;
    }

    public void addListener(CustomStyleFont listener) {
        mObserver.add(listener);

    }

    public void changeFont(String font) {
        for (CustomStyleFont listener : mObserver) {
            listener.onFontChange(this, font);
        }

    }

    //Interface that activities hosting this fragment must implement

    public interface CustomStyleFont {

        public void onStyleChange(CustomStyleDialogFragment dialog, int styleId);

        public void onFontChange(CustomStyleDialogFragment dialog, String fontName);

        public void onThemeChange(CustomStyleDialogFragment dialog, int themeId);
    }

}

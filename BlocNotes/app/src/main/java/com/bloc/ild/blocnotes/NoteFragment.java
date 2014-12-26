package com.bloc.ild.blocnotes;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;

/**
 * Created by iLD on 11/14/14.
 */
public class NoteFragment extends Fragment {

    private EditText editText;
    private static final String ENTERED_TEXT = "enteredText";

    public NoteFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // getContext() = Returns the context the view is running in, through which it can access the current theme, resources, etc.
        // getActivity() = Returns the Activity this fragment is currently associated with.

        /*
        RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        EditText editText = new EditText(getActivity());

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        relativeLayout.addView(editText, params);

        return relativeLayout;
        */

        View rootView = inflater.inflate(R.layout.fragment_note, container, false); // Inflate fragment_note layout = translating the XML file into a view

        editText = (EditText) rootView.findViewById(R.id.et_editText); // getting the entered text

        if (savedInstanceState != null) {       // Here we check if there was a previous state that existed before (a destroyed state).

            editText.setText(savedInstanceState.getString(ENTERED_TEXT)); // Restore the text entered from saved state.
        }

        return rootView;
    }

    // The method below is called to ask the fragment to save its current dynamic state,
    // so it can later be reconstructed in a new instance of its process is restarted.
    // If a new instance of the fragment later needs to be created, the data you place in the Bundle here
    // will be available in the Bundle given to onCreateView(LayoutInflater, ViewGroup, Bundle).

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(ENTERED_TEXT, editText.getText().toString());
    }

    // change the editText field font

    public void setFont(String fontSelected) {

        if (fontSelected == null) {
            return;
        }

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/" + fontSelected);
        editText.setTypeface(font);

    }

}

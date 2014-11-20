package com.bloc.ild.blocnotes;

import android.app.Fragment;
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

        EditText editText = (EditText) rootView.findViewById(R.id.et_editText); // is this needed here (XML checkpoint)?

        return rootView;
    }
}

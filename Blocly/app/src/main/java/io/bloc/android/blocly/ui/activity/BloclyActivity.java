package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import io.bloc.android.blocly.BloclyApplication;
import io.bloc.android.blocly.R;


public class BloclyActivity extends Activity {

    private TextView mMainTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocly);
//        Toast.makeText(this,
//                BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
//                Toast.LENGTH_LONG).show();

        String fakeRssName = BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle();
        mMainTitle = (TextView) findViewById(R.id.main_title);
        mMainTitle.setText(fakeRssName);

    }
}

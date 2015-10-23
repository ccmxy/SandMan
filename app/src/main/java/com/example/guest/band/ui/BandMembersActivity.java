package com.example.guest.band.ui;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guest.band.R;
import com.example.guest.band.models.BandMember;
import com.example.guest.band.models.BandMembersLib;

public class BandMembersActivity extends AppCompatActivity {
    private TextView mBandMemberName;
    private ImageView mBandMemberImage;
    private ImageView mBandHeaderImage;
    private Button mNextButton;
    private BandMember mCurrentBandMember;
    private BandMembersLib mBandMembersLib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_band_members);

        mBandMemberName = (TextView) findViewById(R.id.bandMemberName);
        mBandMemberImage = (ImageView) findViewById(R.id.bandMemberImage);
        mBandHeaderImage = (ImageView) findViewById(R.id.bandHeader);

        mNextButton = (Button) findViewById(R.id.nextButton);
        mBandMembersLib = new BandMembersLib();
        mCurrentBandMember = mBandMembersLib.getBandMembers().get(0);
        setTheContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentBandMember = mBandMembersLib.nextMember(mCurrentBandMember);
                setTheContent();
            }
        });

    }
    private void setTheContent() {
        mBandMemberName.setText(mCurrentBandMember.getName());
        mBandMemberImage.setImageResource(mCurrentBandMember.getImage());
        mBandHeaderImage.setImageResource(mCurrentBandMember.getHeaderImage());
    }
}

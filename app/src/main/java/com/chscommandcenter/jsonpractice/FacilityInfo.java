package com.chscommandcenter.jsonpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FacilityInfo extends AppCompatActivity {

    TextView facilityInfoTx;
    TextView facilityIdTx;
    TextView facilityAddressTx;
    TextView facilitySideTx;
    TextView facilityPhoneTx;
    TextView facilityDivisionTx;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility_info);
        facilityInfoTx = (TextView) findViewById(R.id.facilityName);
        facilityIdTx = (TextView) findViewById(R.id.facilityID);
        facilityAddressTx = (TextView) findViewById(R.id.facilityAddress);
        facilitySideTx = (TextView) findViewById(R.id.facilityAlignment);
        facilityPhoneTx = (TextView) findViewById(R.id.facilityPhone);
        facilityDivisionTx = (TextView) findViewById(R.id.facilityDivision);
        Intent myIntent = getIntent();
        String facilityName = myIntent.getStringExtra("facilityName");
        String facilityId = myIntent.getStringExtra("facilityId");
        String facilityAddress = myIntent.getStringExtra("facilityAddress");
        String facilitySide = myIntent.getStringExtra("facilitySide");
        String facilityPhone = myIntent.getStringExtra("phone");
        String facilityDivision = myIntent.getStringExtra("facilityDivision");

        facilityInfoTx.setText(facilityName);
        facilityIdTx.setText("Site Code: " + facilityId);
        facilityAddressTx.setText(facilityAddress);
        facilitySideTx.setText(facilitySide);
        facilityPhoneTx.setText("Phone: " + facilityPhone);
        facilityDivisionTx.setText("Division: " + facilityDivision);


        Log.d("Facilityapp","This city is " + facilityName);
    }
}

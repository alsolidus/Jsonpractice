package com.chscommandcenter.jsonpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DisplayListView extends AppCompatActivity {
    String JSON_STRING;
    JSONObject jsonObject;
    JSONArray jsonArray;
    FacilitiesAdapter facilitiesAdapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_listview_layout);
        facilitiesAdapter= new FacilitiesAdapter(this,R.layout.row_layout);
        listView= (ListView)findViewById(R.id.listview);
        listView.setAdapter(facilitiesAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Facilities clickFacility = (Facilities) facilitiesAdapter.getItem(position);
                String clickFacilityName = clickFacility.getTitle();
                String clickFacilityCernerStr = clickFacility.getCernerhub();
                String clickFacilityAddressStr = clickFacility.getAddress();
                String clickFacilityPhone = clickFacility.getPhone();
                String clickFacilitySide = clickFacility.getSide();
                String clickFacilityId = clickFacility.getEntity();
                String clickFacilityDivision = clickFacility.getDivision();

                Intent myIntent = new Intent(getApplicationContext(),FacilityInfo.class);
                Bundle extras = new Bundle();
                extras.putString("facilityName",clickFacilityName);
                extras.putString("cernerhub",clickFacilityCernerStr);
                extras.putString("facilityAddress",clickFacilityAddressStr);
                extras.putString("phone",clickFacilityPhone);
                extras.putString("facilitySide",clickFacilitySide);
                extras.putString("facilityId",clickFacilityId);
                extras.putString("facilityDivision",clickFacilityDivision);

                myIntent.putExtras(extras);
                startActivity(myIntent);

                Log.d("Facility INFO", "This string is: " + clickFacilityCernerStr
                        + clickFacilityName
                        + clickFacilityAddressStr
                        + clickFacilityPhone);

            }
        });


        JSON_STRING=getIntent().getExtras().getString("json_data");
        String division,title,entity,address,city,state,zip,phone,website,intranet,emails,cernerhub,side;
        try {
            jsonObject= new JSONObject(JSON_STRING);
            int count=0;
            jsonArray=jsonObject.getJSONArray("server_response");
            while (count<jsonArray.length()){
                JSONObject JO=jsonArray.getJSONObject(count);
                division=JO.getString("Division");
                title=JO.getString("Title");
                entity=JO.getString("Entity");
                address=JO.getString("Address");
                city=JO.getString("City");
                state=JO.getString("State");
                zip=JO.getString("Zip");
                phone=JO.getString("Phone");
                website=JO.getString("Web_Site");
                intranet=JO.getString("Intranet");
                emails=JO.getString("Emails");
                cernerhub=JO.getString("Cerner_Hub");
                side=JO.getString("Side");

                Facilities facilities= new Facilities(division,title,entity,address,city,state,zip,phone,website,intranet,emails,cernerhub,side);
                facilitiesAdapter.add(facilities);
                count++;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }





    }

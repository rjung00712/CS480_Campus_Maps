package com.example.pungi.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.amigold.fundapter.BindDictionary;
import com.amigold.fundapter.FunDapter;
import com.amigold.fundapter.extractors.StringExtractor;

import java.util.ArrayList;
import java.util.List;

import static android.media.CamcorderProfile.get;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LandFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LandFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public LandFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LandFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LandFragment newInstance(String param1, String param2) {
        LandFragment fragment = new LandFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_land, container, false);

        final ArrayList<LandList> land = new ArrayList<>();
        LandList a1 = new LandList("Arabian Horse Center Arena ");
        LandList a2 = new LandList("BioTrek Ethnobotany Garden");
        LandList a3 = new LandList("CLA Paseo ");
        LandList a4 = new LandList("CLA Technopolis ");
        LandList a5 = new LandList("Japanese Garden");
        LandList a6 = new LandList("Kellogg Track and Infield ");
        LandList a7 = new LandList("Meadow");
        LandList a8 = new LandList("Outdoor Basketball Courts");
        LandList a9 = new LandList("Pumpkin Field ");
        LandList a10 = new LandList("Rose Garden ");
        LandList a11 = new LandList("Scolinos Baseball Field ");
        LandList a12 = new LandList("Soccer Field ");
        LandList a13 = new LandList("Starbucks Library Patio");
        LandList a14 = new LandList("Tennis Courts ");
        LandList a15 = new LandList("University Park");
        LandList a16 = new LandList("Union Plaza Horseshoe Hill ");
        LandList a17 = new LandList("Union Plaza Horseshoe Hill ");
        LandList a18 = new LandList("Voorhis Ecological Preserve");
        LandList a19 = new LandList("Voorhis Park");

        land.add(a1);
        land.add(a2);
        land.add(a3);
        land.add(a4);
        land.add(a5);
        land.add(a6);
        land.add(a7);
        land.add(a8);
        land.add(a9);
        land.add(a10);
        land.add(a11);
        land.add(a12);
        land.add(a13);
        land.add(a14);
        land.add(a15);
        land.add(a16);
        land.add(a17);
        land.add(a18);
        land.add(a19);


        BindDictionary<LandList> dic = new BindDictionary<>();
        dic.addStringField(R.id.textLand, new StringExtractor<LandList>() {
            @Override
            public String getStringValue(LandList fd1, int position) {
                return fd1.getName();
            }
        });



        FunDapter dapter = new FunDapter(LandFragment.this.getActivity(),land,
                R.layout.land_layout,dic);

        ListView listView = (ListView) view.findViewById(R.id.listviewland);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                LandList selecteditem = land.get(position);
                                                Toast.makeText(LandFragment.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();

                                            }
                                        }
        );



        return view;
    }

}

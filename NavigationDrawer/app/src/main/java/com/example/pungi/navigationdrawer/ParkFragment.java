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


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ParkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ParkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ParkFragment newInstance(String param1, String param2) {
        ParkFragment fragment = new ParkFragment();
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
        View view =  inflater.inflate(R.layout.fragment_park, container, false);

        final ArrayList<ParkList> park = new ArrayList<>();
        ParkList a1 = new ParkList("Police and Parking Services, 109 ");
        ParkList a2 = new ParkList("Parking Information Booth, 133");
        ParkList a3 = new ParkList("Parking Structure 1, 106");
        ParkList a4 = new ParkList("Parking Structure 2 ");
        ParkList a5 = new ParkList("Parking Lot A");
        ParkList a6 = new ParkList("Parking Lot B");
        ParkList a7 = new ParkList("Parking Lot C");
        ParkList a8 = new ParkList("Parking Lot D");
        ParkList a9 = new ParkList("Parking Lot E1");
        ParkList a10 = new ParkList("Parking Lot E2");
        ParkList a11 = new ParkList("Parking Lot F1 – F5");
        ParkList a12 = new ParkList("Parking Lot F5 – F10");
        ParkList a13 = new ParkList("Parking Lot G");
        ParkList a14 = new ParkList("Parking Lot H");
        ParkList a15 = new ParkList("Parking Lot I");
        ParkList a16 = new ParkList("Parking Lot J1 – J8");
        ParkList a17 = new ParkList("Parking Lot K");
        ParkList a18 = new ParkList("Parking Lot K Annex");
        ParkList a19 = new ParkList("Parking Lot L");
        ParkList a20 = new ParkList("Parking Lot M");
        ParkList a21 = new ParkList("Parking Lot N");
        ParkList a22 = new ParkList("Parking Lot O");
        ParkList a23 = new ParkList("Parking Lot P");
        ParkList a24 = new ParkList("Parking Lot Q");
        ParkList a25 = new ParkList("Parking Lot R");

        park.add(a1);
        park.add(a2);
        park.add(a3);
        park.add(a4);
        park.add(a5);
        park.add(a6);
        park.add(a7);
        park.add(a8);
        park.add(a9);
        park.add(a10);
        park.add(a11);
        park.add(a12);
        park.add(a13);
        park.add(a14);
        park.add(a15);
        park.add(a16);
        park.add(a17);
        park.add(a18);
        park.add(a19);
        park.add(a20);
        park.add(a21);
        park.add(a22);
        park.add(a23);
        park.add(a24);
        park.add(a25);

        BindDictionary<ParkList> dic = new BindDictionary<>();
        dic.addStringField(R.id.textPark, new StringExtractor<ParkList>() {
            @Override
            public String getStringValue(ParkList pk1, int position) {
                return pk1.getName();
            }
        });



        FunDapter dapter = new FunDapter(ParkFragment.this.getActivity(),park,
                R.layout.park_layout,dic);

        ListView listView = (ListView) view.findViewById(R.id.listviewpark);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ParkList selecteditem = park.get(position);
                Toast.makeText(ParkFragment.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}

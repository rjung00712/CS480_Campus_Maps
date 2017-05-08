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
 * Use the {@link BuildFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BuildFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public BuildFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BuildFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BuildFragment newInstance(String param1, String param2) {
        BuildFragment fragment = new BuildFragment();
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
        View view =  inflater.inflate(R.layout.fragment_build, container, false);

        final ArrayList<BuildList> building = new ArrayList<>();
        BuildList a1 = new BuildList("College of Agriculture, 2");
        BuildList a2 = new BuildList("Science Laboratory, 3");
        BuildList a3 = new BuildList("Biotechnology Buildings, 4");
        BuildList a4 = new BuildList("College of Education & Integrative Studies, 5");
        BuildList a5 = new BuildList("College of Letters, Arts & Social Sciences, 5");
        BuildList a6 = new BuildList("College of Environmental Design, 7");
        BuildList a7 = new BuildList("College of Science, 8");
        BuildList a8 = new BuildList("College of Engineering, 9");
        BuildList a9 = new BuildList("Collins College of Hospitality Management, 79-79A-79B-80");
        BuildList a10 = new BuildList("College of Business Administration , 162-163-164");
        BuildList a11 = new BuildList("English Language Institute , 86");
        BuildList a12 = new BuildList("I Poly High Schoo, 128");
        BuildList a13 = new BuildList("Classrooms, 6");
        BuildList a14 = new BuildList("Art Department/Engineering Annex, 13");
        BuildList a15 = new BuildList("LRC; ASI Tutoring; McNair Scholars, 13");
        BuildList a16 = new BuildList("Library, 13");
        BuildList a17 = new BuildList("Engineering Laboratories, 17");
        BuildList a18 = new BuildList("Music, 24");
        BuildList a19 = new BuildList("Temporary Classrooms, 24A-F");
        BuildList a20 = new BuildList("Drama Department/Theatre, 25");
        BuildList a21 = new BuildList("Agricultural Engineering, 45");
        BuildList a22 = new BuildList("Bronco Bookstore, 66");
        BuildList a23 = new BuildList("Equine Research Facility , 67");
        BuildList a24 = new BuildList("English Language Institute , 86");
        BuildList a25 = new BuildList("Laboratory Facility, 92");
        BuildList a26 = new BuildList("Classroom / Laboratory / Administration, 98");
        BuildList a27 = new BuildList("Kellogg West Education/Dining, 76");
        BuildList a28 = new BuildList("Kellogg West Main Lodge, 77");
        BuildList a29 = new BuildList("Kellogg West Addition, 78");
        BuildList a30 = new BuildList("W. Keith and Janet Kellogg University Art Gallery, 35A");
        BuildList a31 = new BuildList("Swine Unit/Shelters, 37");
        BuildList a32 = new BuildList("Sheep/Wool Unit, 38");

        building.add(a1);
        building.add(a2);
        building.add(a3);
        building.add(a4);
        building.add(a5);
        building.add(a6);
        building.add(a7);
        building.add(a8);
        building.add(a9);
        building.add(a10);
        building.add(a11);
        building.add(a12);
        building.add(a13);
        building.add(a14);
        building.add(a15);
        building.add(a16);
        building.add(a17);
        building.add(a18);
        building.add(a19);
        building.add(a20);
        building.add(a21);
        building.add(a22);
        building.add(a23);
        building.add(a24);
        building.add(a25);
        building.add(a26);
        building.add(a27);
        building.add(a28);
        building.add(a29);
        building.add(a30);
        building.add(a31);
        building.add(a32);




        BindDictionary<BuildList> dic = new BindDictionary<>();
                dic.addStringField(R.id.textBuild, new StringExtractor<BuildList>() {
            @Override
            public String getStringValue(BuildList bld1, int position) {
                return bld1.getName();
            }
        });



        FunDapter dapter = new FunDapter(BuildFragment.this.getActivity(),building,
                R.layout.build_layout,dic);

        ListView listView = (ListView) view.findViewById(R.id.listviewbuild);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    BuildList selecteditem = building.get(position);
                    Toast.makeText(BuildFragment.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();

             }
        }
        );


        return view;
    }

}

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


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DormFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DormFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public DormFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DormFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DormFragment newInstance(String param1, String param2) {
        DormFragment fragment = new DormFragment();
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
        View view =  inflater.inflate(R.layout.fragment_dorm, container, false);

        final ArrayList<DormList> dorms = new ArrayList<>();
        DormList a1 = new DormList("Residence Hall, Encinitas , 20");
        DormList a2 = new DormList("Residence Hall, Montecito, 21");
        DormList a3 = new DormList("Residence Hall, Alamitos , 22");
        DormList a4 = new DormList("Residence Hall, Aliso, 23");
        DormList a5 = new DormList("Residence Hall, Palmitas, 57");
        DormList a6 = new DormList("Residence Hall, Cedritos, 58");
        DormList a7 = new DormList("Residence Suites , 60");
        DormList a8 = new DormList("Residence Suites , 61");
        DormList a9 = new DormList("University Village, 200");


        dorms.add(a1);
        dorms.add(a2);
        dorms.add(a3);
        dorms.add(a4);
        dorms.add(a5);
        dorms.add(a6);
        dorms.add(a7);
        dorms.add(a8);
        dorms.add(a9);

        BindDictionary<DormList> dic = new BindDictionary<>();
        dic.addStringField(R.id.textDorm, new StringExtractor<DormList>() {
            @Override
            public String getStringValue(DormList drm1, int position) {
                return drm1.getName();
            }
        });



        FunDapter dapter = new FunDapter(DormFragment.this.getActivity(),dorms,
                R.layout.dorm_layout,dic);

        ListView listView = (ListView) view.findViewById(R.id.listviewdorm);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DormList selecteditem = dorms.get(position);
                Toast.makeText(DormFragment.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}

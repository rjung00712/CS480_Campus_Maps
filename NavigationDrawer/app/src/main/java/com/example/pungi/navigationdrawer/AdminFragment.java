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

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdminFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdminFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public AdminFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AdminFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdminFragment newInstance(String param1, String param2) {
        AdminFragment fragment = new AdminFragment();
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
        View view =  inflater.inflate(R.layout.fragment_admin, container, false);
        final ArrayList<AdminList> administration = new ArrayList<>();
        AdminList a1 = new AdminList("CLA, 98");
        AdminList a2 = new AdminList("Building One, 1");
        AdminList a3 = new AdminList("University Plaza, 26");
        AdminList a4 = new AdminList("Orientation Services, 26A");
        AdminList a5 = new AdminList("W.K. Kellogg Arabian Horse Center, 29");
        AdminList a6 = new AdminList("BioTrek Learning Center, 4A");
        AdminList a7 = new AdminList("Bronco Student Center, 35");
        AdminList a8 = new AdminList("Health Services, 46");
        AdminList a9 = new AdminList("Foundation Administration Offices, 55");
        AdminList a10 = new AdminList("La Cienega Center (University Housing Services), 59");
        AdminList a11 = new AdminList("Interim Design Center, 89");
        AdminList a12 = new AdminList("Student Affairs Information Technology Services , 91");
        AdminList a13 = new AdminList("University Office Building, 94");
        AdminList a14 = new AdminList("Cultural Centers, 95");
        AdminList a15 = new AdminList("Campus Center, 97");
        AdminList a16 = new AdminList("Police and Parking Services, 109");
        AdminList a17 = new AdminList("Manor House, 111");
        AdminList a18 = new AdminList("Kellogg House Pomona, 112");
        AdminList a19 = new AdminList("Child Care Center, 116");
        AdminList a20 = new AdminList("Lyle Center for Regenerative Studies, 209");
        AdminList a21 = new AdminList("Center for Training, Technology and Incubation," +
                "220A-220B-220C");

        administration.add(a1);
        administration.add(a2);
        administration.add(a3);
        administration.add(a4);
        administration.add(a5);
        administration.add(a6);
        administration.add(a7);
        administration.add(a8);
        administration.add(a9);
        administration.add(a10);
        administration.add(a11);
        administration.add(a12);
        administration.add(a13);
        administration.add(a14);
        administration.add(a15);
        administration.add(a16);
        administration.add(a17);
        administration.add(a18);
        administration.add(a19);
        administration.add(a20);
        administration.add(a21);


        BindDictionary<AdminList> d = new BindDictionary<>();
        d.addStringField(R.id.textAdmin, new StringExtractor<AdminList>() {
            @Override
            public String getStringValue(AdminList adm1, int position) {
                return adm1.getName();
            }
        });

        FunDapter dapter = new FunDapter(AdminFragment.this.getActivity(),administration,
                            R.layout.admin_layout,d);

        ListView listView = (ListView) view.findViewById(R.id.listviewadmin);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    AdminList selecteditem = administration.get(position);
                Toast.makeText(AdminFragment.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

}

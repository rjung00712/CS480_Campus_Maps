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
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
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
        View view =  inflater.inflate(R.layout.fragment_food, container, false);

        final ArrayList<FoodList> food = new ArrayList<>();
        FoodList a1 = new FoodList("Los Olivos Commons, 70");
        FoodList a2 = new FoodList("Market Place, 97");
        FoodList a3 = new FoodList("Vista Market, 52");
        FoodList a4 = new FoodList("Food court in the BSC, 35");

        FoodList a5 = new FoodList("Kellogg Gymnasium, 43");
        FoodList a6 = new FoodList("Darlene May Gymnasium , 41");
        FoodList a7 = new FoodList("Recreation/Maintenance , 71");
        FoodList a8 = new FoodList("Swimming Pool, 44");
        FoodList a9 = new FoodList("Bronco Recreation Intramural Complex (BRIC), 42");

        food.add(a1);
        food.add(a2);
        food.add(a3);
        food.add(a4);
        food.add(a5);
        food.add(a6);
        food.add(a7);
        food.add(a8);
        food.add(a9);

        BindDictionary<FoodList> dic = new BindDictionary<>();
        dic.addStringField(R.id.textFood, new StringExtractor<FoodList>() {
            @Override
            public String getStringValue(FoodList fd1, int position) {
                return fd1.getName();
            }
        });



        FunDapter dapter = new FunDapter(FoodFragment.this.getActivity(),food,
                R.layout.food_layout,dic);

        ListView listView = (ListView) view.findViewById(R.id.listviewfood);
        listView.setAdapter(dapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                FoodList selecteditem = food.get(position);
                                                Toast.makeText(FoodFragment.this.getActivity(),selecteditem.getName(),Toast.LENGTH_SHORT).show();

                                            }
                                        }
        );



        return view;
    }

}

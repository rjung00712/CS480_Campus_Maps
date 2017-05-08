package cs499android.com.cppcampusmap;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static cs499android.com.cppcampusmap.R.id.list;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdminFragment extends Fragment {

    private List<AdminBldg> adminBldgList;
    private AdminBldgArrayAdapter adminBldgArrayAdapter;
    private ListView listView;

    public AdminFragment() {
        // Required empty public constructor
    }


   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView = inflater.inflate(R.layout.app_listview, container, false);
/*
        return inflater.inflate(R.layout.app_listview, container, false);
*/

        initAdminBldg();



/*
        listView = (ListView) listView.findViewById(R.id.list);
*/

        /*adminBldgArrayAdapter = new AdminBldgArrayAdapter(
                this,R.layout.fragment_admin, adminBldgList);*/

        listView = (ListView) listView.findViewById (list);

        adminBldgArrayAdapter = new AdminBldgArrayAdapter(
                getActivity (), R.layout.fragment_admin, adminBldgList);

        listView.setAdapter(adminBldgArrayAdapter);


       return rootView;

    }

    private void initAdminBldg() {

        adminBldgList = new ArrayList<AdminBldg>(){{
            add(new AdminBldg("CLA", true));
            add(new AdminBldg("Building 1", false));

        }};


    }

}

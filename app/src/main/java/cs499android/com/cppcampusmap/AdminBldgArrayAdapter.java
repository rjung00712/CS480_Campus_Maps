package cs499android.com.cppcampusmap;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pungi on 01-May-17.
 */

class AdminBldgArrayAdapter extends ArrayAdapter<AdminBldg> {

    private Context context;
    private int layoutResource;
    private List<AdminBldg> adminBldgList;

    public AdminBldgArrayAdapter(@NonNull Context context,
                                 @LayoutRes int resource,
                                 @NonNull List<AdminBldg> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResource = resource;
        this.adminBldgList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layoutResource, parent, false);

        TextView textViewName = (TextView) view.findViewById(R.id.admbuild);
        textViewName.setText(adminBldgList.get(position).getName());


        return view;
    }
}

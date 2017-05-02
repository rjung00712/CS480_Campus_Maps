package cs499android.com.cppcampusmap.Model;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

import cs499android.com.cppcampusmap.MyItem;

/**
 * Created by GT on 4/20/2017.
 */

public class ClusterRenderer extends DefaultClusterRenderer<MyItem> {

    public ClusterRenderer(Context context, GoogleMap map, ClusterManager<MyItem> clusterManager) {
        super(context, map, clusterManager);
    }

    @Override
    protected void onBeforeClusterItemRendered(MyItem item, MarkerOptions markerOptions) {
        markerOptions.icon(item.getIcon());
        super.onBeforeClusterItemRendered(item, markerOptions);
    }
}

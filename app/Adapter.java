import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myfinallistadapter.R;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context ;
    String[] playersNames ; int[] playersPhotos ; String[] playersClub ;
    LayoutInflater layoutInflater ;

    public Adapter(Context context, String[] playersNames, int[] playersPhotos,
                   String[] playersClub, int resource) {
        this.context = context;
        this.playersNames = playersNames;
        this.playersPhotos = playersPhotos;
        this.playersClub = playersClub;
    }

    @Override
    public int getCount() {
        return playersNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {

       if (layoutInflater == null)
           layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       if (view == null){
           view = layoutInflater.inflate(R.layout.single_item_list,null);
       }

       ImageView playerImage = view.findViewById(R.id.profile_image);
       TextView playerName = view.findViewById(R.id.player_name);
       TextView playerClub = view.findViewById(R.id.player_club);

        return view;
    }
}

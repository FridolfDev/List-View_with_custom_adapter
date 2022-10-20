package com.example.myfinallistadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    private  Context context ;
    private String[] playersNames ;
    private int[] playersImages ;
    private String[] playersClubs ;
    private LayoutInflater layoutInflater;
    private int resource ;

    public Adapter(Context context, String[] playersNames, int[] playersImages, String[] playersClubs, int resource) {
        this.context = context;
        this.playersNames = playersNames;
        this.playersImages = playersImages;
        this.playersClubs = playersClubs;
        this.resource = resource ;
    }

    @Override
    public int getCount() {
        return playersNames.length;
    }

    @Override
    public Object getItem(int i) {
        return playersNames[i];
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
            view = layoutInflater.inflate(resource, null);
        }

        ImageView playerimage = view.findViewById(R.id.profile_image);
        TextView playerName = view.findViewById(R.id.player_name);
        TextView playerClub= view.findViewById(R.id.player_club);

        playerimage.setImageResource(playersImages[index]);
        playerName.setText(playersNames[index]);
        playerClub.setText(playersClubs[index]);

        return view;
    }
}

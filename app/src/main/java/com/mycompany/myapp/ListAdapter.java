package com.mycompany.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cesine.picsine.app.R;
import com.mycompany.myapp.model.Friend.ManagerAmigos;

/**
 * Created by julioa on 27/03/14.
 */
public class ListAdapter extends BaseAdapter {
    private final Context context;
    private final String[] values;

    public ListAdapter(Context context, String[] values) {
        //super(context, R.layout.rowlayout, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public int getCount() {
        return ManagerAmigos.getInstance().getCount();
    }

    @Override
    public Object getItem(int position) {
        return ManagerAmigos.getInstance().getFriend(position);
    }

    @Override
    public long getItemId(int position) {
        return ManagerAmigos.getInstance().getFriend(postion).getName().hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(ManagerAmigos.getInstance().getFriend(position).getName());

        return rowView;
    }
}
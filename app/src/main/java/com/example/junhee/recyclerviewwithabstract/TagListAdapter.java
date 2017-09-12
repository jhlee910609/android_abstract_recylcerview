package com.example.junhee.recyclerviewwithabstract;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JunHee on 2017. 9. 12..
 */

public class TagListAdapter extends PFRecyclerViewAdapter<Tag> {

    public TagListAdapter(Context context, OnViewHolderClick listener) {
        super(context, listener);
    }

    @Override
    protected View createView(Context context, ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_text_color, viewGroup, false);
        return view;
    }

    @Override
    protected void bindView(Tag item, PFRecyclerViewAdapter.ViewHolder viewHolder) {
        if (item != null) {
            TextView name = (TextView) viewHolder.getView(R.id.text_name);
            TextView type = (TextView) viewHolder.getView(R.id.text_type);
//            View verticalBar = viewHolder.getView(R.id.vertical_bar);

            name.setText(item.name);
            type.setText(item.type);
//            verticalBar.setBackgroundColor(item.primaryColor != null ? Color.parseColor(item.primaryColor) : Color.parseColor(Tag.DEFAULT_COLOR));
        }
    }
}
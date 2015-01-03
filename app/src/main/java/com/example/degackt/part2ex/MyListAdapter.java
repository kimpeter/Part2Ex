package com.example.degackt.part2ex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by degackt on 15. 1. 2..
 */
public class MyListAdapter extends BaseAdapter{
	private ArrayList<MyItem> list;
	private int layoutId;
	Context context;
	private LayoutInflater inflater;
	

	public MyListAdapter(Context context, int layoutId, ArrayList<MyItem> list) {
		this.context = context;
		this.layoutId = layoutId;
		this.list = list;
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null) {
			convertView = inflater.inflate(layoutId,parent,false);
		}
		TextView txt =(TextView)convertView.findViewById(R.id.listText);
		final MyItem item = list.get(position);
		txt.setText(item.getItemName());

		ImageView img = (ImageView)convertView.findViewById(R.id.listImg);
		img.setImageResource(item.getItemImg());


		return convertView;
	}
}

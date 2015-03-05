package com.br.ce.qxm.listview;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.ce.qxm.model.ItemListView;

public class CustomListView extends BaseAdapter {
	private Activity activity;
	private LayoutInflater inflater;
	private List<ItemListView> itens;

	public CustomListView(Activity activity, List<ItemListView> itens) {
		this.itens = itens;
		this.activity = activity;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.itens.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return itens.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (inflater == null) {
			inflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_list, null);
		}
       
		TextView title = (TextView) convertView.findViewById(R.id.texto);
		ImageView imagem = (ImageView) convertView.findViewById(R.id.imagem);

		ItemListView item = itens.get(position);
		// seta o valor do item
		title.setText(item.getTexto());
		imagem.setImageResource(item.getIconeRid());
		return convertView;
	}

}
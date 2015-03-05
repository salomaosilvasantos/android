package com.br.ce.qxm.listview;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.br.ce.qxm.model.ItemListView;

public class MainActivity extends ActionBarActivity {

	private static ListView listView;
	private static CustomListView adapterListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		List<ItemListView> itens = new ArrayList<ItemListView>();
		itens.add(new ItemListView(R.drawable.sal, "Teste1"));
		itens.add(new ItemListView(R.drawable.sal, "Teste2"));
		itens.add(new ItemListView(R.drawable.sal, "Teste3"));
		itens.add(new ItemListView(R.drawable.sal, "Teste4"));
		itens.add(new ItemListView(R.drawable.sal, "Teste5"));
		itens.add(new ItemListView(R.drawable.sal, "Teste6"));
		itens.add(new ItemListView(R.drawable.sal, "Teste7"));
		itens.add(new ItemListView(R.drawable.sal, "Teste8"));
		itens.add(new ItemListView(R.drawable.sal, "Teste9"));

		listView = (ListView) findViewById(R.id.list);
		adapterListView = new CustomListView(this, itens);
		listView.setAdapter(adapterListView);

	}

}

package com.example.baseadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<ItemBean> itemBeansList = new ArrayList<>();
		for (int i = 0; i < 20; i++)
		{
			itemBeansList.add(new ItemBean(
					R.drawable.ic_launcher,
					"我是标题" + i,
					"我是内容" + i
					));
		}
		
		
		ListView listView = (ListView) findViewById(R.id.lv_main);
		listView.setAdapter(new MyAdapter(this, itemBeansList));
		
	
	}
}

package com.example.baseadapter;

import java.util.List;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter
{
	private List<ItemBean> mList;
	private LayoutInflater mInflater;

	public MyAdapter(Context context, List<ItemBean> list)
	{
		this.mList = list;
		this.mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount()
	{
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int position)
	{
		// TODO Auto-generated method stub
		return mList.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		//Ч�ʼ�����£�û�����õ�������ƣ�ÿ�ζ������µ�View�����ÿؼ�
//		View view = mInflater.inflate(R.layout.item, null);
//		ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
//		TextView title = (TextView) view.findViewById(R.id.tv_title);
//		TextView content = (TextView) view.findViewById(R.id.tv_content);
//		
//		ItemBean bean = mList.get(position);
//		imageView.setImageResource(bean.getimg());
//		title.setText(bean.gettitle());
//		content.setText(bean.getContent());
//		return view;
		//
		
		//�����˻�����ƣ�����findViewById���ɻ���˷���Դ
//		if (convertView == null)
//		{
//			convertView = mInflater.inflate(R.layout.item, null);
//		}
//		ImageView imageView = (ImageView) convertView.findViewById(R.id.iv_image);
//		TextView title = (TextView) convertView.findViewById(R.id.tv_title);
//		TextView content = (TextView) convertView.findViewById(R.id.tv_content);
//		
//		ItemBean bean = mList.get(position);
//		imageView.setImageResource(bean.getimg());
//		title.setText(bean.gettitle());
//		content.setText(bean.getContent());
//		return convertView;
		
		
		
		ViewHodler viewHodler;
		if (convertView == null)
		{
			viewHodler = new ViewHodler();
			convertView = mInflater.inflate(R.layout.item , null);
			viewHodler.imageView = (ImageView) convertView.findViewById(R.id.iv_image);
			viewHodler.title = (TextView) convertView.findViewById(R.id.tv_title);
			viewHodler.content = (TextView) convertView.findViewById(R.id.tv_content);
			convertView.setTag(viewHodler);
		}else {
			viewHodler = (ViewHodler) convertView.getTag();
		}		
		ItemBean bean = mList.get(position);
		viewHodler.imageView.setImageResource(bean.getimg());
		viewHodler.title.setText(bean.gettitle());
		viewHodler.content.setText(bean.getContent());
		return convertView;
	}

	class ViewHodler
	{
		public ImageView imageView;
		public TextView title;
		public TextView content;

	}
}

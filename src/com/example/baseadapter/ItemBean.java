package com.example.baseadapter;

import android.R.integer;

public class ItemBean
{
	private int Item_ImageResid;
	private String Item_TextTitle;
	private String Item_TextContent;
	
	public ItemBean(int img , String title ,String con)
	{
		this.Item_ImageResid = img;
		this.Item_TextTitle = title;
		this.Item_TextContent = con;
	}
	
	public int getimg()
	{
		return Item_ImageResid;
	}
	public String gettitle()
	{
		return Item_TextTitle;
	}
	public String getContent()
	{
		return Item_TextContent;
	}
}

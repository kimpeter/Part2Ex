package com.example.degackt.part2ex;

/**
 * Created by degackt on 15. 1. 2..
 */
public class MyItem {

	private String itemName;
	private int iconId;

	public MyItem() {

	}
	public MyItem(int iconId, String itemName) {
		this.iconId = iconId;
		this.itemName = itemName;
	}
	public String getItemName() {
		return itemName;
	}

	public int getItemImg() {
		return iconId;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}

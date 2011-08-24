package com.arpitonline.utils;

import java.util.ArrayList;

public abstract class ObjectPool {
	
	private ArrayList<Object> freeItems;
	private ArrayList<Object> usedItems;
	
	public ObjectPool(){
		freeItems = new ArrayList<Object>();
		usedItems = new ArrayList<Object>();
	}
	
	public Object get(){
		Object ob = null;
		if(freeItems.size()==0){
			ob = createNewInstanceOfSourceClass();
		}
		return ob;
	}
	
	// override this in your own implementation
	abstract protected Object createNewInstanceOfSourceClass();
}

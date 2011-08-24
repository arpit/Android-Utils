package com.arpitonline.utils;

import android.util.Log;

public class Logger {
	
	public static String DEFAULT_TAG = "Logger";
	
	public static void error(String message){
		Log.e(DEFAULT_TAG, message);
	}
	
	
	public static void error(String tag, String message){
		Log.e(tag, message);
	}
	
	protected static void routeToLog(Object[] args){
		if(args.length==1){
			log((String)args[0]);
		}
		
	}
	
	public static void log(String message){
		log(DEFAULT_TAG, message);
	}
	
	public static void log(String tag, String message){
		Log.i(tag, message);
	}
	
	public static void log(Object src, String message){
		log(DEFAULT_TAG, src.getClass().getName() + message);
	}
	
	public static void log(String tag, Object src, String message){
		Log.i(tag, "["+src.getClass().getName()+"]" + message);
	}
	
	
	
	
	
	
}

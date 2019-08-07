package com.kashanok.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDisplay
{
	public static String showJson(Object object){
		Gson gson = new GsonBuilder().create();
		String jsonBook = gson.toJson(object);
		return jsonBook;
	}
}

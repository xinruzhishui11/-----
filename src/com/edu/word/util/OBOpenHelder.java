package com.edu.word.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OBOpenHelder extends SQLiteOpenHelper {

	public OBOpenHelder(Context context ) {
		super(context, "edu.db", null, 1);
	}

	//数据库第一次创建的时候调用
	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "create table words (_id integer primary key autoincrement, en verchar(16) not null unique" +
				",zh verchar(36))";
		db.execSQL(sql);
		
	}

	//版本更新时调用
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}

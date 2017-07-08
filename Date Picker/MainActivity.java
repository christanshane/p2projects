package com.example.datepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends Activity implements DatePicker.OnDateChangedListener{
	DatePicker dp = null;
	Calendar cal = null;
	TextView modate = null;
	
	@Override
	protected void onCreate(bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dp = (DatePicker)findViewById(R.id.myDatePicker);
		modate = (TextView)findViewById(R.id.myChosenDate);
		
		cal = Calendar.getInstance();
		dp.init(dp.getYear(), dp.getMonth(), dp.getDayOfMonth(), this);
	}
	
	@SuppressWarnings("deprecation")
	public void onDateChagned(DatePicker dpview, int year, int monthOfYear, int dayOfMonth){
		cal.set(year, monthOYear, dayOfMonth);
		java.util.Date d = cal.getTime();
		mcdate.setText(String.valueOf(d.getMonth() + 1) + "/"
			+ String.valueOf(d.getDate() + "/")
			+ String.valueOf(d.getYear() + 1900));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
	}
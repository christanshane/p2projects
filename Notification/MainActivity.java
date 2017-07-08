package com.example.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnclickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b = (Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener(){ 
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View arg0){
				NotificationManager nm = NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
				Ntification notify = new Notification(android.R.drawable.stat_notify_more, "This is important", System.currentTimeMillis());
				Context context = MainActivity.this;
				CharSequence title = "You have been notified";
				CharSequence details = "Continue what you were doing";
				Intent intent = new Intent(context, MainActivity.class);
				PendingIntent pending = PendingIntent.getActivity(context, 0 , intent, 0);
				notify.setLatestEventInfo(context, title, details, pending);
				nm.notify(0,notify);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) { 
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
	}
}
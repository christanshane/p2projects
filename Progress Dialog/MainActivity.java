package com.example.processdialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ProgressDialog pd = new ProgressDialog(this);
		pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		pd.setMessage("Just wait...");
		pd.setIndeterminate(true);
		pd.setCancelable(true);
		
		Button b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
					pd.show();
					pd.setProgress(50); //for horizontal style only
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		//Inflate the menu; this adds items to the action bar if itis present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
package com.example.imagedisplay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageDisplay extends Activity {
	ImageView myImageView2 = null;
	Button forward = null, back = null;
	int pic;
	int[] album = new int[2];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		forward = (Button)findviewById(R.id.forward);
		back = (Button)findViewById(R.id.back);
		album[0] = R.drawable.lighthouse;
		album[1] = R.drawable.tulips;
		
		myImageView2 = (ImageView)findViewById(R.id.myimage2);
		myImageView2.setImageResource(album[0]);
		
		forward.setOnClickListener(new View.OnjClickListener(){
			
			@Override
			public void onClick(View arg0) { 
				if(pic<album.lengt-1)
					pic++;
					myImageView2.setImageResource(album[pic]);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
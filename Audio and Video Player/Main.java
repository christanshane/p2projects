package com.example.audioandvideo

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener{
	Button btnAudio, btnVideo;
	MediaPlayer mpMusic;
	int playing;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		btnAudio = (Button)findViewById(R.id.btnAudio);
		btnVideo = (Button)findViewById(R.id.btnVideo);
		btnAudio.setOnClickListener(this);
		btnVideo.setOnClickListener(this);
		mpMusic = new MediaPlayer();
		mpMusic = MediaPlayer.create(this, R.raw.shakeitoff);
		playing = 0;
	}
	
	@Override
	public booleanh onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflater(R.menu.main, menu);
		return  true;
	}
	
	@Override
	public void onClick(View arg0){
		switch(arg0.getId()){
			case R.id.btnAudio:
				startActivity(new Intent(Main.this, MainAudio.class));
				break;
			case R.id.btnVideo:
				startActivity(new Intent(Main.this, MainVideo.class));
				break;
		}
	}
}
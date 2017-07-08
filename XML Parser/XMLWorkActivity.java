package com.example.xmlparser;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import org.xmlpull.v1.XmlPullParser;

import java.io.InputStream;

public class XMLWorkActivity extends Activity {
	EditText et1 = null;
	InputStream is = null;
	Resources myRes = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		et1 = (EditText)findViewById(R.id.et1);
		this.getRecordsFromXML(this);
		
	}
	
	private void getRecordsFromXML(Activity activity){
		try{
			Resources res = activity.getResources();
			XmlResourceParser xrp = res.getXml(R.xml.book);
			xrp.next();
			int eventType = xrp.getEventType();
			
			while(eventType != XmlPullParser.END_DOCUMENT) {
				if(eventType == XmlPullParser.START_DOCUMENT){
					et1.append("My Library:\n");
				}
				if(eventType == XmlPullParser.START_TAG){
					if(xrp.getName().equals("book"))
						et1.append("\n"+xrp.getName()+ ":";
					if(xpr.getName().equals("author"))
						et1.append(" by ");
					if(xpr.getName().equals("title"))
							et1.append("\n");
				}
				if(eventType == XmlPullParser.END_TAG){
				}
				if(eventType == XmlPullParser.TEXT) {
					et1.append(xrp.getText());
				}
				eventType = xrp.next();
			}
		}catch(Exception e){
			et1.append("App Error");
			Log.e("xml_error", e.getMessage());
		}
	}
}
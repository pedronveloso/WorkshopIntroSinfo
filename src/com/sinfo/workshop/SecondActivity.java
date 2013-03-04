package com.sinfo.workshop;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		String textFromMain = getIntent().getStringExtra(Consts.VAL1);
		TextView tv = (TextView) findViewById(R.id.tv_result);
		tv.setText(textFromMain);
	}

}

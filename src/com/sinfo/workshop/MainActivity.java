package com.sinfo.workshop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button btnClick = (Button) findViewById(R.id.btn_click);
		btnClick.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_click:
			/*TextView tvAux = (TextView) findViewById(R.id.tv_text1);
			tvAux.setText(R.string.text_after_click);*/
			Intent second = new Intent(MainActivity.this,SecondActivity.class);
			EditText et = (EditText) findViewById(R.id.et_input);
			second.putExtra(Consts.VAL1, et.getText().toString());
			startActivity(second);
			break;
		}
		
	}

}

package com.example.testmessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button zhuceButton = (Button) findViewById(R.id.button1);
		zhuceButton.setOnClickListener(this);    

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			System.out.println(1111);
            Intent intent = new Intent(MainActivity.this,    
                    LoginActivity.class);   
            startActivity(intent);  
			break;
		default:
			break;
		}
	}
}

package com.example.ayuyin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//the function by button of the pregnant mother
	public void preMother(View view) {
		Intent iPre = new Intent(MainActivity.this,PreMother.class);
		startActivity(iPre);
	}
	
	//the function by button of the baby mother
	public void babyMother(View view) {
		Intent iBaby = new Intent(MainActivity.this,BabyMother.class);
		startActivity(iBaby);
	}

}

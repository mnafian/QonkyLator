package com.qonkylabs.dasarhello;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	EditText nilai;
	Button tombolplus, tombolmin, tombolkali, tombolbagi, tombolhasil;
	boolean plus,min,kali,bagi;
	String nilai1, nilai2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		nilai = (EditText) findViewById(R.id.editText1);
		tombolplus = (Button) findViewById(R.id.buttonplus);
		tombolmin = (Button) findViewById(R.id.buttonmin);
		tombolbagi = (Button) findViewById(R.id.buttonbagi);
		tombolkali = (Button) findViewById(R.id.buttonkali);
		tombolhasil = (Button) findViewById(R.id.buttonhasil);
		

		tombolplus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nilai1 = nilai.getText().toString();
				nilai.setText("");
				plus = true;
				min = false;
				kali = false;
				bagi = false;
			}
		});
		
		tombolkali.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nilai1 = nilai.getText().toString();
				nilai.setText("");
				plus = false;
				min = false;
				kali = true;
				bagi = false;
			}
		});
		
		tombolmin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nilai1 = nilai.getText().toString();
				nilai.setText("");
				plus = false;
				min = true;
				kali = false;
				bagi = false;
			}
		});
		
		tombolbagi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nilai1 = nilai.getText().toString();
				nilai.setText("");
				plus = false;
				min = false;
				kali = false;
				bagi = true;
			}
		});

		tombolhasil.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int hasil = 0;
				nilai2 = nilai.getText().toString();
				if (plus==true){
					hasil = Integer.valueOf(nilai1) + Integer.valueOf(nilai2);
				}else if (min==true){
					hasil = Integer.valueOf(nilai1) - Integer.valueOf(nilai2);
				}else if (kali==true){
					hasil = Integer.valueOf(nilai1) * Integer.valueOf(nilai2);
				}else if (bagi==true){
					hasil = Integer.valueOf(nilai1) / Integer.valueOf(nilai2);
				}
				
				nilai.setText(String.valueOf(hasil));
				Toast.makeText(getApplicationContext(), nilai.getText().toString(),
						Toast.LENGTH_LONG).show();
			}
		});
	}
}

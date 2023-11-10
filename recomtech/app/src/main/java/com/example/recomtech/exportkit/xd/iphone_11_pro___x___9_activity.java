
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		mobile_skripsi
	 *	@date 		1653923335174
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class iphone_11_pro___x___9_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___9_ek2;
	private ImageView logo_nikon_2;
	private ImageView _nikon_dslr_d3500_1;
	private TextView _nikon_d3500;
	private TextView _nikon_d5100;
	private ImageView _nikon_dslr_d5100_1;
	private ImageView _back_icon_3_ek4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___9);

		
		_bg__iphone_11_pro___x___9_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___9_ek2);
		logo_nikon_2 = (ImageView) findViewById(R.id.logo_nikon_2);
		_nikon_dslr_d3500_1 = (ImageView) findViewById(R.id._nikon_dslr_d3500_1);
		_nikon_d3500 = (TextView) findViewById(R.id._nikon_d3500);
		_nikon_d5100 = (TextView) findViewById(R.id._nikon_d5100);
		_nikon_dslr_d5100_1 = (ImageView) findViewById(R.id._nikon_dslr_d5100_1);
		_back_icon_3_ek4 = (ImageView) findViewById(R.id._back_icon_3_ek4);
	
		
		_nikon_dslr_d3500_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___21_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_nikon_d3500.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___21_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_nikon_d5100.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___22_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_nikon_dslr_d5100_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___22_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_3_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
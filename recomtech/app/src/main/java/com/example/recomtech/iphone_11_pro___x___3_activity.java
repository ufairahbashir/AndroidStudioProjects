
	 
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

public class iphone_11_pro___x___3_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___3_ek2;
	private ImageView _samsung_a73_1;
	private ImageView _samsung_a33_1;
	private TextView _samsung_a53;
	private TextView _samsung_a73;
	private ImageView black_samsung_logo_png_21_2;
	private ImageView _back_icon_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___3);

		
		_bg__iphone_11_pro___x___3_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___3_ek2);
		_samsung_a73_1 = (ImageView) findViewById(R.id._samsung_a73_1);
		_samsung_a33_1 = (ImageView) findViewById(R.id._samsung_a33_1);
		_samsung_a53 = (TextView) findViewById(R.id._samsung_a53);
		_samsung_a73 = (TextView) findViewById(R.id._samsung_a73);
		black_samsung_logo_png_21_2 = (ImageView) findViewById(R.id.black_samsung_logo_png_21_2);
		_back_icon_1 = (ImageView) findViewById(R.id._back_icon_1);
	
		
		_samsung_a73_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___11_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_samsung_a33_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___12_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_samsung_a53.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___12_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_samsung_a73.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___11_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
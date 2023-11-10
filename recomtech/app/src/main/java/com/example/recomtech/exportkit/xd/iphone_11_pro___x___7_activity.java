
	 
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

public class iphone_11_pro___x___7_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___7_ek2;
	private ImageView asus_logo_1_ek1;
	private ImageView _zenbook_pro_dual_1;
	private TextView _asus_zenbook_pro_duo;
	private ImageView _zenbook_14_1;
	private TextView _asus_zenbook_14;
	private ImageView _back_icon_4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___7);

		
		_bg__iphone_11_pro___x___7_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___7_ek2);
		asus_logo_1_ek1 = (ImageView) findViewById(R.id.asus_logo_1_ek1);
		_zenbook_pro_dual_1 = (ImageView) findViewById(R.id._zenbook_pro_dual_1);
		_asus_zenbook_pro_duo = (TextView) findViewById(R.id._asus_zenbook_pro_duo);
		_zenbook_14_1 = (ImageView) findViewById(R.id._zenbook_14_1);
		_asus_zenbook_14 = (TextView) findViewById(R.id._asus_zenbook_14);
		_back_icon_4 = (ImageView) findViewById(R.id._back_icon_4);
	
		
		_zenbook_pro_dual_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___23_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_asus_zenbook_pro_duo.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___23_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_zenbook_14_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___24_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_asus_zenbook_14.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___24_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
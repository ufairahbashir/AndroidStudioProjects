
	 
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

public class iphone_11_pro___x___5_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___5_ek2;
	private ImageView logo_oppo_2;
	private ImageView _oppo_a16;
	private ImageView _oppo_reno_7_z_5g;
	private TextView _oppo_a16_ek1;
	private TextView _oppo_reno_7;
	private ImageView _back_icon_3_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___5);

		
		_bg__iphone_11_pro___x___5_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___5_ek2);
		logo_oppo_2 = (ImageView) findViewById(R.id.logo_oppo_2);
		_oppo_a16 = (ImageView) findViewById(R.id._oppo_a16);
		_oppo_reno_7_z_5g = (ImageView) findViewById(R.id._oppo_reno_7_z_5g);
		_oppo_a16_ek1 = (TextView) findViewById(R.id._oppo_a16_ek1);
		_oppo_reno_7 = (TextView) findViewById(R.id._oppo_reno_7);
		_back_icon_3_ek1 = (ImageView) findViewById(R.id._back_icon_3_ek1);
	
		
		_oppo_a16.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___15_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_oppo_reno_7_z_5g.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___16_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_oppo_a16_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___15_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_oppo_reno_7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___16_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_3_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
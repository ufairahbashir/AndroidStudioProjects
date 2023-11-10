
	 
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

public class iphone_11_pro___x___4_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___4_ek2;
	private ImageView logo_vivo_2;
	private ImageView _vivo_v23_1;
	private TextView _vivo_v23;
	private TextView _vivo_v20;
	private ImageView _v20;
	private ImageView _back_icon_3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___4);

		
		_bg__iphone_11_pro___x___4_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___4_ek2);
		logo_vivo_2 = (ImageView) findViewById(R.id.logo_vivo_2);
		_vivo_v23_1 = (ImageView) findViewById(R.id._vivo_v23_1);
		_vivo_v23 = (TextView) findViewById(R.id._vivo_v23);
		_vivo_v20 = (TextView) findViewById(R.id._vivo_v20);
		_v20 = (ImageView) findViewById(R.id._v20);
		_back_icon_3 = (ImageView) findViewById(R.id._back_icon_3);
	
		
		_vivo_v23_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___13_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vivo_v23.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___13_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vivo_v20.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___14_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_v20.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___14_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
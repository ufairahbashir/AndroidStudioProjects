
	 
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

public class iphone_11_pro___x___6_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___6_ek2;
	private ImageView _acer_aspire_5_nx_1;
	private ImageView acer_logo_png2_1;
	private ImageView _acer_aspire_3;
	private TextView _acer_aspire_3_ek1;
	private TextView _acer_aspire_5;
	private ImageView _back_icon_3_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___6);

		
		_bg__iphone_11_pro___x___6_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___6_ek2);
		_acer_aspire_5_nx_1 = (ImageView) findViewById(R.id._acer_aspire_5_nx_1);
		acer_logo_png2_1 = (ImageView) findViewById(R.id.acer_logo_png2_1);
		_acer_aspire_3 = (ImageView) findViewById(R.id._acer_aspire_3);
		_acer_aspire_3_ek1 = (TextView) findViewById(R.id._acer_aspire_3_ek1);
		_acer_aspire_5 = (TextView) findViewById(R.id._acer_aspire_5);
		_back_icon_3_ek2 = (ImageView) findViewById(R.id._back_icon_3_ek2);
	
		
		_acer_aspire_5_nx_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___18_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_acer_aspire_3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___17_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_acer_aspire_3_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___17_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_acer_aspire_5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___18_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_3_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
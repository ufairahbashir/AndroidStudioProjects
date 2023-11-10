
	 
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

public class iphone_11_pro___x___8_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___8_ek2;
	private ImageView _canon_eos_m50_mark_ii_1;
	private ImageView logo_canon_2;
	private ImageView _canon_eos_m200_1;
	private TextView _canon_eos_m200__mirorrless_;
	private TextView _canon_eos_mark_ii;
	private ImageView _back_icon_3_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___8);

		
		_bg__iphone_11_pro___x___8_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___8_ek2);
		_canon_eos_m50_mark_ii_1 = (ImageView) findViewById(R.id._canon_eos_m50_mark_ii_1);
		logo_canon_2 = (ImageView) findViewById(R.id.logo_canon_2);
		_canon_eos_m200_1 = (ImageView) findViewById(R.id._canon_eos_m200_1);
		_canon_eos_m200__mirorrless_ = (TextView) findViewById(R.id._canon_eos_m200__mirorrless_);
		_canon_eos_mark_ii = (TextView) findViewById(R.id._canon_eos_mark_ii);
		_back_icon_3_ek3 = (ImageView) findViewById(R.id._back_icon_3_ek3);
	
		
		_canon_eos_m50_mark_ii_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___20_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_canon_eos_m200_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___19_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_canon_eos_m200__mirorrless_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___19_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_canon_eos_mark_ii.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___20_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back_icon_3_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
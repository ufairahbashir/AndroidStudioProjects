
	 
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

public class iphone_11_pro___x___1_activity extends Activity {

	
	private View _bg__iphone_11_pro___x___1_ek2;
	private View ellipse_1;
	private ImageView logo_aa_1;
	private View _rectangle_1;
	private TextView re_tech;
	private TextView get_started_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_11_pro___x___1);

		
		_bg__iphone_11_pro___x___1_ek2 = (View) findViewById(R.id._bg__iphone_11_pro___x___1_ek2);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		logo_aa_1 = (ImageView) findViewById(R.id.logo_aa_1);
		_rectangle_1 = (View) findViewById(R.id._rectangle_1);
		re_tech = (TextView) findViewById(R.id.re_tech);
		get_started_ = (TextView) findViewById(R.id.get_started_);
	
		
		_rectangle_1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), iphone_11_pro___x___2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
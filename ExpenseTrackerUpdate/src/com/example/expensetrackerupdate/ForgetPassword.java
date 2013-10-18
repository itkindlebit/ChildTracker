package com.example.expensetrackerupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ForgetPassword extends Activity{
	Button submitreset;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forgetpassword);
		submitreset = (Button)findViewById(R.id.bntton_submit);
		submitreset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intentlogin = new Intent(ForgetPassword.this,LoginScreen.class);
				startActivity(intentlogin);
			}
		});

}
}
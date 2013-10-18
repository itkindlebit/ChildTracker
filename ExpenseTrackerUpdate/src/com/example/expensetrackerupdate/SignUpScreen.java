package com.example.expensetrackerupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SignUpScreen extends Activity{
	Button submit;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signupscreen);
		submit = (Button)findViewById(R.id.submit_button);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(SignUpScreen.this, "SignUp Successfully", 2000).show();
				Intent intentlogin = new Intent(SignUpScreen.this,LoginScreen.class);
				startActivity(intentlogin);
			}
		});
}
}

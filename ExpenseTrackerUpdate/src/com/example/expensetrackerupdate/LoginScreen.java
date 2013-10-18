package com.example.expensetrackerupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends Activity{
	EditText username,password;
	Button login,signup;
	TextView forgetpassword;
	String usernameget,passwordget;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);
		setTitle("DadMom");
		username = (EditText)findViewById(R.id.login_username);
		password = (EditText)findViewById(R.id.login_password);
		login = (Button)findViewById(R.id.bntton_login_login);
		signup = (Button)findViewById(R.id.bntton_login_signup);
		forgetpassword = (TextView)findViewById(R.id.textView_forgetpasssword);

		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				usernameget = username.getText().toString();
				passwordget = password.getText().toString();
				Intent intentSignup = new Intent(LoginScreen.this,HomeActivity.class);
				startActivity(intentSignup);
				
				
				
			}
		});
		
signup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intentSignup = new Intent(LoginScreen.this,SignUpScreen.class);
				startActivity(intentSignup);
				
				
				
			}
		});
forgetpassword.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent intentSignup = new Intent(LoginScreen.this,ForgetPassword.class);
		startActivity(intentSignup);
		
		
	}
});
	}
}

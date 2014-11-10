package com.jeam.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Secundario extends ActionBarActivity{
	
	private Button boton;
	private EditText destinatario, asunto, texto;
		
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        setContentView(R.layout.segundolayout);
	        
	        boton= (Button)findViewById(R.id.button1);
	        destinatario= (EditText)findViewById(R.id.editText1);
	        asunto= (EditText)findViewById(R.id.editText2);
	        texto= (EditText)findViewById(R.id.editText3);
	        
	       
	        boton.setOnClickListener(new OnClickListener() {
	        	

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					enviarMail();
						
				}
	        	
	        });

	 }
	        
	 
	    public void enviarMail(){
	    	
	    	Intent intent= new Intent(android.content.Intent.ACTION_SEND);
	    	intent.setType("text/plain");
	    	intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{destinatario.getText().toString()});
	    	intent.putExtra(android.content.Intent.EXTRA_SUBJECT, asunto.getText().toString()); 
	    	intent.putExtra(android.content.Intent.EXTRA_TEXT, texto.getText().toString());
	    	
	    	try{
	    		startActivity(Intent.createChooser(intent, "Enviando correo"));
	    		Toast.makeText(getApplicationContext(), "correo enviado!", Toast.LENGTH_SHORT).show();
	    	   }
	    	catch (Exception e){
	    		e.printStackTrace();
	    		Toast.makeText(getApplicationContext(), "correo no enviado!", Toast.LENGTH_SHORT).show();
	    	}
	    	
	    	
	    }

	        
	
}

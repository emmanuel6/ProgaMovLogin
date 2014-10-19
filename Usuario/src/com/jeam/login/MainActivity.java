package com.jeam.login;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
//import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.webkit.WebView;



public class MainActivity extends ActionBarActivity /*implements OnClickListener*/
{
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        
       //encontrar el boton por su ID 
       Button boton = (Button) findViewById(R.id.ingresar);
       boton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
		
		
			String usuario  = ((EditText)findViewById(R.id.txtuser)).getText().toString();
			
			String password = ((EditText)findViewById(R.id.txtpass)).getText().toString();
			
			
			if (usuario.equals("admin") && password.equals("admin"))
			{
				Intent nuevoform = new Intent(MainActivity.this,Secundario.class);
				startActivity(nuevoform);
			}
			else
			{			
				Toast.makeText(getApplicationContext(), "Usuario Incorrecto!", Toast.LENGTH_SHORT).show();

			}
			
			
		}
	});
       
        
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}

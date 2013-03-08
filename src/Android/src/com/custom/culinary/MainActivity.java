package com.custom.culinary;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);			
		
		ListView listView = (ListView) findViewById(R.id.Recent);
		String[] values = new String[]{"Recent01","Recent02","Recent03","Recent04"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
		
		listView.setAdapter(adapter);
	}

	//@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addCustomFood(View v){
		setContentView(R.layout.add_prescription);	
	}	
	
	public void addSomeIngredient(View v){
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("New Ingredient");
		alert.setMessage("Select the new ingredient");
		
		final EditText input = new EditText(this);
		alert.setView(input);
		
		alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int whichButton) {
				// TODO Auto-generated method stub
				String value = input.getText().toString();				
			}
		});
		
		
		alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				return;
			}
		});
		
		
		alert.show();
	}

}

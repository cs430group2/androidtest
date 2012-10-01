package khajah.example.khajah;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	
	String classes[] = { "MainActivity", "example1", "example2", "example3", 
			"example4", "example5", "example6"};
	
	//classes[4];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter <String>(Menu.this, android.R.layout.simple_list_item_1, classes) ); // create array adapter and String Type 
	
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position]; // choose what position you need  
		try{
		@SuppressWarnings("rawtypes")
		Class ourClass = Class.forName("khajah.example.khajah.MainActivity." + cheese);
		Intent ourIntent = new Intent(Menu.this, ourClass);
		startActivity(ourIntent);
	
	}catch(ClassNotFoundException e){ // for debugger 
		e.printStackTrace();
	}

	
	}

}

package khajah.example.khajah;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends Activity {
	
	int counter;
	Button add, sub;     // use options when Button became red then click for import android.widget.Button
	TextView  display; 	// same as here when Text view became red click import android.widget.TextView;

	
	
	
	// now we need to connect these variable to XML the display and two button 
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        counter = 0;
        add = (Button) findViewById(R.id.bAdd); // this to connect XML with java id
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.textView1);
        
     
        
        add.setOnClickListener(new View.OnClickListener() { // when you click something it do something on your phone
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Your total is " + counter);
			}
		});
    
       
        sub.setOnClickListener(new View.OnClickListener() { // when you click something it do something on your phone
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Your total is " + counter);
			}
		});
        
        
        
        
        
        
    } // end of public class
    
 

    
    
    
    
    
    
    
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

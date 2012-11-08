package khajah.example.khajah;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	
	MediaPlayer ourSong;
	
	@Override
	protected void onCreate(Bundle AbbasKhajah) {
		// TODO Auto-generated method stub
		super.onCreate(AbbasKhajah);
	
	 setContentView(R.layout.splash);
	
	 ourSong = MediaPlayer.create(Splash.this, R.raw.splashsound);
	 ourSong.start();
	 
			 
			 
			 
	 Thread timer = new Thread(){
		 public void run(){
			 try{
				 
				 sleep(5000); // sleep for 5000ms
				 
				 
				 
			 } catch (InterruptedException e){ // if any interrupt happen it will catch it for debug
				 
				 e.printStackTrace();
			 } finally{
				 Intent openMainActivity = new Intent("khajah.example.khajah.MAINACTIVITY");
				 startActivity(openMainActivity);
				 
			 }
			 
			 
			 
		 }
		 
	  };
	 timer.start();
   }
 
	// here will shut down splash activity 
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	
		ourSong.release();
		finish();
	
	}
								
}

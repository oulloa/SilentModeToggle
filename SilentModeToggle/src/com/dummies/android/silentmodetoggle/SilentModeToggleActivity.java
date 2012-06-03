package com.dummies.android.silentmodetoggle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.AudioManager;

public class SilentModeToggleActivity extends Activity {
    /** Called when the activity is first created. */
    
	private AudioManager mAudioManager;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAudioManager = (AudioManager)getSystemService(AUDIO_SERVICE);
        setContentView(R.layout.main);
        
        setButtonClickListener();
        
    }
    
    private void setButtonClickListener(){
    	
    	 Button toggleButton = (Button)findViewById(R.id.toggleButton);
         toggleButton.setOnClickListener( new View.OnClickListener() {    	 
        	public void onClick(View v) {
        		
         		
         		
         	}
        	 
         });
    	
         
         
    }

}
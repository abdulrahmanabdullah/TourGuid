package abdulrahmanjavanrd.com.tourguid.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import abdulrahmanjavanrd.com.tourguid.R;
import abdulrahmanjavanrd.com.tourguid.app.MainActivity;

/**
 * Created by abdulrahman on 12/23/17.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LogoThread thread = new LogoThread();
        thread.start();
        Intent mIntent = new Intent(this, MainActivity.class);
        startActivity(mIntent);
        finish();
    }


    private class LogoThread extends Thread{

        @Override
        public void run() {
            try{
               Thread.sleep(3000);
            }catch (Exception e ){
                Log.e("thread ",e.getMessage());
            }
        }
    }
}

package abdulrahmanjavanrd.com.tourguid.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import abdulrahmanjavanrd.com.tourguid.R;
import abdulrahmanjavanrd.com.tourguid.app.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /** to get Full screen when app start  */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        LogoThread thread = new LogoThread();
        thread.start();
    }

    /**
     * This inner class have two process
     * 1 - stay {@link SplashActivity} 4 seconds Then
     * 2 - go to MainActivity
     */
    private class LogoThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            /** Go to {@link MainActivity} */
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }
    }
}

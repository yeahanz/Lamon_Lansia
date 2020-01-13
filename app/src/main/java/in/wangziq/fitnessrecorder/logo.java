package in.wangziq.fitnessrecorder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.wangziq.fitnessrecorder.activities.MainActivity;

public class logo extends AppCompatActivity {
    private int waktu = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(logo.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },waktu);
    }
}

package com.example.robirb.loginproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    UserLocalDatabase userLocalDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userLocalDatabase = new UserLocalDatabase(getApplicationContext());

        if(!userLocalDatabase.isLogin()){
            gotoLoginActivity();
        }

        /*SharedPreferences sharedPreferences = getSharedPreferences("ROBI",MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit();

        editor.putString("KEY","HHHHHHHHHHHH");
        editor.putString("ROBI","I am Robi....");
        editor.putInt("ATIK",190);
        editor.commit();


        Log.d("HHH",sharedPreferences.getString("KEY","Key THik Nai"));
        Log.d("HHHH",sharedPreferences.getString("ROBI","Key THik Nai"));
        Log.d("HHH",sharedPreferences.getInt("AITK",0)+"");
*/

    }


    @Override
    protected void onResume() {
        super.onResume();

    }


    private void gotoLoginActivity(){
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}



package com.example.pure;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("PatronPuro", "Activity lanzada correctamente con am start");
        finish(); // es NoDisplay, se cierra solo
    }
}
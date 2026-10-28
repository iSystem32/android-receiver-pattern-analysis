
package com.example.pure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("PatronPuro", "Receiver recibido correctamente con am broadcast: " + intent.getAction());
        // Aquí va tu lógica - este NO se puede lanzar con am start
     }
}
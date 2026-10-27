
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
I/auditd ( 449): type=1400 audit(0.0:56983): avc: denied { read } for comm="binder:449_4" name="wakeup109" dev="sysfs" ino=39640 scontext=u:r:system_suspend:s0 tcontext=u:object_r:sysfs_batteryinfo:s0 tclass=dirpermissive=0
I/auditd ( 449): type=1400 audit(0.0:56984): avc: denied { read } for comm="binder:449 4" name="wakeup105" dev="sysfs" ino=39388 scontext=u:r:system_suspend:s0 tcontext=u:object_r:sysfs battery_supply:s0 tclass=dir permissive=0
I/binder_sample( 1252): [android.system.suspend.internal.ISuspendControlServiceInternal,3,250,system_server,50]
I/sysui_multi_action( 1252): [757,127,758,1] intercept_power( 1252): [ACTION_UP,0,0]

     }
}
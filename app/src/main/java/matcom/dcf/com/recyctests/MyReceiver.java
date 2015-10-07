package matcom.dcf.com.recyctests;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by dfinlay-air on 07/10/15.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra("bcstmsg");
        Toast.makeText(context,"Recieved Broadcast  "+msg,Toast.LENGTH_SHORT).show();
    }
}

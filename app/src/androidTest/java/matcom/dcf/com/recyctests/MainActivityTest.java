package matcom.dcf.com.recyctests;

import android.app.Instrumentation;
import android.app.LauncherActivity;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by dfinlay-air on 07/10/15.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    MainActivity ma;
    Instrumentation instr;

    @Rule
    public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Before
    public void setUp() {
        //
        instr = InstrumentationRegistry.getInstrumentation();

    }

    @Test
    public void testAddition() {
        ma = main.get();
        TextView tv = (TextView) ma.findViewById(R.id.txtResult);
        String res = tv.getText().toString();
        Assert.assertEquals("Result should be ***", "***", res);

    }
    
}
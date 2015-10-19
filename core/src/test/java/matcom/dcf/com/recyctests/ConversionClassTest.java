package matcom.dcf.com.recyctests;

import static org.junit.Assert.*;

/**
 * Created by dfinlay-air on 19/10/15.
 */
public class ConversionClassTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void testConvertValue() throws Exception {
        //
        double res = ConversionClass.convertValue(4);
        assertEquals("Conversion Wrong",3,2);

    }
}
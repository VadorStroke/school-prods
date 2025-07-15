import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestOfTime {

    @Before
    public void setUp() {
    }

    @Test
    public void testTime1() {
        String myTime = "13:45:00";
        Time t = new Time(myTime);
        Assert.assertEquals(myTime, t.toString());

    }

    @Test
    public void testTime2() {
        Time t1 = new Time("13:00:00");
        Time t2 = new Time("14:00:00");
        Duration d = new Duration("hours", 1);
        Assert.assertEquals(d.intValue("second"), t2.subtract(t1).intValue("second"));
    }

    @Test
    public void testTime3() {
        Time t1 = new Time("13:00:00");
        Duration n = new Duration("hours", 0);
        Duration n2 = t1.subtract(t1);
        Assert.assertEquals(n, n2);

    }

    @Test
    public void testDuration1() {
        Duration d = new Duration("milliseconds", 100);
        Assert.assertEquals(100, d.intValue("milliseconds"));
    }

    @Test
    public void testDuration2() {
        Duration d = new Duration("minutes", 60);

        Assert.assertEquals(3600, d.intValue("seconds"));

    }

    @Test
    public void testDuration3() {
        Duration d = new Duration("minutes", 60);
        Assert.assertEquals(60, d.intValue("minutes"));
    }

    @Test
    public void testDuration4() {
        Duration d = new Duration("hours", 2);
        Assert.assertEquals(2, d.intValue("hours"));
    }
}
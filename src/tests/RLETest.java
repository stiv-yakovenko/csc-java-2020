package tests;

import org.junit.Assert;
import org.junit.Test;
import task2.rle.RLECompress;

public class RLETest {
    @Test
    void testCompress(){
        String s0="ТТТТТТТТУУУУУУУТТТТТТТ ММММННННОООГГООО ПООООООВВВВВТТТТТОООРРООВВ";
        String c = "T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2";
        String res = RLECompress.compress(s0);
        Assert.assertEquals(res,c);
    }
}

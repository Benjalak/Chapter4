/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.pamarin.chapter4.Ip;
import com.pamarin.chapter4.YesNo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author offie
 */
public class SumAveragePatientT {

    private int sum(Ip ip) {

        return ip.getRole1().getScore()
                + ip.getRole2().getScore()
                + ip.getRole3().getScore()
                + ip.getRole4().getScore()
                + ip.getRole5().getScore();
    }

    @Test
    public void sum1Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));
    }

    @Test
    public void sum2Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(5, sum(ip));
    }
}

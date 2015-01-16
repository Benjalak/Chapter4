/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.pamarin.chapter4.Ip;
import com.pamarin.chapter4.Op;
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

    private int sum(Op ip) {

        return ip.getRole1().getScore()
                + ip.getRole2().getScore()
                + ip.getRole3().getScore()
                + ip.getRole4().getScore()
                + ip.getRole5().getScore()
                + ip.getRole6().getScore()
                + ip.getRole7().getScore();

    }
    
    private float avg(Ip ip) {

        return (ip.getRole1().getScore()
                + ip.getRole2().getScore()
                + ip.getRole3().getScore()
                + ip.getRole4().getScore()
                + ip.getRole5().getScore())/5;
    
    }
    
    private float avg(Op ip) {

        return (ip.getRole1().getScore()
                + ip.getRole2().getScore()
                + ip.getRole3().getScore()
                + ip.getRole4().getScore()
                + ip.getRole5().getScore()
                + ip.getRole6().getScore()
                + ip.getRole7().getScore())/7;
    
    }
    
    @Test
    public void sumIp1Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));
    }

    @Test
    public void sumIp2Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(5, sum(ip));
    }

    @Test
    public void sumIp3Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(3, sum(ip));
    }

    @Test
    public void sumIp4Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(3, sum(ip));
    }

    @Test
    public void sumIp5Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.NO);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(2, sum(ip));
    }
    
    @Test
    public void sumOp1Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(7, sum(ip));
    }

    @Test
    public void sumOp2Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(4, sum(ip));
    }
    
    @Test
    public void sumOp3Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(7, sum(ip));
    }
    
    @Test
    public void sumOp4Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(6, sum(ip));
    }
    
    @Test
    public void sumOp5Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.NO);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(5, sum(ip));
    }
    
    @Test
    public void avgIp1Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(0.6, avg(ip), 1);
    }
    
    @Test
    public void avgIp2Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(1, avg(ip), 1);
    }

    @Test
    public void avgIp3Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(0.6, avg(ip), 1);
    }

    @Test
    public void avgIp4Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(0.6, avg(ip), 1);
    }

    @Test
    public void avgIp5Test() {
        Ip ip = new Ip();
        ip.setRole1(YesNo.NO);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(0.4, avg(ip), 1);
    }
    
    @Test
    public void avgOp1Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(1, avg(ip), 1);
    }

    @Test
    public void avgOp2Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(0.6, avg(ip), 1);
    }
    
    @Test
    public void avgOp3Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(1, avg(ip), 1);
    }
    
    @Test
    public void avgOp4Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(0.9, avg(ip), 1);
    }
    
    @Test
    public void avgOp5Test() {
        Op ip = new Op();
        ip.setRole1(YesNo.NO);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);
        ip.setRole6(YesNo.YES);
        ip.setRole7(YesNo.YES);

        assertEquals(0.7, avg(ip), 1);
    }
}

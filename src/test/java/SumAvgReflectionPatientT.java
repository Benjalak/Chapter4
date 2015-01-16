
import com.pamarin.chapter4.Ip;
import com.pamarin.chapter4.Op;
import com.pamarin.chapter4.YesNo;
import java.lang.reflect.Method;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author offie
 */
public class SumAvgReflectionPatientT {

    private int sum(Ip ip) throws Exception {
        Method[] methods = ip.getClass().getMethods();
        int sum = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
            }
        }
        return sum;
    }
    
    private int sum(Op ip) throws Exception {
        Method[] methods = ip.getClass().getMethods();
        int sum = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
            }
        }
        return sum;
    }
    
    private float avg(Ip ip) throws Exception {
        Method[] methods = ip.getClass().getMethods();
        int sum = 0;
        float avg = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
                avg = sum/5;
            }
        }
        return avg;
    }
    
    private float avg(Op ip) throws Exception {
        Method[] methods = ip.getClass().getMethods();
        int sum = 0;
        float avg = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
                avg = sum/7;
            }
        }
        return avg;
    }

    @Test
    public void sumIp1Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));
    }

    @Test
    public void sumIp2Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(5, sum(ip));
    }

    @Test
    public void sumIp3Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(3, sum(ip));
    }
    
    @Test
    public void sumIp4Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(3, sum(ip));
    }
    
    @Test
    public void sumIp5Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.NO);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(2, sum(ip));
    }
    
    @Test
    public void sumOp1Test() throws Exception {
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
    public void sumOp2Test() throws Exception {
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
    public void sumOp3Test() throws Exception {
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
    public void sumOp4Test() throws Exception {
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
    public void sumOp5Test() throws Exception {
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
    public void avgIp1Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(0.6, avg(ip), 1);
    }
    
    @Test
    public void avgIp2Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(1, avg(ip), 1);
    }

    @Test
    public void avgIp3Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(0.6, avg(ip), 1);
    }

    @Test
    public void avgIp4Test()throws Exception  {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.NO);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.NO);

        assertEquals(0.6, avg(ip), 1);
    }

    @Test
    public void avgIp5Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.NO);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(0.4, avg(ip), 1);
    }
    
    @Test
    public void avgOp1Test() throws Exception {
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
    public void avgOp2Test() throws Exception {
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
    public void avgOp3Test() throws Exception {
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
    public void avgOp4Test() throws Exception {
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
    public void avgOp5Test() throws Exception {
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

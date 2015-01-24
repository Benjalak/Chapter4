
import com.pamarin.chapter4.Ip;
import com.pamarin.chapter4.Op;
import com.pamarin.chapter4.Patient;
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

    //sum / n        
    private float average(Patient patient) throws Exception {
        return ((float) sum(patient)) / count(patient);
    }

    private int count(Patient patient) throws Exception {
        Method[] methods = patient.getClass().getMethods();
        int count = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                count = count + 1;
            }
        }
        return count;
    }

    private int sum(Patient patient) throws Exception {
        Method[] methods = patient.getClass().getMethods();
        int sum = 0;
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(patient);
                sum = sum + yn.getScore();
            }
        }
        return sum;
    }

    @Test
    public void sum1Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.NO);
        ip.setRole4(YesNo.NO);
        ip.setRole5(YesNo.YES);

        assertEquals(3, sum(ip));
        assertEquals(0.6, average(ip), 0.05);
    }

    @Test
    public void sum2Test() throws Exception {
        Ip ip = new Ip();
        ip.setRole1(YesNo.YES);
        ip.setRole2(YesNo.YES);
        ip.setRole3(YesNo.YES);
        ip.setRole4(YesNo.YES);
        ip.setRole5(YesNo.YES);

        assertEquals(5, sum(ip));
        assertEquals(1, average(ip), 0);
    }

    @Test
    public void sum3Test() throws Exception {
        Op op = new Op();
        op.setRole1(YesNo.YES);
        op.setRole2(YesNo.YES);
        op.setRole3(YesNo.YES);
        op.setRole4(YesNo.YES);
        op.setRole5(YesNo.YES);
        op.setRole6(YesNo.YES);
        op.setRole7(YesNo.YES);

        assertEquals(7, sum(op));
        assertEquals(1, average(op), 0);
    }
}
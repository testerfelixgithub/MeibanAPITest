package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveActFind {
    Common comm = new Common();

    @Test
    public void actFind() //������������
    {
        String url = "http://10.112.178.22/approve/act/view?key=process-15-15-1504172525093&flowId=88&companyId=15";
//	String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String result = comm.GetRequest(url, "ce0ed01e-c784-4860-9fff-9e025e70393b", "E:\\approveActFind.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void actFind1() //�쳣�������ݣ������ڵ����̶���ID��
    {
        String url = "http://10.112.178.22/approve/act/view?key=54588&flowId=88&companyId=88";
//	String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String result = comm.GetRequest(url, "ce0ed01e-c784-4860-9fff-9e025e70393b", "E:\\approveActFind.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void actFind2() //�쳣�������ݣ������ڵ�����ID��
    {
        String url = "http://10.112.178.22/approve/act/view?key=process-15-15-1504172525093&flowId=1088&companyId=88";
//	String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String result = comm.GetRequest(url, "ce0ed01e-c784-4860-9fff-9e025e70393b", "E:\\approveActFind.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void actFind3() //�쳣�������ݣ������ڵĹ�˾ID��
    {
        String url = "http://10.112.178.22/approve/act/view?key=process-15-15-1504172525093&flowId=88&companyId=998";
//	String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String result = comm.GetRequest(url, "ce0ed01e-c784-4860-9fff-9e025e70393b", "E:\\approveActFind.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

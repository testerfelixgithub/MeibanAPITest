package meibanAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class user_info {
    Common comm = new Common();

    @Test
    public void user_info1() //������ȡ�û���Ϣ
    {
        String url = "http://10.112.178.22/v1/staff/detail?id=7097&b1510895299347=1";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "f5a9909d-c83f-46c5-869e-9b268446f0ad", "E:\\user_info.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void user_info2() //��������
    {
        String url = "http://10.112.178.22/v1/staff/detail?id=&";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "f5a9909d-c83f-46c5-869e-9b268446f0ad", "E:\\user_info.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void user_info3() //��ȡ�����ڵ��û���Ϣ
    {
        String url = "http://10.112.178.22/v1/staff/detail?id=zyzy";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "f5a9909d-c83f-46c5-869e-9b268446f0ad", "E:\\user_info.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

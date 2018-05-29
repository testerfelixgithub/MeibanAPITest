package meibanAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

//重置密码
public class reset_pwd {
    Common comm = new Common();

    @Test
    public void reset_pwd1() //正常重置密码。
    {
        String url = "http://10.112.178.22/v1/user/reset_pwd";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffId\":\"7098\"}";
        String result = comm.PostRequest(url, params, token, "E:\\reset_pwd.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void reset_pwd2() //不存在的员工重置密码。
    {
        String url = "http://10.112.178.22/v1/user/reset_pwd";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffId\":\"1\"}";
        String result = comm.PostRequest(url, params, token, "E:\\reset_pwd.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

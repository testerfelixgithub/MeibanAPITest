package meibanAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class modifyPassword {
    Common comm = new Common();

    @Test
    public void modifyPassword1() //??????????????
    {
        String url = "http://10.112.178.22/v1/user/modifyPassword";
//	  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "0eacca75-569e-4e23-b87c-1bd9aa077686";
        String params = "{\"oldPwd\":\"MTIzNC5nb21l\",\"newPwd\":\"MTIzLmdvbWU=\",\"verifypwd\":\"MTIzLmdvbWU=\"}";
        String result = comm.PostRequest(url, params, token, "E:\\modifyPassword.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
//    Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void modifyPassword2() //????????
    {
        String url = "http://10.112.178.22/v1/user/modifyPassword";
//	  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "0eacca75-569e-4e23-b87c-1bd9aa077686";
        String params = "{\"oldPwd\":\"MTIzNC5nb21l\",\"newPwd\":\"MTIzLmdvbWU=\",\"verifypwd\":\"MTIzLmdvbWU=\"}";
        String result = comm.PostRequest(url, params, token, "E:\\modifyPassword.txt");
        String message = comm.GetCode(result);
//	  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void modifyPassword3() //?????????
    {
        String url = "http://10.112.178.22/v1/user/modifyPassword";
//	  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "0eacca75-569e-4e23-b87c-1bd9aa077686";
        String params = "{\"oldPwd\":\"MTIzLmdvbWU=\",\"newPwd\":\"MTIzLmdvbWU=\",\"verifypwd\":\"MTIzNC5nb21l\"}";
        String result = comm.PostRequest(url, params, token, "E:\\modifyPassword.txt");
        String message = comm.GetCode(result);
//	  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void modifyPassword4() //????????????
    {
        String url = "http://10.112.178.22/v1/user/modifyPassword";
//	  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "0eacca75-569e-4e23-b87c-1bd9aa077686";
        String params = "{\"oldPwd\":\"MTIzLmdvbWU=\",\"newPwd\":\"MQ==\",\"verifypwd\":\"MQ==\"}";
        String result = comm.PostRequest(url, params, token, "E:\\modifyPassword.txt");
        String message = comm.GetCode(result);
//	  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void modifyPassword5() //???????
    {
        String url = "http://10.112.178.22/v1/user/modifyPassword";
//	  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "0eacca75-569e-4e23-b87c-1bd9aa077686";
        String params = "{\"oldPwd\":\"\",\"newPwd\":\"\",\"verifypwd\":\"\"}";
        String result = comm.PostRequest(url, params, token, "E:\\modifyPassword.txt");
        String message = comm.GetCode(result);
//	  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

}

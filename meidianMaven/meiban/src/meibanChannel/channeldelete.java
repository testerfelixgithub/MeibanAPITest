package meibanChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

//ɾ��Ƶ��������������
public class channeldelete {
    Common comm = new Common();

    @Test
    public void channeldelete1() //ɾ�����ڵĲ���Ƶ����
    {
        String url = "http://10.112.178.22/admin/channel/delete";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"id\":\"5a0a86d5346eacad868cf7b8\"}";//����Ƶ��id
        String result = comm.PostRequest(url, params, token, "E:\\channeldelete.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channeldelete2() //ɾ�����ڵĳ���Ƶ����
    {
        String url = "http://10.112.178.22/admin/channel/delete";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"id\":\"5a0a9081346eacad868cf7bd\"}";//����Ƶ��id
        String result = comm.PostRequest(url, params, token, "E:\\channeldelete.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channeldelete3() //ɾ��ȫԱƵ��,��֧��ɾ��ȫԱƵ����ȫԱƵ��ֻ������ͣ�ã�����һ�κ󲻿��ٴ�����
    {
        String url = "http://10.112.178.22/admin/channel/delete";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"id\":\"5a0a914f346eacad868cf7c1\"}";//ȫԱƵ��id
        String result = comm.PostRequest(url, params, token, "E:\\channeldelete.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channeldelete4() //ɾ�������ڵ�Ƶ����
    {
        String url = "http://10.112.178.22/admin/channel/delete";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"id\":\"000\"}";
        String result = comm.PostRequest(url, params, token, "E:\\channeldelete.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channeldelete5() //�ظ�ɾ����
    {
        String url = "http://10.112.178.22/admin/channel/delete";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"id\":\"5a0a9081346eacad868cf7bd\"}";
        String result = comm.PostRequest(url, params, token, "E:\\channeldelete.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

package meibanChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

//ȫԱƵ�������á�ͣ�ò����������룬��ֻ��ȫԱƵ�������á�ͣ�ù��ܣ�����Ƶ�������ޣ�0���ã�1ͣ�ã���
public class channelopen {
    Common comm = new Common();

    @Test
    public void channelopen1() //ȫԱƵ�����á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"5a0a914f346eacad868cf7c1\",\"open\":0}";//ȫԱƵ��id������0
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelopen2() //ȫԱƵ��ͣ�á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"5a0a914f346eacad868cf7c1\",\"open\":1}";//ȫԱƵ��id��ͣ��1
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelopen3() //����Ƶ�����á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"5a0a86d5346eacad868cf7b8\",\"open\":0}";//����Ƶ��id������0
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelopen4() //����Ƶ��ͣ�á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"5a0a86d5346eacad868cf7b8\",\"open\":1}";//����Ƶ��id��ͣ��1
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelopen5() //����Ƶ�����á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"5a0a9081346eacad868cf7bd\",\"open\":0}";//����Ƶ��id������0
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelopen6() //����Ƶ��ͣ�á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"5a0a9081346eacad868cf7bd\",\"open\":1}";//����Ƶ��id��ͣ��1
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelopen7() //�����ڵ�Ƶ�����á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"00000\",\"open\":0}";//�����ڵ�Ƶ��id������0
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelopen8() //�����ڵ�Ƶ��ͣ�á�
    {
        String url = "http://10.112.178.22/admin/channel/open";
//		  String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String token = "640bf451-379d-4b2d-b22e-58ee918412dc";
        String params = "{\"id\":\"00000\",\"open\":1}";//�����ڵ�Ƶ��id��ͣ��1
        String result = comm.PostRequest(url, params, token, "E:\\channelopen.txt");
        String message = comm.GetCode(result);
//		  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

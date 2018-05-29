package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class delChannel {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void delChannel1() //����Ա�˳�����Ƶ��
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel2() //�ǹ���Ա���������˳�����Ƶ����������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel3() //�˳�ȫԱƵ��
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"59e89c7f6a1830400c49f299\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel4() //Ƶ��������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"122\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel5() //Ƶ��ΪNULL
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel6() //��˾IDΪ����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":-1,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel7() //��˾ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":333,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel9() //staffId������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":78787}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel10() //��˾ID����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void delChannel11() //�˳�����Ƶ����������Ա��
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"de257624-a617-4bf7-8997-81c2ceb38af5\",\"staffId\":7088}";
        String result = comm.PostRequest(url, params, token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

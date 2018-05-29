package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class receiveCommonMsg {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void receiveCommonMsg1() //����Ա���ò�������Ϣ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=6&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&receiveCommonMsg=1";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void receiveCommonMsg2() //����Ա���ý�����Ϣ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=6&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&receiveCommonMsg=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void receiveCommonMsg3() //�ǹ���Ա���ý�����Ϣ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=6&id=59e89c7f6a1830400c49f299&receiveCommonMsg=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void receiveCommonMsg4() //Ƶ��ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=6&id=23232323&receiveCommonMsg=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void receiveCommonMsg5() //Ƶ��IDΪNULL
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=6&id=&receiveCommonMsg=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void receiveCommonMsg6() //��˾IDΪNULL
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&receiveCommonMsg=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void receiveCommonMsg7() //��˾ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/receiveCommonMsg?companyId=34&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&receiveCommonMsg=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

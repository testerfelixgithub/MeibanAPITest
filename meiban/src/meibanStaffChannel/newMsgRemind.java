package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class newMsgRemind {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void newMsgRemind1() //Ƶ�������ѽ�����Ϣ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/newMsgRemind?companyId=6&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&newMsgRemind=1";
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
    public void newMsgRemind2() //Ƶ�����ѽ�����Ϣ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/newMsgRemind?companyId=6&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&newMsgRemind=0";
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
    public void newMsgRemind3() //Ƶ��ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/newMsgRemind?companyId=6&id=23243&newMsgRemind=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void newMsgRemind4() //Ƶ��ID����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/newMsgRemind?companyId=6&id=&newMsgRemind=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void newMsgRemind5() //��˾ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/newMsgRemind?companyId=1000&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&newMsgRemind=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void newMsgRemind6() //��˾ID����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/newMsgRemind?companyId=&id=266018d7-d743-4eba-bf06-3f0056dd7ef7&newMsgRemind=0";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"staffId\":7088}";
        String result = comm.PostRequest(url, "", token, "E:\\receiveCommonMsg.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

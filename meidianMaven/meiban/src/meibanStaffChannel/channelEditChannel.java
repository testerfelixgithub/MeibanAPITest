package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelEditChannel {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void channelEditChannel1() //����Ƶ������Ա�༭
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/editChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"channelName\":\"1\", \"type\":2}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelEditChannel2() //����Ƶ���ǹ���Ա�༭
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/editChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"channelName\":\"1\", \"type\":2}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelEditChannel3() //Ƶ������Ϊ�ǳ���Ƶ��
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/editChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"channelName\":\"1\", \"type\":1}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelEditChannel4() //Ƶ��ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/editChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"channelName\":\"1\", \"type\":1}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelEditChannel5() //��˾ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/editChannel";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":343,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"channelName\":\"1\", \"type\":1}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

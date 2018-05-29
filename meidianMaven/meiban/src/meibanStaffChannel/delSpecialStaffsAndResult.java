package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class delSpecialStaffsAndResult {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void delSpecialStaffsAndResult1() //����Ա�Ƴ�������Ա
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"listType\":1, \"staffIds\": [7260]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult8() //����Ա�Ƴ����������Ա
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"listType\":1, \"staffIds\": [7261,7262]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult2() //�ǹ���Ա�Ƴ�������Ա
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"59e89c7f6a1830400c49f299\",\"listType\":1, \"staffIds\": [7261,7262]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult3() //staffIds ����ֵ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"266018d7-d743-4eba-bf06-3f0056dd7ef7\",\"listType\":1, \"staffIds\": []}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult4() //channelId ����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"\",\"listType\":1, \"staffIds\": [7260]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult5() //channelId ������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"channelId\":\"343534\",\"listType\":1, \"staffIds\": [7260]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult6() //companId������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":32434,\"channelId\":\"343534\",\"listType\":1, \"staffIds\": [7260]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void delSpecialStaffsAndResult7() //companId����ֵ
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/delSpecialStaffsAndResult";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":\"\",\"channelId\":\"343534\",\"listType\":1, \"staffIds\": [7260]}";
        String result = comm.PostRequest(url, params, token, "E:\\delSpecialStaffsAndResult.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }
}

package meibanPCAddressList;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class favDelete_staff {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void favSave_staff1() //����Ӻ�ɾ��
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/save_staff?companyId=6&staffId=7294";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        //  String params="{\"companyId\":6,\"staffId\":\"7294\"}";
        String result = comm.PostRequest(url, "", token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void favDelete_staff1() //����ɾ��
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/delete_staff?companyId=6&staffId=7294";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        //	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
        String result = comm.PostRequest(url, "", token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void favDelete_staff2() //��ɾ���ڲ����˷���
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/delete_staff?companyId=6&staffId=7294";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        //	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
        String result = comm.PostRequest(url, "", token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void favDelete_staff3() //�����ڵ�Ա��ID
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/delete_staff?companyId=6&staffId=9999";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        //	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
        String result = comm.PostRequest(url, "", token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void favDelete_staff4() //�����ڵĹ�˾ID
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/delete_staff?companyId=1&staffId=9999";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        //	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
        String result = comm.PostRequest(url, "", token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

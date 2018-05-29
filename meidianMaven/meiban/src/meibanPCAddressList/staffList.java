package meibanPCAddressList;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class staffList {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void staffList1() //ֻ����˾ID
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/list";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"pageNo\":\"1\",\"pageSize\":\"20\"}";

        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffList2() //����˾ID�Ͳ���ID
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/list";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"deptId\":858,\"pageNo\":\"1\",\"pageSize\":\"20\"}";

        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffList3() //����˾ID��staffname
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/list";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"staffName\":\"32432432\",\"pageNo\":\"1\",\"pageSize\":\"20\"}";

        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffList4() //����˾ID��staffname(������)
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/list";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"staffName\":\"2333\",\"pageNo\":\"1\",\"pageSize\":\"20\"}";

        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffList5() //����˾ID�Ͳ���ID(������)
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/list";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":6,\"deptId\":54543,\"pageNo\":\"1\",\"pageSize\":\"20\"}";

        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffList6() //����˾ID(������)
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/list";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":0,\"pageNo\":\"1\",\"pageSize\":\"20\"}";

        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

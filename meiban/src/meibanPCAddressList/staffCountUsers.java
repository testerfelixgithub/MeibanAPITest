package meibanPCAddressList;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class staffCountUsers {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void staffCountUsers() //�˽ӿڷ���404
    {
        String host = Host.getURL();
        String url = host + "/v1/staff/countUsers";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String params = "{\"companyId\":1,\"deptId\":\"\",\"staffName\":\"\"}";
        String result = comm.PostRequest(url, params, token, "E:\\staffCountUsers.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

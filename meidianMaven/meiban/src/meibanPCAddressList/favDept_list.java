package meibanPCAddressList;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class favDept_list {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void favDept_list1()//���ڵĹ�˾ID
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/dept_list?companyId=6";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        String result = comm.GetRequest(url, token, "E:\\favDept_list1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void favDept_list2()//�����ڵĹ�˾ID
    {
        String host = Host.getURL();
        String url = host + "/v1/fav/dept_list?companyId=1";
        String token = "7d61c49d-4935-4cd9-801a-a4b9fddb53db";
        String result = comm.GetRequest(url, token, "E:\\favDept_list1.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

package meibanChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class createChannel //����Ƶ��
{
    Common comm = new Common();

    @Test

    public void create1()//��������Ƶ�����쳣״̬�����в���Ƶ��

    {
        String url = "https://work.pre.gomeplus.com/admin/channel/create";
        String token = comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{" +
                "\"name\": \"fxztext\"," +
                "\"desc\": \"fxz\"," +
                "\"adminId\": fxz," +
                "\"attribute\": {" +
                "\"privateOwn\": 0," +
                " \"offical\": 0," +
                "\"type\": 2" +
                "}," +
                "\"filterCond\": {" +
                " \"deptId\": \"1873\"" +
                "}," +
                "\"channellabel\": 0," +
                "\"companyId\": 1," +
                "\"specialStaffIds\": [4946]" +
                "}";

        String result = comm.PostRequest(url, params, token, "E:\\create.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

    @Test

    public void create2()//��������Ƶ��������״̬��

    {
        String url = "https://work.pre.gomeplus.com/admin/channel/create";
        String token = comm.Get_mobile_access_token("15910688057", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{\"name\":\"testt161\"," +
                "\"desc\":\"test111\"," +
                "\"adminId\":5234," +
                "\"attribute\":{\"privateOwn\":0,\"offical\":0,\"type\":2}," +
                "\"filterCond\":{\"deptId\":0},\"companyId\":1," +
                "\"channellabel\":0," +
                "\"specialStaffIds\":[5234,4984]}";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

}
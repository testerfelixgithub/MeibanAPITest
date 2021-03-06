package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveFlowUpdateStatus {
    Common comm = new Common();

    @Test
    public void FlowUpdateStatus() //������ͣ��
    {
        String url = "http://10.112.178.22/approve/setting/flow/updateStatus";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"id\": 90," +
                "\"companyId\": 6," +
                "\"status\": false" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void FlowUpdateStatus1() //����������
    {
        String url = "http://10.112.178.22/approve/setting/flow/updateStatus";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"id\": 90," +
                "\"companyId\": 6," +
                "\"status\": true" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void FlowUpdateStatus2() //������С��0
    {
        String url = "http://10.112.178.22/approve/setting/flow/updateStatus";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"id\": -1," +
                "\"companyId\": 6," +
                "\"status\": true" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void FlowUpdateStatus3() //companyId������
    {
        String url = "http://10.112.178.22/approve/setting/flow/updateStatus";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"id\": 90," +
                "\"companyId\": 0," +
                "\"status\": true" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void FlowUpdateStatus4() //companyId������С��0
    {
        String url = "http://10.112.178.22/approve/setting/flow/updateStatus";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"id\": 90," +
                "\"companyId\": -1," +
                "\"status\": true" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

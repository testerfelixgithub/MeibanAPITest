package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveflowModify //���������
{
    Common comm = new Common();

    @Test

    public void addApproveList1()//�Ѿ��������������� ���쳣״̬��

    {
        String url = "https://work.pre.gomeplus.com/approve/act/update";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{" +
                "\"flowId\": 256," +
                " \"companyId\": 1," +
                "\"process\": {" +
                " \"userTasks\": [" +
                " {" +
                " \"assigneeType\": \"assignee\"," +
                "\"id\": \"usertask1\"," +
                " \"name\": \"testone1122222\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": false" +
                " }" +
                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //	  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }


    @Test

    public void addApproveList2()//�Ѿ��������������� ���쳣״̬��

    {
        String url = "https://work.pre.gomeplus.com/approve/act/update";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{" +
                "\"flowId\": 255," +
                " \"companyId\": 1," +
                "\"process\": {" +
                " \"userTasks\": [" +
                " {" +
                " \"assigneeType\": \"assignee\"," +
                "\"id\": \"usertask1\"," +
                " \"name\": \"one1122222\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": false" +
                " }" +
                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //	  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }


}
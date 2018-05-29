package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveActAdd {
    Common comm = new Common();

    @Test
    public void ActAdd() //�����뵥û���������̴����ɹ�
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 114," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"\"," +           //${dept_0}
                "\"assigneeType\": \"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void ActAdd1() //�����뵥������������
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 106," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"\"," +           //${dept_0}
                "\"assigneeType\": \"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ActAdd2() //�����ڵ����뵥flowID
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 0," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"\"," +           //${dept_0}
                "\"assigneeType\": \"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ActAdd3() //�����ڵ�companyId
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 107," +
                "\"companyId\": 1," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"\"," +           //${dept_0}
                "\"assigneeType\": \"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ActAdd4() //�����ڵ�assignee
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 115," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"123456\"," +           //${dept_0}
                "\"assigneeType\": \"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ActAdd5() //�����ڵ�assigneeType
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 116," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"123456\"," +           //${dept_0}
                "\"assigneeType\":\"4543543\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": false," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ActAdd6() //isPromoterDelete����true��û��false
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 117," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"\"," +           //${dept_0}
                "\"assigneeType\":\"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"fxz\"," +
                "\"isPromoterDelete\": true," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ActAdd7() //nameΪnull
    {
        String url = "http://10.112.178.22/approve/act/add";
        //  String token=comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"flowId\": 118," +
                "\"companyId\": 6," +
                "\"process\": {" +
                "\"keyId\":\"process-6-7088-1504236644128\"," +
                "\"userTasks\": [" +
                " {" +
                "\"assignee\": \"\"," +           //${dept_0}
                "\"assigneeType\":\"assignee\"," +
                "\"id\":\"usertask1\"," +
                "\"name\":\"\"," +
                "\"isPromoterDelete\": true," +
                "\"isAssigneeChoice\": true" +
                "}" +

                "]" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }
}

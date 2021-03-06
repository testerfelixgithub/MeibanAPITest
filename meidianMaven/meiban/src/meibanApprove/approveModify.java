package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveModify {
    Common comm = new Common();

    @Test
    public void approveModify() //��������
    {
        String url = "http://10.112.178.22/approve/modify";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"isSubmit\": true," +
                "\"approves\": {" +
                "\"id\": 15," +
                "\"procInstId\": \"\"," +
                "\"formId\": 274," +
                "\"formName\": \"test\"," +
                "\"typeId\": 105," +
                "\"typeName\": \"test\"," +
                "\"code\": \"\"," +
                "\"status\": 4," +
                "\"ownerId\": 7088," +
                "\"ownerName\": \"Admin\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504496164362," +
                "\"utime\": 1504496164363," +
                "\"deleted\": true," +
                "\"curApprovers\": \"\"," +
                "\"summary\": \"\"" +
                "}," +
                "\"approveFlow\": {" +
                "\"id\": 105," +
                "\"name\": \"test\"," +
                "\"formId\": 274," +
                "\"formName\": \"test\"," +
                "\"procdefId\": \"process-6-7088-1504236810797\"," +
                "\"typeId\": 66," +
                "\"typeName\": \"fxztest\"," +
                "\"icon\": \"icon-1\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504236626848," +
                "\"utime\": 1504236810814," +
                "\"deleted\": true," +
                "\"summary\": \"\"," +
                "\"status\": true," +
                "\"orderCode\": 2000," +
                "\"enableTime\": 1504236646926," +
                "\"disableTime\": \"\"," +
                "\"isDeployed\": true" +
                "}," +
                "\"approveFlowTypes\": {" +
                "\"id\": 66," +
                "\"name\": \"fxztest1\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504172097619," +
                "\"utime\": 1504172097619," +
                "\"deleted\": true," +
                "\"icon\": \"\"," +
                "\"status\": true," +
                "\"orderCode\": 13000," +
                "\"enableTime\": 1504172097619," +
                "\"disableTime\": \"\"," +
                "\"isBind\": true," +
                "\"ruleCode\": 1" +
                "}," +
                "\"approveForms\": {" +
                "\"id\": 274," +
                "\"formName\": \"test\"," +
                "\"des\": \"\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504236626851," +
                "\"utime\": 1504236810815," +
                "\"deleted\": true" +
                "}," +
                "\"values\": [" +
                "{" +
                "\"formId\": 274," +
                "\"elementId\": 1," +
                "\"title\": \"TEXT\"," +
                "\"placeholder\": \"in\"," +
                "\"isMust\": 0," +
                "\"format\": \"yyyy-MM-dd\"," +
                "\"orderCode\": 1," +
                "\"valueId\": 21," +
                "\"approveId\": 15," +
                "\"formElementId\": 14054," +
                "\"value\": \"testfxz3333\"," +
                "\"typeName\": \"text\"," +
                "\"items\": []," +
                "\"formElementCode\": \"\"," +
                "\"extra1\": \"\"" +
                "}" +
                "]," +
                "\"notes\": [" +
                "{" +
                "\"id\": \"\"," +
                "\"approveId\": \"15\"," +
                "\"procInstId\": \"\"," +
                "\"taskId\": \"\"," +
                "\"note\": \"\"," +
                "\"ownerId\": \"\"," +
                "\"ownerName\": \"\"," +
                "\"resultCode\": \"\"," +
                "\"assignNow\": 7088," +
                "\"ctime\": \"\"," +
                "\"utime\": \"\"," +
                "\"taskName\": \"test1\"" +
                "}" +
                "]," +
                "\"assigneeInfo\": {" +
                "\"id\": 14," +
                "\"approveId\": 15," +
                "\"assigneeInfo\":" +
                "\"[{\\\"name\\\":\\\"test1\\\",\\\"assignee\\\":\\\"23\\\",\\\"isPromoterDelete\\\":false,\\\"isAssigneeChoice\\\":true,\\\"iconColor\\\":\\\"#b5b5e2\\\",\\\"colorFont\\\":\\\"in\\\",\\\"taskId\\\":\\\"usertask1\\\",\\\"value\\\":\\\"7088\\\"}]\"" +
                "}" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void approveModify1() //�޸��ı�����
    {
        String url = "http://10.112.178.22/approve/modify";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"isSubmit\": true," +
                "\"approves\": {" +
                "\"id\": 15," +
                "\"procInstId\": \"\"," +
                "\"formId\": 274," +
                "\"formName\": \"test\"," +
                "\"typeId\": 105," +
                "\"typeName\": \"test\"," +
                "\"code\": \"\"," +
                "\"status\": 4," +
                "\"ownerId\": 7088," +
                "\"ownerName\": \"Admin\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504496164362," +
                "\"utime\": 1504496164363," +
                "\"deleted\": true," +
                "\"curApprovers\": \"\"," +
                "\"summary\": \"\"" +
                "}," +
                "\"approveFlow\": {" +
                "\"id\": 105," +
                "\"name\": \"test\"," +
                "\"formId\": 274," +
                "\"formName\": \"test\"," +
                "\"procdefId\": \"process-6-7088-1504236810797\"," +
                "\"typeId\": 66," +
                "\"typeName\": \"fxztest\"," +
                "\"icon\": \"icon-1\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504236626848," +
                "\"utime\": 1504236810814," +
                "\"deleted\": true," +
                "\"summary\": \"\"," +
                "\"status\": true," +
                "\"orderCode\": 2000," +
                "\"enableTime\": 1504236646926," +
                "\"disableTime\": \"\"," +
                "\"isDeployed\": true" +
                "}," +
                "\"approveFlowTypes\": {" +
                "\"id\": 66," +
                "\"name\": \"fxztest1\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504172097619," +
                "\"utime\": 1504172097619," +
                "\"deleted\": true," +
                "\"icon\": \"\"," +
                "\"status\": true," +
                "\"orderCode\": 13000," +
                "\"enableTime\": 1504172097619," +
                "\"disableTime\": \"\"," +
                "\"isBind\": true," +
                "\"ruleCode\": 1" +
                "}," +
                "\"approveForms\": {" +
                "\"id\": 274," +
                "\"formName\": \"test\"," +
                "\"des\": \"\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504236626851," +
                "\"utime\": 1504236810815," +
                "\"deleted\": true" +
                "}," +
                "\"values\": [" +
                "{" +
                "\"formId\": 274," +
                "\"elementId\": 1," +
                "\"title\": \"TEXT\"," +
                "\"placeholder\": \"in\"," +
                "\"isMust\": 0," +
                "\"format\": \"yyyy-MM-dd\"," +
                "\"orderCode\": 1," +
                "\"valueId\": 21," +
                "\"approveId\": 15," +
                "\"formElementId\": 14054," +
                "\"value\": \"testfxz3333\"," +
                "\"typeName\": \"text\"," +
                "\"items\": []," +
                "\"formElementCode\": \"\"," +
                "\"extra1\": \"\"" +
                "}" +
                "]," +
                "\"notes\": [" +
                "{" +
                "\"id\": \"\"," +
                "\"approveId\": \"15\"," +
                "\"procInstId\": \"\"," +
                "\"taskId\": \"\"," +
                "\"note\": \"\"," +
                "\"ownerId\": \"\"," +
                "\"ownerName\": \"\"," +
                "\"resultCode\": \"\"," +
                "\"assignNow\": 7088," +
                "\"ctime\": \"\"," +
                "\"utime\": \"\"," +
                "\"taskName\": \"test1\"" +
                "}" +
                "]," +
                "\"assigneeInfo\": {" +
                "\"id\": 14," +
                "\"approveId\": 15," +
                "\"assigneeInfo\":" +
                "\"[{\\\"name\\\":\\\"test1\\\",\\\"assignee\\\":\\\"23\\\",\\\"isPromoterDelete\\\":false,\\\"isAssigneeChoice\\\":true,\\\"iconColor\\\":\\\"#b5b5e2\\\",\\\"colorFont\\\":\\\"in\\\",\\\"taskId\\\":\\\"usertask1\\\",\\\"value\\\":\\\"7088\\\"}]\"" +
                "}" +
                "}";
        String result = comm.PostRequest(url, params, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\FlowUpdateStatus.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

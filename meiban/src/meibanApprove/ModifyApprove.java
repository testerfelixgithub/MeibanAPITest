package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyApprove //�޸�������
{
    Common comm = new Common();

    @Test

    public void ModifyApproveList1()//�޸Ĵ������������� ������״̬��

    {
        String url = "https://work.pre.gomeplus.com/approve/update";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{" +
                "\"isSubmit\": true," +
                "\"approveId\": 61," +
                "\"approves\": {" +
                "\"id\": 61," +
                " \"procInstId\": \"150343\"," +
                "\"formId\": 414," +
                "\"formName\": \"tantest\"," +
                "\"typeId\": 245," +
                "\"typeName\": \"tantest\"," +
                "\"code\": \"\"," +
                "\"status\": 0," +
                "\"ownerId\": 3971," +
                "\"ownerName\": \"tan1\"," +
                "\"cid\": 1," +
                "\"ctime\": 1504577425208," +
                " \"utime\": 1504577425208," +
                " \"deleted\": true," +
                " \"curApprovers\": \"{\\\"name\\\":\\\"tan123\\\",\\\"staffId\\\":\\\"4319\\\"}\"," +
                "\"summary\": \"\"" +
                "}," +
                " \"approveFlow\": {" +
                "\"id\": 245," +
                "\"name\": \"tantest\"," +
                "\"formId\": 414," +
                "\"formName\": \"tantest\"," +
                " \"procdefId\": \"process-1-3971-1504519724703\"," +
                "\"typeId\": 63," +
                " \"typeName\": \"tan-test\"," +
                " \"icon\": \"icon-1\"," +
                "\"cid\": 1," +
                "\"ctime\": 1504519712814," +
                "\"utime\": 1504519712814," +
                " \"deleted\": true," +
                "\"summary\": \"\"," +
                " \"status\": true," +
                "\"orderCode\": 3000," +
                "\"enableTime\": 1504519725714," +
                "\"disableTime\": \"\"," +
                " \"isDeployed\": true " +
                "}," +
                "\"approveFlowTypes\": {" +
                "\"id\": 63," +
                " \"name\": \"tan-test\"," +
                "\"cid\": 1," +
                "\"ctime\": 1504172008586," +
                "\"utime\": 1504172008586," +
                "\"deleted\": true," +
                "\"icon\": \"\"," +
                "\"status\": true," +
                "\"orderCode\": 6000," +
                " \"enableTime\": 1504172008586," +
                "\"disableTime\": \"\"," +
                "\"isBind\": true," +
                " \"ruleCode\": 1" +
                "}," +
                "\"approveForms\": {" +
                "\"id\": 414," +
                "\"formName\": \"tantest\"," +
                "\"des\": \"\"," +
                " \"cid\": 1," +
                "\"ctime\": 1504519712821," +
                "\"utime\": 1504519712821," +
                " \"deleted\": true" +
                " }," +
                "\"values\": [" +
                "{" +
                "\"formId\": 414," +
                "\"elementId\": 1," +
                "\"title\": \"tan\"," +
                "\"placeholder\": \"shuru\"," +
                "\"isMust\": 0," +
                "\"format\": \"yyyy-MM-dd\"," +
                "\"orderCode\": 1," +
                "\"valueId\": 161," +
                "\"approveId\": 60," +
                "\"formElementId\": 14720," +
                " \"value\": \"test1111111\"," +
                "\"typeName\": \"text\"," +
                "\"items\": []," +
                "\"formElementCode\": \"\"," +
                "\"extra1\": \"\"" +
                "}" +
                "]," +
                "\"notes\": [" +
                "{" +
                "\"id\": \"\"," +
                "\"approveId\": \"\"," +
                "\"procInstId\": \"\"," +
                "\"taskId\": \"\"," +
                "\"note\": \"\"," +
                " \"ownerId\": \"\"," +
                "\"ownerName\": \"\"," +
                "\"resultCode\": \"\"," +
                "\"assignNow\": 4319," +
                "\"ctime\": \"\"," +
                " \"utime\": \"\"," +
                "\"taskName\": \"one1\" " +
                "}" +
                "]," +
                "\"assigneeInfo\": {" +
                "\"id\": 63," +
                "\"approveId\": 60," +
                "\"assigneeInfo\":" +
                "\"[{\\\"name\\\":\\\"test1\\\",\\\"assignee\\\":\\\"${usertask1}\\\",\\\"isPromoterDelete\\\":false,\\\"isAssigneeChoice\\\":true," +
                "" +
                "\\\"iconColor\\\":\\\"#61d6d6\\\",\\\"colorFont\\\":\\\"23\\\",\\\"taskId\\\":\\\"usertask1\\\",\\\"value\\\":\\\"4319\\\"}]\"" +

                " }" +
                "}";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

}
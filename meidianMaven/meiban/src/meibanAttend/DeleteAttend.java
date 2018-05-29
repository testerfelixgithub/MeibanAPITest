package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAttend {

    Common comm = new Common();

    @Test

    public void DeleteAttend1()//ɾ�������� ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/delete";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{" +
                "\"scheme\": {" +
                "\"schemeId\": 3," +
                "\"cid\": 1" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }


}

package meibanChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class updateAdmin {
    Common comm = new Common();

    @Test
    public void updateAdmin1() {
        String url = "http://10.112.178.22/admin/channel/updateAdmin?id=aaa&adminId=111";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\updateAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

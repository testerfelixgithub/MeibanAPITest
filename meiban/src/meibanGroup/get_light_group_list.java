package meibanGroup;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class get_light_group_list {
    Common comm = new Common();

    @Test
    public void get_light_group_list() {
        // String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/social/v1/group/get_light_group_list";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        // url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\get_light_group_list.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }
}

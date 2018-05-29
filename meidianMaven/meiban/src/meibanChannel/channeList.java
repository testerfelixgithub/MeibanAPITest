package meibanChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channeList {
    Common comm = new Common();

    @Test
    public void channeList1() //��������
    {
        String url = "http://10.112.178.22/admin/channel/list?companyId=6&pageNo=1&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        url = url.replaceAll(" ", "");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channeList2() //��˾ID������
    {
        String url = "http://10.112.178.22/admin/channel/list?companyId=-1&pageNo=1&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        url = url.replaceAll(" ", "");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channeList3() //��֤ҳ��������
    {
        String url = "http://10.112.178.22/admin/channel/list?companyId=6&pageNo=2&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        url = url.replaceAll(" ", "");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }
}

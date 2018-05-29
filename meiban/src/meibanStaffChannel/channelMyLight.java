package meibanStaffChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelMyLight {
    Common comm = new Common();

    @Test
    public void channelMyLight1() {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/myLight?companyId=1&timestamp=1461026406";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
//	  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//	  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channelMyLight2() //�����ڵĹ�˾ID
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/myLight?companyId=1000&timestamp=1461026406";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
//	  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//	  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelMyLight3() //�����ڵĹ�˾IDΪ����
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/myLight?companyId=-1&timestamp=1461026406";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
//	  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//	  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelMyLight4() //��˾IDΪ�Σգ̣�
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/myLight?companyId=&timestamp=1461026406";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
//	  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//	  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

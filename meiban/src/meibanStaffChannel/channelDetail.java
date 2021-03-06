package meibanStaffChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelDetail {
    Common comm = new Common();

    @Test
    public void channelDetail1() //��������
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/detail?companyId=1&id=596c7b7bf8c01202a25c4c85";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channelDetail2() //��˾ID������
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/detail?companyId=100000&id=596c7b7bf8c01202a25c4c85";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelDetail3() //��˾IDΪ����
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/detail?companyId=-1&id=596c7b7bf8c01202a25c4c85";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelDetail4() //��˾IDΪNULL
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/detail?companyId=&id=596c7b7bf8c01202a25c4c85";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelDetail5() //Ƶ��IDΪNULL
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/detail?companyId=1&id=";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelDetail6() //Ƶ��ID������
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/detail?companyId=1&id=2343";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }
}

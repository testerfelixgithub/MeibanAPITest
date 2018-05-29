package meibanStaffChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelMemberList {
    Common comm = new Common();

    @Test
    public void MemberList() {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/memberList?companyId=1&channelId=596c7b7bf8c01202a25c4c85&timestamp=1461026406";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
//		  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void MemberList1() //��˾ID������
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/memberList?companyId=15555&channelId=596c7b7bf8c01202a25c4c85&timestamp=1461026406";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
//		  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void MemberList2() //��˾ID������Ϊ����
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/memberList?companyId=-1&channelId=596c7b7bf8c01202a25c4c85&timestamp=1461026406";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
//		  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void MemberList3() //��˾ID������ΪNULL
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/memberList?companyId=&channelId=596c7b7bf8c01202a25c4c85&timestamp=1461026406";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
//		  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void MemberList4() //Ƶ��IDΪ��
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/memberList?companyId=1&channelId=&timestamp=1461026406";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
//		  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void MemberList5() //Ƶ��ID������
    {
        // String param = comm.Str_utf("��Ʒ");
        String url = "https://work.pre.gomeplus.com/v1/channel/memberList?companyId=1&channelId=11&timestamp=1461026406";
//		 String aa= java.net.URLEncoder.encode(url,"utf-8");
//		  String token=comm.Get_mobile_access_token("13552883585", "MTIzLmdvbWU=");
//		  System.out.println(token);
//		  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "74909481-59b9-4ae8-9122-8dc133dcee90", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

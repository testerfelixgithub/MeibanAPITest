package meibanChannel;

import java.io.UnsupportedEncodingException;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelQuery {
    Common comm = new Common();

    @Test
    public void channelQuery()  //�������� ���ڵ�����
    {

        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=1&pageSize=10";
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
    public void channelQuery1()  //��������
    {

        //  String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=111&pageNo=1&pageSize=10";
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
    public void channelQuery2()  //����Ӣ��
    {

        //  String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=aaa&pageNo=1&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channelQuery7()  //���������ڵ�Ƶ������
    {

        //  String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=aaa&pageNo=1&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channelQuery3()  //pageNoΪ����
    {
        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=-1&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelQuery8()  //pageNoΪ0
    {
        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=0&pageSize=10";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelQuery4()  //pageNo��pageSize����ҳ����֤
    {


        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=0&pageSize=15";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    @Test
    public void channelQuery5()  //pageSizeΪ����
    {


        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=2&pageSize=-1";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelQuery6()  //pageSize��pageNo���Ͳ�ƥ��
    {


        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=2&pageSize=qqq";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelQuery9()  //pageSizeΪ0
    {


        String param = comm.Str_utf("��Ʒ");
        String url = "http://10.112.178.22/admin/channel/channelQuery?companyId=6&channelName=" + param + "&pageNo=2&pageSize=0";
//	 String aa= java.net.URLEncoder.encode(url,"utf-8");
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        //  url = url.replaceAll(" ","");
        String result = comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\channelQuery1.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

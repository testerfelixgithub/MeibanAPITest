package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelTop {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void channelTop0() //�������� �����ö�
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=1&id=59eea4460a139ee7ad038017&top=1";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelTop1() //�������� ȡ���ö�
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=1&id=59eea4460a139ee7ad038017&top=0";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelTop2() //��˾ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=10000&id=59eea4460a139ee7ad038017&top=0";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelTop3() //��˾ID������Ϊ����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=-1&id=59eea4460a139ee7ad038017&top=0";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        // System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelTop4() //��˾IDΪNULL
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=&id=59eea4460a139ee7ad038017&top=0";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelTop5() //Ƶ��ID������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=1&id=22&top=0";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelTop6() //Ƶ��IDΪNULL
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/top?companyId=1&id=&top=0";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelTop.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}
package meibanStaffChannel;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelModifyDesc {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void channelModifyDesc0() //��������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=59eea4460a139ee7ad038017&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        // System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyDesc.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelModifyDesc1() //�ǹ���Ա����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=596c7b7bf8c01202a25c4c85&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        // System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyDesc.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc2() //��˾idΪ����
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=-1&id=596c7b7bf8c01202a25c4c85&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        // System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc3() //��˾idΪ������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1000&id=596c7b7bf8c01202a25c4c85&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc4() //��˾idΪnull
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=&id=596c7b7bf8c01202a25c4c85&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        // System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc5() //Ƶ��idΪ������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=1&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc6() //Ƶ��idΪnull
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc7() //Ƶ��idΪ�������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=*&%234&desc=123";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void channelModifyDesc8() //˵��Ϊnull
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=59eea4460a139ee7ad038017&desc=";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
//	  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void channelModifyDesc9() //˵��Ϊ�������
    {
        String host = Host.getURL();
        String url = host + "/v1/channel/modifyDesc?companyId=1&id=59eea4460a139ee7ad038017&desc=-1&&***##@@@@&";
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        // String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //  System.out.println(token);
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\channelModifyNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

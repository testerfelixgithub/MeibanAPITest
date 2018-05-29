package meibanAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StaffSetTop {
    Common comm = new Common();

    @Test
    public void staffSetTop() //�������ݣ������ö�
    {
        String url = "https://work.pre.gomeplus.com/admin/staff/setTop?id=4005&deptId=1084&top=1";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "f0f6181e-11a7-4878-94e2-d50bf023216a";
        String params = "";
        String result = comm.PostRequest(url, params, token, "E:\\setTop.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void staffSetTop1() //�������ݣ�ȡ���ö�
    {
        String url = "https://work.pre.gomeplus.com/admin/staff/setTop?id=4005&deptId=1084&top=0";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "f0f6181e-11a7-4878-94e2-d50bf023216a";
        String params = "";
        String result = comm.PostRequest(url, params, token, "E:\\setTop.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void staffSetTop2() //�����ڵ�ID��������
    {
        String url = "https://work.pre.gomeplus.com/admin/staff/setTop?id=-1&deptId=1084&top=0";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "f0f6181e-11a7-4878-94e2-d50bf023216a";
        String params = "";
        String result = comm.PostRequest(url, params, token, "E:\\setTop.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffSetTop3() //�����ڵ�deptId��������
    {
        String url = "https://work.pre.gomeplus.com/admin/staff/setTop?id=4005&deptId=-1&top=0";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "f0f6181e-11a7-4878-94e2-d50bf023216a";
        String params = "";
        String result = comm.PostRequest(url, params, token, "E:\\setTop.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffSetTop4() //Top ֵ����0��1����ֵ��������
    {
        String url = "https://work.pre.gomeplus.com/admin/staff/setTop?id=4005&deptId=1084&top=-1";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "f0f6181e-11a7-4878-94e2-d50bf023216a";
        String params = "";
        String result = comm.PostRequest(url, params, token, "E:\\setTop.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

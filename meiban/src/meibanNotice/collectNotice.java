package meibanNotice;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class collectNotice {
    Common comm = new Common();

    @Test
    public void collectNotice() //����--�޸Ĺ����ղ�״̬Ϊ0��δ�ղأ�
    {
        String url = "http://10.112.178.22/notice/collectNotice";
        //String token=comm.Get_mobile_access_token("13521512787", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "d37153fb-16a4-4ff8-bee3-b478227ae298";
        String params = "{\"id\":44,\"noticeId\":83,\"hascollect\":0}";
        String result = comm.PutRequest(url, params, token, "E:\\collectNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void collectNotice1() //����--�޸Ĺ����ղ�״̬Ϊ1���ղأ�
    {
        String url = "http://10.112.178.22/notice/collectNotice";
        //String token=comm.Get_mobile_access_token("13521512787", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "d37153fb-16a4-4ff8-bee3-b478227ae298";
        String params = "{\"id\":44,\"noticeId\":83,\"hascollect\":1}";
        String result = comm.PutRequest(url, params, token, "E:\\collectNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void collectNotice2() //�쳣--�����ڵ�Ա������id�ղ�
    {
        String url = "http://10.112.178.22/notice/collectNotice";
        //String token=comm.Get_mobile_access_token("13521512787", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "d37153fb-16a4-4ff8-bee3-b478227ae298";
        String params = "{\"id\":9998,\"noticeId\":83,\"hascollect\":1}";
        String result = comm.PutRequest(url, params, token, "E:\\collectNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void collectNotice3() //�쳣--�����ڵĹ���id�ղ�
    {
        String url = "http://10.112.178.22/notice/collectNotice";
        //String token=comm.Get_mobile_access_token("13521512787", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "d37153fb-16a4-4ff8-bee3-b478227ae298";
        String params = "{\"id\":44,\"noticeId\":9998,\"hascollect\":1}";
        String result = comm.PutRequest(url, params, token, "E:\\collectNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void collectNotice4() //�쳣--�����ڵ�Ա������idȡ���ղ�
    {
        String url = "http://10.112.178.22/notice/collectNotice";
        //String token=comm.Get_mobile_access_token("13521512787", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "d37153fb-16a4-4ff8-bee3-b478227ae298";
        String params = "{\"id\":9998,\"noticeId\":83,\"hascollect\":0}";
        String result = comm.PutRequest(url, params, token, "E:\\collectNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void collectNotice5() //�쳣--�����ڵĹ���idȡ���ղ�
    {
        String url = "http://10.112.178.22/notice/collectNotice";
        //String token=comm.Get_mobile_access_token("13521512787", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "d37153fb-16a4-4ff8-bee3-b478227ae298";
        String params = "{\"id\":44,\"noticeId\":9998,\"hascollect\":0}";
        String result = comm.PutRequest(url, params, token, "E:\\collectNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

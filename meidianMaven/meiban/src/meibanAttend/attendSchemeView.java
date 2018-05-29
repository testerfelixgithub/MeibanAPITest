package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attendSchemeView {
    Common comm = new Common();

    @Test
    public void attendSchemeView() //������ֵ
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/view?cid=1&id=235";
        String token = comm.Get_mobile_access_token("18800000073", "MTIzLmdvbWU=");
        System.out.println(token);
        String result = comm.GetRequest(url, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendSchemeView1() //��˾ID��cid��������
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/view?cid=0&id=235";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendSchemeView2() //��˾ID��cid��������λ����
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/view?cid=-2&id=235";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendSchemeView3() //���ڷ���ID��id��������
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/view?cid=1&id=1";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendSchemeView4() //���ڷ���ID��id��������λ����
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/view?cid=1&id=-1";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }
}

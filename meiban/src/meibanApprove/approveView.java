package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveView {

    Common comm = new Common();

    @Test
    public void approveView() //���ݿ��д��ڵ�����
    {
        String url = "http://10.112.178.22/approve/view?approveId=134&companyId=6";
        //    String url="https://work.pre.gomeplus.com/approve/view?approveId=226";
        //	String token=comm.Get_mobile_access_token("17010000306", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveView1() //��ǰ�����Լ���˵����뵥ID
    {
        String url = "http://10.112.178.22/approve/view?approveId=77&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveView2() //���벻���ڵ����뵥ID
    {
        String url = "http://10.112.178.22/approve/view?approveId=300&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveView3() //���벻���ڵĹ�˾ID
    {
        String url = "http://10.112.178.22/approve/view?approveId=86&companyId=8";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

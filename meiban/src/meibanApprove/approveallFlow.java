package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveallFlow {
    Common comm = new Common();

    @Test
    public void approveallFlow()//���ݹ�˾ID��ѯȫ���ܸ��õ�������������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=1&status=1";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow1()//���ݹ�˾ID��ѯȫ���ܸ��õ�����������˾ID�����ڣ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=2&status=1";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow2()//���ݹ�˾ID��ѯȫ���ܸ��õ�����������˾IDΪ�գ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=&status=1";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow3()//���ݹ�˾ID��ѯȫ���ܸ��õ���������status=0��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=1&status=0";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow4()//���ݹ�˾ID��ѯȫ���ܸ��õ���������status=2��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=1&status=2";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow5()//���ݹ�˾ID��ѯȫ���ܸ��õ���������status<0��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=1&status=-1";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow6()//���ݹ�˾ID��ѯȫ���ܸ��õ���������status�����ڵ�ֵ��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=1&status=100";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveallFlow7()//���ݹ�˾ID��ѯȫ���ܸ��õ���������statusΪ�գ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/allFlow?companyId=1&status=";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }
}

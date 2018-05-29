package meibanApprove;

import org.testng.Assert;
import org.testng.annotations.Test;

import meibanCommon.Common;

public class approvelistByType//���ݹ�˾ID����������ID��ѯ�������б�
{
    Common comm = new Common();

    @Test
    public void approvelistByType()//���ݹ�˾ID����������ID��ѯ�������б� ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=50&status=1";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType1()//���ݹ�˾ID����������ID��ѯ�������б�companyid �����ڵ�ֵ��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=2&typeId=50&status=1";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType2()//���ݹ�˾ID����������ID��ѯ�������б�companyid Ϊ�գ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=&typeId=50&status=1";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType4()//���ݹ�˾ID����������ID��ѯ�������б�typeId��0��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=-1&status=1";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType5()//���ݹ�˾ID����������ID��ѯ�������б�typeId��0���ǹ涨��ֵ��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=100&status=1";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType6()//���ݹ�˾ID����������ID��ѯ�������б�typeId Ϊ�գ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=&status=1";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType7()//���ݹ�˾ID����������ID��ѯ�������б�status=0��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=49&status=0";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType8()//���ݹ�˾ID����������ID��ѯ�������б�status=2��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=51&status=2";
//		String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType9()//���ݹ�˾ID����������ID��ѯ�������б�status���ǹ涨��ֵ��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=51&status=3";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approvelistByType10()//���ݹ�˾ID����������ID��ѯ�������б�statusΪ�գ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/listByType?companyId=1&typeId=51&status=";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }
}
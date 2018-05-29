package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class deleteapprove {
    Common comm = new Common();

    @Test

    public void deleteapproveList1()//���ݹ�˾ID��flowerID ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/delete?flowId=92&companyId=1";
        //String token=comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test

    public void deleteapproveList2()//flowerID������ ��������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/delete?flowId=92222222&companyId=1";
        //String token=comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test

    public void deleteapproveList3()//��˾ID������ ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/delete?flowId=92&companyId=1122333";
        //String token=comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test

    public void deleteapproveList4()//flowerIDΪ�գ�������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/delete?flowId=&companyId=1";
        //String token=comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test

    public void deleteapproveList5()//companyIdΪ�գ�������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/delete?flowId=&companyId=1";
        //String token=comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

}

package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myFinishedTask {
    Common comm = new Common();

    @Test
    public void myFinishedTask1()//���������˲�ѯ����ɵ���������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/myFinishedTask?companyId=1";
        String token = comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "ae9f084b-068f-4cd5-bfd7-243d8a5943b8", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void myFinishedTask2()//���������˲�ѯ����ɵ�����companyId�����ڣ��쳣״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/myFinishedTask?companyId=111";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "ae9f084b-068f-4cd5-bfd7-243d8a5943b8", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }


}
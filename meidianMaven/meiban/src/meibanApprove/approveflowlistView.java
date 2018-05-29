package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveflowlistView //���������˲�ѯ����ɵ�����
{
    Common comm = new Common();

    @Test
    public void approveflowlistView1()//���������˲�ѯ����ɵ���������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/myFinishedTask?companyId=1";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }


}
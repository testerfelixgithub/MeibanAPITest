package meibanNotice;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class queryUserNoticeById {
    Common comm = new Common();

    @Test
    public void queryUserNoticeById()//Ա���鿴����ID������״̬��
    {
        String url = "https://work.pre.gomeplus.com/notice/queryUserNoticeById/778";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void queryUserNoticeById1()//Ա���鿴����ID��IDΪ�����ڵ�ֵ��
    {
        String url = "https://work.pre.gomeplus.com/notice/queryUserNoticeById/1";
//			String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        String result = comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }
}
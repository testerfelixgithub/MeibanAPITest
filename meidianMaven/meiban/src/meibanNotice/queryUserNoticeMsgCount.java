package meibanNotice;

import meibanCommon.Common;
import org.testng.Assert;//������� - Ա���鿴δ���������


import org.testng.annotations.Test;

public class queryUserNoticeMsgCount {
    Common comm = new Common();

    @Test
    public void count1() //������ڵ����ӵ�ַ
    {

        String url = "http://10.112.178.22/notice/queryUserNoticeMsgCount";
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

}

package meibanApprove;

import meibanCommon.Common;
import org.testng.annotations.Test;
import org.testng.Assert;//ɾ������

public class DeleteApprovergroup {
    Common comm = new Common();

    @Test

    public void deletegroup1()//���ݿ��д��ڵ�����
    {
        String url = "http://10.112.178.22/approve/setting/type/delete?typeId=75&companyId=6";
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void deletegroup2()//�����ڵĹ�˾id
    {
        String url = "http://10.112.178.22/approve/setting/type/delete?typeId=75&companyId=5";
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void deletegroup3()//�����ڵ�������ID
    {
        String url = "http://10.112.178.22/approve/setting/type/delete?typeId=70&companyId=6";
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }


}



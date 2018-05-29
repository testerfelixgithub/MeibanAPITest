package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveTypeAndFlowSort //�����������������
{

    Common comm = new Common();

    @Test
    public void typeSort()//�������������������������� ������״̬,���ڵ�ID��
    {
        String url = "http://10.112.178.22/approve/setting/type/sort?targetId=42&beforeId=46&afterId=48";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void typeSort1()//�������������������������� ����������λ�ò��ԣ�
    {
        String url = "http://10.112.178.22/approve/setting/type/sort?targetId=1&beforeId=46&afterId=48";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void FlowSort()//�������������������������� ������״̬,���ڵ�ID��
    {
        String url = "http://10.112.178.22/approve/setting/flow/sort?targetId=36&beforeId=67&afterId=37";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void FlowSort1()//�������������������������� ����������λ�ò��ԣ�
    {
        String url = "http://10.112.178.22/approve/setting/flow/sort?targetId=-1&beforeId=36&afterId=0";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approveTypeSort.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

}

package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveList //�����������б��ѯ
{
    Common comm = new Common();

    @Test
    public void List() //��ȡtypeID=0,�ݸ�������
    {

        String url = "http://10.112.178.22/approve/list?companyId=6&typeId=0&pageNo=1&pageSize=1";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);

    }

    @Test
    public void List1()//��ȡtypeID=1()���������������
    {

        String url = "http://10.112.178.22/approve/list?companyId=6&typeId=1&pageNo=1&pageSize=1";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);

    }

    @Test
    public void List2()//��ȡtypeID=2()�ѹ鵵��������
    {

        String url = "http://10.112.178.22/approve/list?companyId=6&typeId=2&pageNo=1&pageSize=1";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);

    }

    /* @Test
     public void List3()//��ȡtypeID������������
     {

               String url="http://10.112.178.22/approve/list?companyId=6&typeId=10&pageNo=1&pageSize=1";
               //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
               //System.out.println(token);
               String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
               String  message = comm.GetCode(result);
               Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

     }*/
    @Test
    public void List4()//pageNo��pageSizeС�ڵ���0
    {

        String url = "http://10.112.178.22/approve/list?companyId=6&typeId=2&pageNo=-1&pageSize=-1";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void List5()//��ȡtypeIDС��0
    {

        String url = "http://10.112.178.22/approve/list?companyId=6&typeId=-1&pageNo=0&pageSize=0";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void List6()//companyId������
    {

        String url = "http://10.112.178.22/approve/list?companyId=1&typeId=-1&pageNo=0&pageSize=0";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }
}

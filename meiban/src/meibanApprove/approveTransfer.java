package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveTransfer //ת������
{

    Common comm = new Common();

    @Test
    public void ApproveTransfer() //��ȷ����
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        String token = comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":98, \"assignNow\":4610, \"companyId\":6, \"opinion\":\"post\"}";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void ApproveTransfer1() //�����ڵ����뵥ID
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":0, \"assignNow\":6998, \"companyId\":6, \"opinion\":\"post\"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer2() //���뵥IDΪ��
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":, \"assignNow\":6998, \"companyId\":6, \"opinion\":\"post\"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer3() //assignNowΪ��
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":39, \"assignNow\":, \"companyId\":6, \"opinion\":\"post\"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer4() //assignNow������
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":39, \"assignNow\":1, \"companyId\":6, \"opinion\":\"post\"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
        //  Assert.assertnot
    }

    @Test
    public void ApproveTransfer5() //companyIdΪ��
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":39, \"assignNow\":6998, \"companyId\":, \"opinion\":\"post\"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer6() //companyId������
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":39, \"assignNow\":6998, \"companyId\":1, \"opinion\":\"post\"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer7() //opinionת���ʼ�����
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":39, \"assignNow\":6998, \"companyId\":6, \"opinion\":\" \"}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer8() //opinionת���ʼ�����
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":39, \"assignNow\":6998, \"companyId\":1, \"opinion\":}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void ApproveTransfer9() //�����Լ��Ķ�������û��Ȩ��
    {
        String url = "http://10.112.178.22/approve/approveTransfer";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{\"approveId\":119, \"assignNow\":6998, \"companyId\":1, \"opinion\":}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

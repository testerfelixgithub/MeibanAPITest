package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class doApproveTask { //�����͵�������
    Common comm = new Common();

    @Test
    public void doApproveTask() //��ȷ����(�����д�������)����
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "79," +
                "80" +
                "]," +
                "\"result\":true," +
                "\"opinion\":\"\"," +
                "\"reason\":\"\"," +
                "\"isSingle\":false" +
                "}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void doApproveTask2() //companyId ������
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"0\"," +
                "\"approveId\":[" +
                "28," +
                "29" +
                "]," +
                "\"result\":true," +
                "\"opinion\":\"\"," +
                "\"reason\":\"\"," +
                "\"isSingle\":false" +
                "}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void doApproveTask3() //approveId ������
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "0," +
                "1" +
                "]," +
                "\"result\":true," +
                "\"opinion\":\"\"," +
                "\"reason\":\"\"," +
                "\"isSingle\":false" +
                "}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void doApproveTask4() //�����ܾ� ���������ܾܾ������ط���
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "26," +
                "27" +
                "]," +
                "\"result\":false," +
                "\"opinion\":\"\"," +
                "\"reason\":\"\"," +
                "\"isSingle\":false" +
                "}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void doApproveTask5() //opinion��reason�ֶδ�������
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "79," +
                "80" +
                "]," +
                "\"result\":true," +
                "\"opinion\":\"test\"," +
                "\"reason\":\"test\"," +
                "\"isSingle\":false" +
                "}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void doApproveTask6() //��������ͬ��resultΪtrue,isSingleΪtrue //û��Ȩ������
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "79" +
                // "29"+
                "]," +
                "\"result\":true," +
                "\"opinion\":\"test\"," +
                "\"reason\":\"test\"," +
                "\"isSingle\":true" +
                "}";
        String result = comm.PostRequest(url, params, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void doApproveTask7() //���������ܾ� resultΪfalse,isSingleΪtrue,
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        String token = comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "121" +
                // "29"+
                "]," +
                "\"result\":false," +
                "\"opinion\":\"test\"," +
                "\"reason\":\"test\"," +
                "\"isSingle\":true" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void doApproveTask8() //��������ͬ��resultΪfalse,isSingleΪtrue,
    {
        String url = "http://10.112.178.22/approve/doApproveTask";
        String token = comm.Get_mobile_access_token("17010000975", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                " \"companyId\":\"6\"," +
                "\"approveId\":[" +
                "122" +
                // "29"+
                "]," +
                "\"result\":true," +
                "\"opinion\":\"test\"," +
                "\"reason\":\"test\"," +
                "\"isSingle\":true" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\doApproveTask.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }
}

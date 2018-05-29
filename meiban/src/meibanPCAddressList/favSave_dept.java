package meibanPCAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class favSave_dept {
    Common comm = new Common();

    @Test
    public void deleteDept() //��ɾ������� ��������
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/delete_dept?companyId=1&deptId=2";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

    @Test
    public void saveDept() //��������
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=1&deptId=2";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);

    }

    @Test
    public void saveDept0() //�Ѿ���ӹ��Ĺ�˾ID�Ͳ���ID
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=1&deptId=2";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void saveDept1() //�����ڵĹ�˾ID
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=10&deptId=2";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void saveDept2() //��˾IDλ����
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=-1&deptId=2";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void saveDept3() //��˾IDΪ null
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=&deptId=2";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void saveDept4() //����ID������
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=1&deptId=1000";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void saveDept5() //����IDΪ����
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=1&deptId=-1";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }

    @Test
    public void saveDept6() //����IDΪnull
    {

        String url = "https://work.pre.gomeplus.com/v1/fav/save_dept?companyId=1&deptId=";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "74909481-59b9-4ae8-9122-8dc133dcee90";
        //  String params="{\"companyId\":1,\"deptId\":2}";
        String result = comm.PostRequest(url, "", token, "E:\\saveDept.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);

    }
}

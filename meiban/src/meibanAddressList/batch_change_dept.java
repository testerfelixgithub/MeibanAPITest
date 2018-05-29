package meibanAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

//����������Ų�������
public class batch_change_dept {
    Common comm = new Common();

    @Test
    public void batch_change_dept1() //������ת����
    {
        String url = "http://10.112.178.22/admin/staff/batch_change_dept";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"deptId\":1610,\"deptStaffIds\":[\"7741\",\"7742\"]}";
        String result = comm.PostRequest(url, params, token, "E:\\batch_change_dept.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void batch_change_dept2() //��ת���Ų�����
    {
        String url = "http://10.112.178.22/admin/staff/batch_change_dept";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"deptId\":8889,\"deptStaffIds\":[\"7741\",\"7742\"]}";
        String result = comm.PostRequest(url, params, token, "E:\\batch_change_dept.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void batch_change_dept3() //ͬһ���ż�ְ
    {
        String url = "http://10.112.178.22/admin/staff/batch_change_dept";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"deptId\":1611,\"deptStaffIds\":[\"7742\"]}";
        String result = comm.PostRequest(url, params, token, "E:\\batch_change_dept.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void batch_change_dept4() //����id�ظ�
    {
        String url = "http://10.112.178.22/admin/staff/batch_change_dept";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"deptId\":1611,\"deptStaffIds\":[\"7741\",\"7742\"]}";
        String result = comm.PostRequest(url, params, token, "E:\\batch_change_dept.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}
package meibanAdminSetting;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferStaffAdmin {
    Common comm = new Common();

    @Test
    public void transferStaffAdmin() //��������ת��
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void transferStaffAdmin1() //��֤�벻��
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void transferStaffAdmin2() //����ԱIDΪ����
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void transferStaffAdmin3() //staffIdΪ����
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1234\",\"staffId\":\"\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void transferStaffAdmin4() //mobileΪ����
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"\",\"smsCaptcha\":\"2324\",\"adminId\":\"1234\",\"staffId\":\"1234\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void transferStaffAdmin5() //��֤��Ϊ����
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"13800000000\",\"smsCaptcha\":\"\",\"adminId\":\"1234\",\"staffId\":\"1234\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void transferStaffAdmin6() //staffIdΪĿǰ��AdminID��ת�Ƹ��Լ���
    {
        String url = "http://10.112.178.22/admin/setting/staff/transferStaffAdmin";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1234\",\"staffId\":\"1234\"}";
        String result = comm.PostRequest(url, params, token, "E:\\transferStaffAdmin.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

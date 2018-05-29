package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveTypeUpdate {  //�޸�������

    Common comm = new Common();

    @Test
    public void typeUpdate() {  //��������
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\": \"test\",\"companyId\": 6,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void typeUpdate1() {  //������ID������
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": -1,\"name\": \"test\",\"companyId\": 6,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeUpdate2() {  //������IDΪ��    ������
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\":,\"name\": \"test\",\"companyId\": 6,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeUpdate3() {  //�޸ĵ������������Ѵ���
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\": \"test1\",\"companyId\": 6,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeUpdate4() {  //�޸ĵ�����������Ϊ��   ������
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\":\"\",\"companyId\": 6,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeUpdate5() {  //��˾ID����  ��ʾNo permission
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\": \"test\",\"companyId\": 1,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeUpdate6() {  //��˾IDΪ��  ����11003
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\": \"test\",\"companyId\": ,\"status\": true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeUpdate7() {  //����״̬Ϊfalse  ����״̬Ϊfalse����ͣ��
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\": \"test\",\"companyId\": 6,\"status\": false}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void typeUpdate8() {  //����״̬Ϊ��
        String url = "http://10.112.178.22/approve/setting/type/update";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "66e287b5-4b8e-4c20-87d3-db01c8ef3fac";
        String params = "{\"id\": 49,\"name\": \"test\",\"companyId\": 6,\"status\": }";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

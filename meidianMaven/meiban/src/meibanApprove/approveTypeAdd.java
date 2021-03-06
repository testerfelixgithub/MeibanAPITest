package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveTypeAdd {  //�½�������

    Common comm = new Common();

    @Test
    public void typeAdd() {  //��������
        String url = "http://10.112.178.22/approve/setting/type/add";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"test19\",\"companyId\":6,\"status\":true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void typeAdd1() {  //�����������Ѵ���
        String url = "http://10.112.178.22/approve/setting/type/add";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"test1\",\"companyId\":6,\"status\":true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeAdd2() {  //����������Ϊ��
        String url = "http://10.112.178.22/approve/setting/type/add";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"\",\"companyId\":6,\"status\":true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeAdd3() {  //��˾ID����
        String url = "http://10.112.178.22/approve/setting/type/add";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"test1\",\"companyId\":1,\"status\":true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeAdd4() {  //��˾IDΪ��
        String url = "http://10.112.178.22/approve/setting/type/add";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"test1\",\"companyId\":,\"status\":true}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void typeAdd5() {  //����״̬Ϊfalse
        String url = "http://10.112.178.22/approve/setting/type/add";
	  /*String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
	  System.out.println(token);*/
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"test20\",\"companyId\":6,\"status\":false}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void typeAdd6() {  //����״̬Ϊ��
        String url = "http://10.112.178.22/approve/setting/type/add";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"name\":\"test21\",\"companyId\":6,\"status\":}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTypeAdd.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

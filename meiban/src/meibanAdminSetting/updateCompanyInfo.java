package meibanAdminSetting;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class updateCompanyInfo {
    Common comm = new Common();

    @Test
    public void updateCompanyInfo() //��������
    {
        String url = "http://10.112.178.22/admin/company/updateCompanyInfo";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"id\":\"6\",\"companyName\":\"2324\",\"scale\":\"1000\",\"industry\":\"hulianwang\",\"region\":\"beijign\"}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void updateCompanyInfo1() //��˾ID������
    {
        String url = "http://10.112.178.22/admin/company/updateCompanyInfo";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"id\":\"0\",\"companyName\":\"2324\",\"scale\":\"1000\",\"industry\":\"hulianwang\",\"region\":\"beijign\"}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void updateCompanyInfo2() //companyNameΪ����
    {
        String url = "http://10.112.178.22/admin/company/updateCompanyInfo";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"id\":\"6\",\"companyName\":\"2324\",\"scale\":\"1000\",\"industry\":\"hulianwang\",\"region\":\"beijign\"}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void updateCompanyInfo3() //companyName����20��
    {
        String url = "http://10.112.178.22/admin/company/updateCompanyInfo";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"id\":\"6\",\"companyName\":\"\",\"scale\":\"1000\",\"industry\":\"hulianwang\",\"region\":\"beijign\"}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

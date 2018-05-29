package meibanRole;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RoleSaveStaff {
    Common comm = new Common();

    @Test
    public void RoleSaveStaff() //��Ӷ����Ա
    {
        String url = "http://10.112.178.22/admin/role/saveStaff";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"roleId\":\"76\",\"staffIds\":[3587,3583]}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void RoleSaveStaff1() //��Ӳ����ڵ���Ա
    {
        String url = "http://10.112.178.22/admin/role/saveStaff";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"roleId\":\"76\",\"staffIds\":[0]}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void RoleSaveStaff2()//�����ԱΪ����
    {
        String url = "http://10.112.178.22/admin/role/saveStaff";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"roleId\":\"76\",\"staffIds\":[-1]}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void RoleSaveStaff3()//�����Ա�������ڵ��鲻����
    {
        String url = "http://10.112.178.22/admin/role/saveStaff";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"roleId\":\"0\",\"staffIds\":[3587]}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void RoleSaveStaff4()//����Ѵ��ڵ�Ա��ID//ǰ���������ƺ��û����֤
    {
        String url = "http://10.112.178.22/admin/role/saveStaff";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        String params = "{\"roleId\":\"76\",\"staffIds\":[3587]}";
        String result = comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
  /*
  @Test
  public void test()
  {
	  String url="http://10.112.178.22/attend/admin/monthStat/exportMonthStat";
//	  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
//	  System.out.println(token);
	  String token="c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
	  String params= "{" +
			  	"\"monthStat\":[],"+
				"\"beginDate\":1506700800000," +
				"\"endDate\":1506700800000," +
				"\"uid\":3," +
				"\"uname\":\"\"," +
				"\"deptId\":\"4\"," +
				"\"deptName\":\"\","+
				"\"month\":0,"+
				"\"cid\":6"+
				"}";
	  
	  String par="{"+
    "\"beginDate\": 1488297600000,"+
    "\"endDate\": 1490889600000,"+
    "\"month\": 1,"+
    "\"uid\": 101010,"+
    "\"uname\": \"user1\","+
    "\"deptId\": 1010,"+
    "\"deptName\": \"deptName1\""+
"}";
	  String result=comm.PostRequest(url, params, token, "E:\\saveStaff.txt");
	  String message = comm.GetCode(result);
	  Assert.assertEquals(comm.Get_Code(result), 0, message);
	//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
  }*/
  /*@Test
  public void test(){
	  for(int i=10;i<210;i++)
	  {
		  String aString=Integer.toString(i)+"@gomeplus.com";
		  String bstring=Integer.toString(i);
		    long mober=13700000000L+i;
		   String mob_=Long.toString(mober);
		  String depet="������������";
		  String aa="�߼����Կ�������ʦ";
		  String name="��������"+i;
		  comm.WirteFile("E:\\a6.txt", mob_);
	  }
}*/
}

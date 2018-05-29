package meidianMaven.meidianMaven;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mshopRebateTotalAmount {
	Common comm=new Common();
  @Test
  public void f() {
	//  String host=Host.getURL();
			  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/userIncome/mshopRebateTotalAmount?body={\"shopId\":2589}";
			//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
			//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
			//  System.out.println(token);
		    //    String params="{\"shopId\":2589}";
			      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkepyu33JxQkQNC8o6IBfDN0V%2BM4L35iLk4Z0a2gHttkrWL03khNwh%2FmQ%3D%3D7cfa610d6371fc26432a41222205a3cd";
				  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
				  String message = comm.GetCode(result);
				  Assert.assertEquals(comm.Get_Code(result), 200, message);
				//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
			//  System.out.println("fxztest");
  }
  
  @Test
  public void f1() //�����˺������˶���
  {
	//  String host=Host.getURL();
			      String url="http://rebate.mobile.atguat.com.cn/wap/rebate/userIncome/mshopRebateTotalAmount?body={\"shopId\":2589}";
			//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
			//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
			//  System.out.println(token);
		    //    String params="{\"shopId\":2589}";
			      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkepyu33JxQkQNC8o6IBfDN0V%2BM4L35iLk4Z0a2gHttkrWL03khNwh%2FmQ%3D%3D7cfa610d6371fc26432a41222205a3cd";
				  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
				  String message = comm.GetCode(result);
				  Assert.assertEquals(comm.Get_Code(result), 200, message);
				//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
			//  System.out.println("fxztest");
  }
  @Test
  public void f2() //shopID������
  {
	//  String host=Host.getURL();
			  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/userIncome/mshopRebateTotalAmount?body={\"shopId\":0}";
			//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
			//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
			//  System.out.println(token);
		    //    String params="{\"shopId\":2589}";
			      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkepyu33JxQkQNC8o6IBfDN0V%2BM4L35iLk4Z0a2gHttkrWL03khNwh%2FmQ%3D%3D7cfa610d6371fc26432a41222205a3cd";
				  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
				  String message = comm.GetCode(result);
				  Assert.assertEquals(comm.Get_Code(result), 200, message);
				//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
			//  System.out.println("fxztest");
  }
  @Test
  public void f3() //����shopID
  {
	//  String host=Host.getURL();
			  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/userIncome/mshopRebateTotalAmount?body={}";
			//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
			//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
			//  System.out.println(token);
		    //    String params="{\"shopId\":2589}";
			      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkepyu33JxQkQNC8o6IBfDN0V%2BM4L35iLk4Z0a2gHttkrWL03khNwh%2FmQ%3D%3D7cfa610d6371fc26432a41222205a3cd";
				  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
				  String message = comm.GetCode(result);
				//  Assert.assertEquals(comm.Get_Code(result), 200, message);
				  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
			//  System.out.println("fxztest");
  }
}

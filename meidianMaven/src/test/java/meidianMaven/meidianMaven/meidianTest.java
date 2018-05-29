package meidianMaven.meidianMaven;

import meibanCommon.Common;
//import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class meidianTest {
	Common comm=new Common();
//	Config Host=new Config();
 /* @Test
  public void fanli()//有待入账报错+已入账    13601018660
  {
	//  String host=Host.getURL();
	  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/income";
	//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
	//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
	//  System.out.println(token);
	//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
	      String SCN="SCN=Pc0jlCMLaagsLQ9nJW41%2FAmdeLBJvztKHjTV3svtxH%2BBDSsTew1yqE%2BFDj0FuikJd41zDgLjw7tGMg5dnpmCbYruCN5O%2F3L73XcUut79Y9QTgwKwcZZP8xoRrGRY4lGf2ba7f8919be0b35eea8a1b272ebdf69d";
		  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
		  String message = comm.GetCode(result);
		 Assert.assertEquals(comm.Get_Code(result), 200, message);
		//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
	//  System.out.println("fxztest");
	
  }*/
 
  @Test
  public void fanli1() //待入账报错  13601018663
  {
	  //String host=Host.getURL();
/*	  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/income";
	//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
	//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
	//  System.out.println(token);
	//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
	      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGke5nWVgZr%2B2OuyuljRwRNeeeAG0TxcyysUvI4Bq4P36uJrkO44ebKOGw%3D%3Df5d7df99485390c6956b01bc45f9118d";
		  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
		  String message = comm.GetCode(result);
		 Assert.assertEquals(comm.Get_Code(result), 200, message);
		//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);*/
	  System.out.println("fxztest");
	
  }
  /*
 @Test
  public void fanli2() //收益为0的 13552883580
  {
	//  String host=Host.getURL();
	  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/income";
	//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
	//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
	//  System.out.println(token);
	//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
	      String SCN="SCN=Pc0jlCMLaajDQeZljlFFxAtzWO%2FG87%2FSHjTV3svtxH9TsButJP9JNM3OqtDZiH7mEzp7ixwyAO3DzcjohkGt9lf7gDr%2BTpRY8ZlJUzyE7zh8%2BgWIJS9FZxoRrGRY4lGfe36ad156799bd2b3fc2dd728f3ed907f";
		  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
		  String message = comm.GetCode(result);
		 Assert.assertEquals(comm.Get_Code(result), 200, message);
		//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
	//  System.out.println("fxztest");
	
  }
  /*
  @Test
  public void fanli3() //只有已入账账值  13552883580   
  {
	//  String host=Host.getURL();
	  String url="http://rebate.mobile.atguat.com.cn/wap/rebate/income";
	//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
	//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
	//  System.out.println(token);
	//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
	      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkecXYlt4gDnYzeoFySGqoH39ln33PznxubB%2FJWEtU74cCL03khNwh%2FmQ%3D%3D73ab8cfa54242d2c33e3ed524f8ba6af";
		  String result=comm.PostRequest(url, "", SCN, "E:\\fanli.txt");
		  String message = comm.GetCode(result);
		 Assert.assertEquals(comm.Get_Code(result), 200, message);
		//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
	//  System.out.println("fxztest");
	
  }*/
  
 /* @Test
  public void fanli6() //只有已入账账值  13552883580   
  {
	//  String host=Host.getURL();
	   String url="http://apishopowner.uatplus.com/shopowner/shop/v1/create";
	//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
	//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
	//  System.out.println(token);
		  String params="{\"userId\":\"100041176703\",\"userName\":\"fuxiaozhen\",\"source\":\"101\"}";
	      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkesauqSHA0Z%2B50HReg2A4gMeVZ3uB8NW%2FI2FwkVA0MV6NkXS65qVQt0g%3D%3Db5a887b75052c3755b0299873a2f85f5";
		  String result=comm.PostRequest(url, params, SCN, "E:\\fanli.txt");
		  String message = comm.GetCode(result);
		 Assert.assertEquals(comm.Get_Code(result), 200, message);
		//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
	//  System.out.println("fxztest");
	
  }*/
}

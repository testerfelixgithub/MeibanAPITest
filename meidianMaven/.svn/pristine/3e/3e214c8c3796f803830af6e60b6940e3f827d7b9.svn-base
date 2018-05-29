package meidianMaven.meidianMaven;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;
public class meidianSelectRebate {
	Common comm=new Common();
	Config Host=new Config();
  @Test
  public void meidianSelectRebate() {
		
	//  String host=Host.getURL();
		  String url="http://apishopowner.uatplus.com/shopowner/amount/v1/selectRebate?userId=100041176703&shopId=2589&status=&pageNum=1&pageSize=10";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
		//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeaS8Ek9S2eRTAwtkWEi%2BaYJs8OYv%2FY0pLw2R2pR9nyK5qLEfK5pCPAA%3D%3D2e0b26a874a6a6f00e263412c0424ac0";
			  String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			 Assert.assertEquals(comm.Get_Code(result), 200, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
}


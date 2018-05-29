package meidianMaven.meidianMaven;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTest {
	Common comm=new Common();
	Config Host=new Config();
	@Test
	  public void createShop() {
		  String url="http://10.115.2.30:9100/task/invite/v1/getInviterInfo?inviteUserId=1111&taskId=136";
			//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
			//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
			//  System.out.println(token);
			//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
			      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeDinvox%2Fk%2F3domDnNEnwFXPN2CDr0SgEkgd7AYJql8WaM40BuuH4uaA%3D%3D8751d053bd2b72db8ddc56fe3289eaa3";
				  String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
				  String message = comm.GetCode(result);
				  Assert.assertEquals(comm.Get_Code(result), 0, message);
				//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
			//  System.out.println("fxztest");
	  }
	
  @Test
  public void getInviterInfo() {
	  String url="http://10.115.2.30:9100/task/invite/v1/getInviterInfo?inviteUserId=1111&taskId=18";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
		//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeDinvox%2Fk%2F3domDnNEnwFXPN2CDr0SgEkgd7AYJql8WaM40BuuH4uaA%3D%3D8751d053bd2b72db8ddc56fe3289eaa3";
			  String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
  
  @Test
  public void queryRewardStatus() //��ȡ�û��׵�����״̬
  {
	  String url="http://10.115.2.30:9100/task/firstReward/v1/queryRewardStatus?taskId=150&userId=100038941506";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
		//	  String params="{\"companyId\":6,\"staffId\":\"1\"}";
		      String SCN="SCN=Pc0jlCMLaaiqOaIcWz2pjq8s8BdmjUk6HjTV3svtxH%2BoTQ%2FDam%2FYzj4pRrxTdNOOzugoXHVFqvnSsPaf5TI5HxekfX8J88TnuNcuhgp4Lxa3uymBGm2T5RoRrGRY4lGf44f635f5e2222e4d03cf574026229c4a";
			  String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
  
  @Test
  public void getActivityReward() //�û������׵��
  {
	  String url="http://10.115.2.30:9100/task/firstReward/v1/getActivityReward?userId=13&taskId=150";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
			//  String params="{\"taskId\": 18}";
		      String SCN="SCN=Pc0jlCMLaaiqOaIcWz2pjq8s8BdmjUk6HjTV3svtxH%2BoTQ%2FDam%2FYzj4pRrxTdNOOzugoXHVFqvnSsPaf5TI5HxekfX8J88TnuNcuhgp4Lxa3uymBGm2T5RoRrGRY4lGf44f635f5e2222e4d03cf574026229c4a";
			  String result=comm.PostRequest(url, "", SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
  @Test
  public void inviteUrl() //��ת������ҳ�ӿ�
  {
	  String url="http://10.115.4.15:5555/task/path/v1/inviteUrl";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
			//  String params="{\"taskId\": 18}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeFRqlJDjcF9TQ4MR4nIcGuU59h2iUU6gbJnhHzeHJhxQsrGZNRzJRnw%3D%3D248d3e1243e7e499547eb2443f4b4011";
		      String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 200, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
  @Test
  public void getInvitingList() //��ȡ����ɽ�����������Ϣ�б�
  {
	  String url="http://10.115.4.15:5555/task/invite/v1/getInvitingList?taskId=18";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
			//  String params="{\"taskId\": 18}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeFRqlJDjcF9TQ4MR4nIcGuU59h2iUU6gbJnhHzeHJhxQsrGZNRzJRnw%3D%3D248d3e1243e7e499547eb2443f4b4011";
		      String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
  
  @Test
  public void getInvitedList() //��ȡ����ɽ�����������Ϣ�б�
  {
	  String url="http://10.115.4.15:5555/task/invite/v1/getInvitedList?taskId=18";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
			//  String params="{\"taskId\": 18}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeFRqlJDjcF9TQ4MR4nIcGuU59h2iUU6gbJnhHzeHJhxQsrGZNRzJRnw%3D%3D248d3e1243e7e499547eb2443f4b4011";
		      String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
  
  @Test
  public void getRewardList() //��ȡ��沥���б�
  {
	  String url="http://10.115.2.30:9100/task/invite/v1/getRewardList?taskId=121";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
			//  String params="{\"taskId\": 18}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeFRqlJDjcF9TQ4MR4nIcGuU59h2iUU6gbJnhHzeHJhxQsrGZNRzJRnw%3D%3D248d3e1243e7e499547eb2443f4b4011";
		      String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  } 
  
  @Test
  public void getUserInfo() //��ȡ��ǰ��¼�û���Ϣ
  {
	  String url="http://10.115.4.15:5555/task/user/v1/getUserInfo";
		//  String token="7d61c49d-4935-4cd9-801a-a4b9fddb53db";
		//  String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
		//  System.out.println(token);
			//  String params="{\"taskId\": 18}";
		      String SCN="SCN=Pc0jlCMLaahXcr23dZlHUOJA16SZ8Un4RZQK9TCVW%2BSi7%2FMlr3I3Z9zNGDYJRGkeFRqlJDjcF9TQ4MR4nIcGuU59h2iUU6gbJnhHzeHJhxQsrGZNRzJRnw%3D%3D248d3e1243e7e499547eb2443f4b4011";
		      String result=comm.GetRequest(url, SCN, "E:\\staffDetail1.txt");
			  String message = comm.GetCode(result);
			  Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
		//  System.out.println("fxztest");
  }
 
}

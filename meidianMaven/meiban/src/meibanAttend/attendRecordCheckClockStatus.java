package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attendRecordCheckClockStatus {
    Common comm = new Common();

    @Test
    public void CheckClockStatus() //������ֵ
    {

        String url = "http://10.112.178.22/attend/user/record/checkClockStatus";
        String token = comm.Get_mobile_access_token("13552883588", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"retroactive\":true," +
                "\"record\":{" +
                "\"uid\": 7261," +
                "\"deptId\": 1636," +
                "\"cid\": 63," +
                "\"clockDate\": 1511280000000," +
                "\"clockTime\": 1800000," +
                "\"clockCommute\": 1" +
                "}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "9822e497-3a44-4967-b7f7-b9d4410e237b", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }
/*  
  @Test
  public void CheckClockStatus2() //Cid������
  {

	  String url = "http://10.112.178.22/attend/user/record/checkClockStatus";
		//String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
		//System.out.println(token);
	  String par1="{" +
				 "\"srcFlag\": 2,"+
		  		 "\"record\":{"+
	             "\"uid\": 1,"+
	              "\"deptId\": 1,"+
	              "\"cid\": 1,"+
	              "\"clockDate\": 1488297600000,"+
	              "\"clockTime\": 1800000,"+
	              "\"clockType\": 2"+
	                "}}";
		//   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");
		   
		   String result=comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
		String message = comm.GetCode(result);
		//Assert.assertEquals(comm.Get_Code(result), 0, message);
		Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
  }
  
  @Test
  public void CheckClockStatus3() //uid������//"clockStatus":9 �������û�д򿨼�¼ ״̬��0
  {

	  String url = "http://10.112.178.22/attend/user/record/checkClockStatus";
		//String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
		//System.out.println(token);
	  String par1="{" +
				 "\"srcFlag\": 2,"+
		  		 "\"record\":{"+
	             "\"uid\":105566,"+
	              "\"deptId\": 1,"+
	              "\"cid\": 6,"+
	              "\"clockDate\": 1488297600000,"+
	              "\"clockTime\": 1800000,"+
	              "\"clockType\": 2"+
	                "}}";
		//   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");
		   
		   String result=comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
		String message = comm.GetCode(result);
	//	Assert.assertEquals(comm.Get_Code(result), 0, message);
		Assert.assertNotEquals(comm.Get_Code(result), 0, 501017,message);
  }
  
  @Test
  public void CheckClockStatus4() //uid������λ����//"clockStatus":9 �������û�д򿨼�¼ ״̬��0
  {

	  String url = "http://10.112.178.22/attend/user/record/checkClockStatus";
		//String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
		//System.out.println(token);
	  String par1="{" +
				 "\"srcFlag\": 2,"+
		  		 "\"record\":{"+
	             "\"uid\":-1,"+
	              "\"deptId\": 1,"+
	              "\"cid\": 6,"+
	              "\"clockDate\": 1488297600000,"+
	              "\"clockTime\": 1800000,"+
	              "\"clockType\": 2"+
	                "}}";
		//   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");
		   
		   String result=comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
		String message = comm.GetCode(result);
	//	Assert.assertEquals(comm.Get_Code(result), 0, message);
		Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
  }*/
}

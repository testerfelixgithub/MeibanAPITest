package meibanAttend;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import meibanCommon.Assertion;
import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AttendUserRecordAdd {
    Common comm = new Common();

    //Assertion assertion=new Assertion();
	/*  @Test
	  public void addAttend() {
		  String token="10dae0c2-7b09-439d-9170-a79a5097c045";
		  addAttend(token);
		//  listAtdRecord(token);
		//  initAtdAddress(token);
	  }
	  @Test
	  public void listAtdRecord() {
		  String token="10dae0c2-7b09-439d-9170-a79a5097c045";
		//  addAttend(token);
		  listAtdRecord(token);
		//  initAtdAddress(token);
	  }
	  @Test
	  public void initAtdAddress() {
		    String token="10dae0c2-7b09-439d-9170-a79a5097c045";
		//  addAttend(token);
		//  listAtdRecord(token);
		  initAtdAddress(token);
	  }
	    
	/*    @Parameters("test1")
	    @Test
	    public void ParaTest(String test1){
	        System.out.println("This is " + test1);
	    }*/
    @Test
    public void addAttend() //�������ݳ���
    {
        String urladd = "http://10.112.178.22/attend/user/record/add";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                " \"uid\": 7261," +
                " \"uname\":\"��С��\"," +
                "\"deptId\": 1636," +
                "\"deptName\": \"fxzfxz\"," +
                "\"cid\": 63," +
                "\"clockDate\": 1488297600000," +
                "\"clockTime\": \"12:03:05\"," +
                "\"clockStatus\": 2," +
                "\"clockType\": 0," +
                "\"clockCommute\": 2," +
                "\"dutyName\":\"1\"," +
                "\"clockAddressName\":\"1\"," +
                "\"phoneNum\":13222222222," +
                "\"phoneEquipmentNum\":111341412," +
                "\"phoneModel\":\"anzuo\"," +
                "\"phoneNetwork\":\"wifi\"}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(urladd, par1, "9822e497-3a44-4967-b7f7-b9d4410e237b", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  assertion.verifyEquals(1, 2,"buytong");
        //   Assert.assertEquals(1, 2,"MESSage");
    }

    @Test
    public void addAttend1() //uidΪ����
    {
        String urladd = "http://10.112.178.22/attend/user/record/add";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                " \"uid\": -1," +
                " \"uname\": \"fxz\"," +
                "\"deptId\": 1," +
                "\"deptName\": \"fxzfxz\"," +
                "\"cid\": 6," +
                "\"clockDate\": 1488297600000," +
                "\"clockTime\": \"12:03:05\"," +
                "\"clockStatus\": 0," +
                "\"clockType\": 2," +
                "\"clockCommute\": 6}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(urladd, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    //  assertion.verifyEquals(1, 2,"buytong");
    //   Assert.assertEquals(1, 2,"MESSage");
    //}
    @Test
    public void addAttend2() //cidΪ����������
    {
        String urladd = "http://10.112.178.22/attend/user/record/add";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                " \"uid\": -1," +
                " \"uname\": \"fxz\"," +
                "\"deptId\": 1," +
                "\"deptName\": \"fxzfxz\"," +
                "\"cid\": -6," +
                "\"clockDate\": 1488297600000," +
                "\"clockTime\": \"12:03:05\"," +
                "\"clockStatus\": 0," +
                "\"clockType\": 2," +
                "\"clockCommute\": 0}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(urladd, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    //  assertion.verifyEquals(1, 2,"buytong");
    //   Assert.assertEquals(1, 2,"MESSage");
    @Test
    public void addAttend3() //uid������
    {
        String urladd = "http://10.112.178.22/attend/user/record/add";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                " \"uid\": 5454," +
                " \"uname\": \"fxz\"," +
                "\"deptId\": 1," +
                "\"deptName\": \"fxzfxz\"," +
                "\"cid\": 6," +
                "\"clockDate\": 1488297600000," +
                "\"clockTime\": \"12:03:05\"," +
                "\"clockStatus\": 0," +
                "\"clockType\": 2," +
                "\"clockCommute\": 6}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(urladd, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

//  assertion.verifyEquals(1, 2,"buytong");
//   Assert.assertEquals(1, 2,"MESSage");
//}

	/*
	  public void listAtdRecord(String  token)
		{
			String url="https://work.pre.gomeplus.com/attend/user/record/listAtdRecord";
			String params="{\"srcFlag\":2,\"cid\": 1,\"month\": 201706,\"uid\":3,\"deptId\":4}";
			comm.PostRequest(url, params, token,"E:\\listAtdRecord.txt");
			 Assert.assertEquals(2, 2);
		}
		public void initAtdAddress(String token)
		{
			  String url2="https://work.pre.gomeplus.com/attend/user/record/initAtdAddress";
			  String par="{\"srcFlag\":2,\"record\":{\"cid\":1,\"clockDate\": 1496160000000,\"clockTime\": \"18:01:36\",\"deptId\":1,\"deptName\":\"1\",\"uid\":3952,\"uname\":\"1\"}}";
			  comm.PostRequest(url2, par, token,"E:\\token.txt");
			  Assert.assertEquals(2, 2);
		}*/
//}

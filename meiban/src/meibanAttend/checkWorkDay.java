package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class checkWorkDay {
    Common comm = new Common();

    @Test
    public void checkWorkDay() //�����ƶ��򿨿��ڳ��ڰ��ż��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void checkWorkDay1() //�����ƶ��򿨿��ڳ��ڰ��ż��srcFlag��0
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"-1\"," +   //srcFlag��0
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void checkWorkDay2() //�����ƶ��򿨿��ڳ��ڰ��ż��srcFlagΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        // String result=comm.GetRequest(url, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"\"," +   //srcFlagΪ��
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void checkWorkDay3() //�����ƶ��򿨿��ڳ��ڰ��ż��srcFlagΪ�����ڵ�ֵ
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1000000\"," +   //srcFlagΪ�����ڵ�ֵ
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";
        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
//	    Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void checkWorkDay4() //�����ƶ��򿨿��ڳ��ڰ��ż�� cid<0
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"-1\"," +   //cid<0
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//		Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay5() //�����ƶ��򿨿��ڳ��ڰ��ż�� cidΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//	    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"\"," +   //cidΪ��
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//		Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay6() //�����ƶ��򿨿��ڳ��ڰ��ż�� cidΪ�����ڵ�ֵ
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"8888\"," +   //cidΪ�����ڵ�ֵ
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//			Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay7() //�����ƶ��򿨿��ڳ��ڰ��ż�� clockDateΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": ," +  //clockDateΪ��
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//			Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay8() //�����ƶ��򿨿��ڳ��ڰ��ż�� clockDateΪ�Ƿ�ֵ
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000d," +   //clockDateΪ�����ڵ�ֵ
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//			Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay9() //�����ƶ��򿨿��ڳ��ڰ��ż�� clockDate��0
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": -1," +   //clockDate��0
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void checkWorkDay10() //�����ƶ��򿨿��ڳ��ڰ��ż�� clockTime��ʽ����ȷ
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:\"," +    //clockTime��ʽ����ȷ
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//			Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay11() //�����ƶ��򿨿��ڳ��ڰ��ż�� clockTimeΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"\"," +    //clockTimeΪ��
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";
        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//			Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay12() //�����ƶ��򿨿��ڳ��ڰ��ż�� clockTime��0
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
//		    System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"-1\"," +    //clockTime<0
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
//			Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay13() //�����ƶ��򿨿��ڳ��ڰ��ż�� uid<0
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        //String token=comm.Get_mobile_access_token("15901017165","MTIzLmdvbWU=");
        //System.out.println(token);
        //String result=comm.GetRequest(url,"f0f6181e-11a7-4878-94e2-d50bf023216a","E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"10:11:48\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"-11\"," +  //uid<0
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";
        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //  Assert.assertEquals(comm.Get_Code(result),0,message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay14() //�����ƶ��򿨿��ڳ��ڰ��ż��uidΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay15() //�����ƶ��򿨿��ڳ��ڰ��ż��uidΪ�Ƿ�ֵ
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"888888\"," +  //uidΪ�Ƿ�ֵ
                "\"uname\": \"11\"," +
                "\"deptId\": \"1336\"," +
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
    }

    /* @Test
      public void checkWorkDay16() //�����ƶ��򿨿��ڳ��ڰ��ż��unameΪ��
      {
          String url="http://10.112.178.22/attend/user/record/checkWorkDay";
         // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
           // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
          String params="{"+
        "\"srcFlag\": \"1\","+
        "\"record\": {"+
            "\"cid\": \"6\","+
            "\"clockTime\": \"11:40:28\","+
            "\"clockDate\": 1504800000000,"+
            "\"uid\": \"3502\","+
            "\"uname\": \"\","+     //unameΪ��
            "\"deptId\": \"1336\","+
            "\"deptName\": \"0803\""+
        "}"+
    "}";

            String result=comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
            String  message = comm.GetCode(result);
            //Assert.assertEquals(comm.Get_Code(result), 0, message);
             Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
      }*/
/*	 @Test
	  public void checkWorkDay17() //�����ƶ��򿨿��ڳ��ڰ��ż��unameΪ�����ַ�
	  {
		  String url="http://10.112.178.22/attend/user/record/checkWorkDay";
		 // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
	    //	System.out.println(token);
		   // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
		  String params="{"+
		"\"srcFlag\": \"1\","+
		"\"record\": {"+
			"\"cid\": \"6\","+
			"\"clockTime\": \"11:40:28\","+
			"\"clockDate\": 1504800000000,"+
			"\"uid\": \"3502\","+  
			"\"uname\": \"#��\","+     //unameΪ�����ַ�
			"\"deptId\": \"1336\","+
			"\"deptName\": \"0803\""+
		"}"+
	"}";
		    
		    String result=comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
		    String  message = comm.GetCode(result);
			//Assert.assertEquals(comm.Get_Code(result), 0, message);
			 Assert.assertNotEquals(comm.Get_Code(result),0,10500,message);
	  }*/
    @Test
    public void checkWorkDay18() //�����ƶ��򿨿��ڳ��ڰ��ż��deptidΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"\"," +  //deptidΪ��
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay19() //�����ƶ��򿨿��ڳ��ڰ��ż��deptid��0
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"-1\"," +  //deptid��0
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay20() //�����ƶ��򿨿��ڳ��ڰ��ż��deptidΪ�Ƿ�ֵ
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"888888\"," +  //deptidΪ�Ƿ�ֵ
                "\"deptName\": \"0803\"" +
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay21() //�����ƶ��򿨿��ڳ��ڰ��ż��deptnameΪ��
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1\"," +
                "\"deptName\": \"\"" +    //deptnameΪ��
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void checkWorkDay22() //�����ƶ��򿨿��ڳ��ڰ��ż��deptnameΪ�����ַ�
    {
        String url = "http://10.112.178.22/attend/user/record/checkWorkDay";
        // String token=comm.Get_mobile_access_token("15901017165", "MTIzLmdvbWU=");
        //	System.out.println(token);
        // String result=comm.GetRequest(url, "f0f6181e-11a7-4878-94e2-d50bf023216a", "E:\\approvelist.txt");
        String params = "{" +
                "\"srcFlag\": \"1\"," +
                "\"record\": {" +
                "\"cid\": \"6\"," +
                "\"clockTime\": \"11:40:28\"," +
                "\"clockDate\": 1504800000000," +
                "\"uid\": \"3502\"," +
                "\"uname\": \"11\"," +
                "\"deptId\": \"1\"," +
                "\"deptName\": \"##\"" +    //deptnameΪ�����ַ�
                "}" +
                "}";

        String result = comm.PostRequest(url, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

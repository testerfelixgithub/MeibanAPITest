package meibanChannel;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class channelQueryOne {
    Common comm = new Common();

    @Test

    public void QueryOne()//��������Ƶ�����쳣״̬�����в���Ƶ��

    {
		/*	String url="https://work.pre.gomeplus.com/admin/channel/create";
			String token=comm.Get_mobile_access_token("15910688057", "MTIzLmdvbWU=");
		   // System.out.println(token);
			String params= "{" +
					"\"name\": \"tanbin11\"," +
					"\"desc\": \"dessccc\"," +
					"\"adminId\": 433," +
					"\"attribute\": {" +
                        "\"privateOwn\": 0," +
						" \"offical\": 0," +
						"\"type\": 1" +
					"}," +
					"\"filterCond\": {" +
							" \"deptId\": \"1673\"" +
					"}," +
					"\"channellabel\": 0," +
					"\"companyId\": 1," +
					"\"specialStaffIds\": [433]" +
					"}";
			
			String result=comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
			String  message = comm.GetCode(result);
			Assert.assertEquals(comm.Get_Code(result), 0, message);
			//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);*/

    }
}
package meibanUserFindPassword;

import java.util.UUID;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserVerifySmsCaptcha {
    Common comm = new Common();
    String uuid = UUID.randomUUID().toString();
    //System.out.println(uuid);
/*	@Test
	 public void send_pic_captcha() 
	  {
		 // String uuid = UUID.randomUUID().toString(); 
		System.out.println(uuid);
		  String url="https://work.pre.gomeplus.com/v1/user/send_pic_captcha?uuid="+uuid;//a5778c74-ed0f-4a2e-8515-6c669a264580";
		  String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
//		  System.out.println(token);
		 // String token="c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
		 // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
		  String result=comm.GetRequest(url, token, "E:\\send_pic_captcha.txt");
		 // String message = comm.GetCode(result);
		//  Assert.assertEquals(comm.Get_Code(result), 0, message);
		//  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
	  }
	*/

    @Test
    public void send_sms_captcha() {

        // String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        String url = "https://work.pre.gomeplus.com/v1/user/send_sms_captcha?mobile=13552883581&picCaptcha=uww4&uuid=7e1f4e29-f3be-4bac-96be-e8417fbbc99e";//+uuid;//a5778c74-ed0f-4a2e-8515-6c669a264580";
        String token = comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
//		  System.out.println(token);
        // String token="c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\send_sms_captcha.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void UserVerifySmsCaptcha1()//����ʱ��//5dc002cd-0fb0-4046-aeea-f0a01f369d20
    {
        String uuid = UUID.randomUUID().toString();
        String url = "https://work.pre.gomeplus.com/v1/user/verify_sms_captcha?mobile=13552883581&picCaptcha=21ju&smsCaptcha=768743&uuid=5dc002cd-0fb0-4046-aeea-f0a01f369d20";//a5778c74-ed0f-4a2e-8515-6c669a264580";
        String token = comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
//	  System.out.println(token);
        // String token="c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\UserVerifySmsCaptcha.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void UserVerifySmsCaptcha2() //����Ķ�����֤��
    {
        String uuid = UUID.randomUUID().toString();
        String url = "https://work.pre.gomeplus.com/v1/user/verify_sms_captcha?mobile=13552883581&picCaptcha=cxzp&smsCaptcha=810684&uuid=" + uuid;//a5778c74-ed0f-4a2e-8515-6c669a264580";
        String token = comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
//	  System.out.println(token);
        // String token="c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\UserVerifySmsCaptcha.txt");
        String message = comm.GetCode(result);
        // Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void UserVerifySmsCaptcha3()//�����ͼƬ��֤��//5dc002cd-0fb0-4046-aeea-f0a01f369d20
    {
        String uuid = UUID.randomUUID().toString();
        String url = "https://work.pre.gomeplus.com/v1/user/verify_sms_captcha?mobile=13552883581&picCaptcha=21ju&smsCaptcha=768743&uuid=5dc002cd-0fb0-4046-aeea-f0a01f369d20";//a5778c74-ed0f-4a2e-8515-6c669a264580";
        String token = comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
//	  System.out.println(token);
        // String token="c81f1723-7b34-4a7c-84c8-4ecb58b3dc42";
        // String params="{\"mobile\":\"13800000000\",\"smsCaptcha\":\"2324\",\"adminId\":\"1000\",\"staffId\":\"hulianwang\"}";
        String result = comm.PostRequest(url, "", token, "E:\\UserVerifySmsCaptcha.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //  Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }
}

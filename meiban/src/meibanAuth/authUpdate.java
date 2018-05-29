package meibanAuth;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class authUpdate {

    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void update() {   // ְ��-�༭ְ�����������

        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":\"��Ʒ\"," +
                "\"authName\":\"chanpinzongjian\"," +
                "\"id\":\"1\"" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void update1() {   // ְ��-�༭ְ��ְ��id�����ڣ�

        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":\"��Ʒ\"," +
                "\"authName\":\"����\"," +
                "\"id\":\"111111\"" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update2() {   // ְ��-�༭ְ��ְ��idΪ�գ�

        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":\"��Ʒ\"," +
                "\"authName\":\"����\"," +
                "\"id\":" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update3() {   // ְ��-�༭ְ��ְ��id����20���ַ���

        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":\"��Ʒ\"," +
                "\"authName\":\"����\"," +
                "\"id\":\"11111222222222222221vvv\"" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update4() {   // ְ��-�༭ְ�񣨵�ǰְ���Ѵ��ڣ�


        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":\"��Ʒ\"," +
                "\"authName\":\"����\"," +
                "\"id\":\"1\"" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update5() {   // ְ��-�༭ְ��ְ������Ϊ�գ�

        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":," +
                "\"authName\":\"����\"," +
                "\"id\":\"1\"" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update6() {   // ְ��-�༭ְ��ְ����������100�֣�

        String host = Host.getURL();
        String url = host + "/admin/auth/update";
//		String url = "https://work.pre.gomeplus.com/admin/auth/update";
        String token = "2f3f37c4-6997-4746-826a-7171248faffc";
//		String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
//		System.out.println(token);
        //String aa=comm.Str_utf("�༭ְ��");
        String params = "{" +
                "\"authDesc\":\"����������������������������������������������������������������������톟�������������������������������������������������������������������\"," +
                "\"authName\":\"����\"," +
                "\"id\":\"1\"" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\authUpdate.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

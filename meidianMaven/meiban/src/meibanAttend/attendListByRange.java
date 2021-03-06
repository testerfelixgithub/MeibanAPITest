package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attendListByRange {
    Common comm = new Common();

    @Test
    public void attendListByRange() //deptID -1�����ѯ���в��ţ�clockStatus��-1 �����������
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": null," +
                "\"deptId\": \"-1\"," +
                "\"deptName\": null," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 3," +
                "\"clockStatus\": -1," +
                "\"cid\": \"6\"," +
                "\"page\": {" +
                "\"pageNo\": 1," +
                "\"pageSize\":2" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendListByRange1() //��ѯ�����ڵ�uname
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": \"fxz\"," +
                "\"deptId\": \"1\"," +
                "\"deptName\": 123," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 3," +
                "\"clockStatus\": -1," +
                "\"cid\": \"6\"," +
                "\"page\": {" +
                "\"pageNo\": 1," +
                "\"pageSize\":2" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendListByRange2() //��ѯ�����ڵ�deptId
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": null," +
                "\"deptId\": \"\"," +
                "\"deptName\": 123," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 3," +
                "\"clockStatus\": -1," +
                "\"cid\": \"6\"," +
                "\"page\": {" +
                "\"pageNo\": 1," +
                "\"pageSize\":2" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendListByRange3() //��ѯ�����ڵ�cidΪ����
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": null," +
                "\"deptId\": \"100000\"," +
                "\"deptName\": 123," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 3," +
                "\"clockStatus\": -1," +
                "\"cid\": \"-1\"," +
                "\"page\": {" +
                "\"pageNo\": 1," +
                "\"pageSize\":2" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendListByRange4() //cidΪnull
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": null," +
                "\"deptId\": \"100000\"," +
                "\"deptName\": 123," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 3," +
                "\"clockStatus\": -1," +
                "\"cid\":null," +
                "\"page\": {" +
                "\"pageNo\": 1," +
                "\"pageSize\":2" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendListByRange5() //pageNo ĩҳ
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": null," +
                "\"deptId\": \"100000\"," +
                "\"deptName\": 123," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 3," +
                "\"clockStatus\": -1," +
                "\"cid\":6," +
                "\"page\": {" +
                "\"pageNo\": 11," +
                "\"pageSize\":1" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendListByRange6() //dateType ��֤
    {
        String url = "http://10.112.178.22/attend/admin/dayStat/listByRange";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String par1 = "{" +
                "\"uname\": null," +
                "\"deptId\": \"100000\"," +
                "\"deptName\": 123," +
                "\"beginDate\": \"0\"," +
                "\"endDate\": \"0\"," +
                "\"dateType\": 1," +
                "\"clockStatus\": -1," +
                "\"cid\":6," +
                "\"page\": {" +
                "\"pageNo\": 11," +
                "\"pageSize\":20" +
                "}" +
                "}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }
}

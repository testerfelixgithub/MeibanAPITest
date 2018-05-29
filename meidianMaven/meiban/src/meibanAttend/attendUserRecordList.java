package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attendUserRecordList {
    Common comm = new Common();

    @Test
    public void attendUserRecordList() //��������
    {
        String url = "http://10.112.178.22/attend/user/record/list";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                "\"uid\": 7261," +
                "\"deptId\": 1636," +
                "\"cid\": 63," +
                "\"clockDate\": 1511280000000" +
                "}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "9822e497-3a44-4967-b7f7-b9d4410e237b", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void attendUserRecordList1() //cid������
    {
        String url = "http://10.112.178.22/attend/user/record/list";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                "\"uid\": 1," +
                "\"deptId\": 1," +
                "\"cid\": -1," +
                "\"clockDate\": 1488297600000" +
                "}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendUserRecordList2() //uid������//dataΪNULl
    {
        String url = "http://10.112.178.22/attend/user/record/list";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                "\"uid\": 10000," +
                "\"deptId\": 1," +
                "\"cid\": 6," +
                "\"clockDate\": 1488297600000" +
                "}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendUserRecordList3() //uid������Ϊ����
    {
        String url = "http://10.112.178.22/attend/user/record/list";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                "\"uid\": -1," +
                "\"deptId\": 1," +
                "\"cid\": 6," +
                "\"clockDate\": 1488297600000" +
                "}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendUserRecordList4() //clockDate����
    {
        String url = "http://10.112.178.22/attend/user/record/list";
        String par1 = "{" +
                "\"srcFlag\": 2," +
                "\"record\":{" +
                "\"uid\": 1," +
                "\"deptId\": 1," +
                "\"cid\": 6," +
                "\"clockDate\": " +
                "}}";
        //   comm.PostRequest(urladd, par1,"1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\addAttend.txt");

        String result = comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\addAttend.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

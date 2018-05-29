package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attendListAtdRecord {
    Common comm = new Common();

    @Test
    public void attendListAtdRecord() //������ֵ����
    {
        String url2 = "http://10.112.178.22/attend/user/record/listAtdRecord";
        String params = "{\"srcFlag\":2,\"cid\": 63,\"month\": 201711,\"uid\":7261,\"deptId\":1636}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, params, "9822e497-3a44-4967-b7f7-b9d4410e237b", "E:\\initAtdAddress.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void attendListAtdRecord1() //Cid������
    {
        String url2 = "http://10.112.178.22/attend/user/record/listAtdRecord";
        String params = "{\"srcFlag\":2,\"cid\": 1,\"month\": 201706,\"uid\":1,\"deptId\":4}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\initAtdAddress.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendListAtdRecord2() //Uid������
    {
        String url2 = "http://10.112.178.22/attend/user/record/listAtdRecord";
        String params = "{\"srcFlag\":2,\"cid\": 6,\"month\": 201706,\"uid\":-1,\"deptId\":4}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\initAtdAddress.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendListAtdRecord3() //Uid������
    {
        String url2 = "http://10.112.178.22/attend/user/record/listAtdRecord";
        String params = "{\"srcFlag\":2,\"cid\": 6,\"month\": 201706,\"uid\":4545,\"deptId\":4}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, params, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\initAtdAddress.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRecordInitAtdAddress {
    Common comm = new Common();

    @Test
    public void UserRecordInitAtdAddress() //�������ݳ���
    {

        String url2 = "http://10.112.178.22/attend/user/record/initAtdAddress";
        String par = "{\"srcFlag\":2,\"record\":{\"cid\":1,\"clockDate\": 1496160000000,\"clockTime\": \"18:01:36\",\"deptId\":1,\"deptName\":\"1\",\"uid\":3952,\"uname\":\"1\"}}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, par, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\initAtdAddress1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void UserRecordInitAtdAddress1() //��˾cid������
    {

        String url2 = "http://10.112.178.22/attend/user/record/initAtdAddress";
        String par = "{\"srcFlag\":2,\"record\":{\"cid\":6,\"clockDate\": 1496160000000,\"clockTime\": \"18:01:36\",\"deptId\":1,\"deptName\":\"1\",\"uid\":3952,\"uname\":\"1\"}}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, par, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\initAtdAddress1.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void UserRecordInitAtdAddress2() //Uid������
    {

        String url2 = "http://10.112.178.22/attend/user/record/initAtdAddress";
        String par = "{\"srcFlag\":2,\"record\":{\"cid\":1,\"clockDate\": 1496160000000,\"clockTime\": \"18:01:36\",\"deptId\":1,\"deptName\":\"1\",\"uid\":-1,\"uname\":\"1\"}}";
        //  comm.PostRequest(url2, par, "1974662b-1be9-4293-83c8-f4d743d8c1ea","E:\\UserRecordInitAtdAddress.txt");
        // Assert.assertEquals(2, 2);
        String result = comm.PostRequest(url2, par, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\initAtdAddress1.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

}

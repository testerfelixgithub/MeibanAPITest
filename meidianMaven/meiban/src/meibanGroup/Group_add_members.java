package meibanGroup;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group_add_members {
    Common comm = new Common();

    @Test
    public void Group_add_members() {
        String url = "http://10.112.178.22/social/v1/group/add_members";
        String par1 = "{\"groupId\":\"7cea272a02474607ab562a8ab035a924\"," +
                "\"memberIds\":\"1039\"}";
        String result = comm.PostRequest(url, par1, "c81f1723-7b34-4a7c-84c8-4ecb58b3dc42", "E:\\dissolve_group1.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }
}

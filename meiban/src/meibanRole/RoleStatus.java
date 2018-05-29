package meibanRole;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RoleStatus {
    Common comm = new Common();

    @Test
    public void deleteRole() //ɾ�����ڵ�IDS
    {
        String url = "http://10.112.178.22/admin/role/status?ids=81";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\deleteRole.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //	Assert.assertEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void deleteRole1() //ɾ��������IDS
    {
        String url = "http://10.112.178.22/admin/role/status?ids=77";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\deleteRole.txt");
        String message = comm.GetCode(result);
        //   Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void deleteRole2() //IDS����
    {
        String url = "http://10.112.178.22/admin/role/status?ids=";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\deleteRole.txt");
        String message = comm.GetCode(result);
        //   Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void deleteRole3() //IDSλ����
    {
        String url = "http://10.112.178.22/admin/role/status?ids=-1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\deleteRole.txt");
        String message = comm.GetCode(result);
        //   Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

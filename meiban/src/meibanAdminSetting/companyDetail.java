package meibanAdminSetting;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class companyDetail {
    Common comm = new Common();

    @Test
    public void companydetail() {
        String url = "http://10.112.178.22/admin/setting/company/detail";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //	Assert.assertEquals(comm.Get_Code(result), 0,10500, message);
    }
}

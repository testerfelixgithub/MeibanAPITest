package meibanAddressList;

import meibanCommon.Common;
import meibanCommon.Config;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ImportStaff {
    Common comm = new Common();
    Config Host = new Config();

    @Test
    public void importStaff() {

        String host = Host.getURL();
        String url = host + "/admin/staff/importStaff";
        //  String url="https://work.pre.gomeplus.com/admin/staff/importStaff";
        //  String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //  System.out.println(token);
        String token = "5f37e9ec-8b8e-479e-bf40-e37ed2cc6b6c";
        //  String params="{\"name\":\"test19\",\"companyId\":6,\"status\":true}";
        String result = comm.PostFileRequest(url, "D://templete.xlsx", token, "E:\\importStaff3.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }
}

package meibanNotice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class noticeQueryNoticeById {

    Common comm = new Common();

    @Test
    public void queryNoticeById() { // �������-����Ա�鿴������ϸ  ID����
        String url = "https://work.pre.gomeplus.com/notice/admin/queryNoticeById/904";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "e0475be6-e8dc-40bd-8708-cae0eebbf44e", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void queryNoticeById1() { // �������-����Ա�鿴������ϸ  ID������
        String url = "https://work.pre.gomeplus.com/notice/admin/queryNoticeById/1";
        //String token=comm.Get_mobile_access_token("13521145233", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "e0475be6-e8dc-40bd-8708-cae0eebbf44e", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

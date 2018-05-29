package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hasAtdArrange {

    Common comm = new Common();

    @Test

    public void hasAtdArrange1()// ���ڷ������ż�� ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/hasAtdArrange";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{\"cid\":1,\"dept\":[1],\"staff\":[]} ";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test

    public void hasAtdArrange2()// ���ڷ������ż�� ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/hasAtdArrange";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{\"cid\":1,\"dept\":[1],\"staff\":[]} ";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test

    public void hasAtdArrange3()// ���ڷ������ż�鲿��ID ���쳣״̬��
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/hasAtdArrange";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{\"cid\":1,\"dept\":[23],\"staff\":[]} ";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }


}

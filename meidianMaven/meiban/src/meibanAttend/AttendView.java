package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttendView {

    Common comm = new Common();

    @Test
    public void AttendView() //���ڷ���һ��
    {

        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/list?cid=1&pageNo=1&pageSize=10";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);

    }

    @Test
    public void AttendView1() //���ڷ���һ��(�쳣�����
    {

        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/list?cid=11&pageNo=1&pageSize=10";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);

    }

    @Test
    public void AttendView2() //CIDΪ��(�쳣�����
    {

        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/list?cid=11&pageNo=1&pageSize=10";
        //String token=comm.Get_mobile_access_token("17010001027", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "551a8985-dad3-45df-924d-5f37cc6a706d", "E:\\approvelist.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);

    }

}

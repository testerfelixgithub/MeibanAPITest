package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class statByRange {
    Common comm = new Common();

    @Test

    public void statByRange1()//����ͳ�ư�ʱ���������ѯ ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/monthStat/statByRange";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{" +
                "\"beginDate\":1504195200000," +
                "\"endDate\":1506700800000," +
                "\"uname\":null," +
                "\"deptId\":\"-1\"," +
                "\"deptName\":null," +
                "\"cid\":\"1\"," +
                "\"page\":{" +
                "\"pageNo\":1," +
                "\"pageSize\":20," +
                "\"totalPage\":12}}";
        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

}

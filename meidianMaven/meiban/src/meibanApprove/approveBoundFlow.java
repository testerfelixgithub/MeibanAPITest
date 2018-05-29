package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveBoundFlow {

    Common comm = new Common();

    @Test
    public void boundFlow() {  //������-��ѯ�Ѱ󶨵����̺�δ�󶨵����� ������״̬��

        String url = "https://work.pre.gomeplus.com/approve/setting/type/boundFlow?typeId=50&companyId=1";
        String result = comm.GetRequest(url, "e0475be6-e8dc-40bd-8708-cae0eebbf44e", "E:\\approve.txt");

        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void boundFlow1() {  //������-��ѯ�Ѱ󶨵����̺�δ�󶨵����� �������鲻���ڣ���˾Id���ڣ�

        String url = "https://work.pre.gomeplus.com/approve/setting/type/boundFlow?typeId=-1&companyId=1";
        String result = comm.GetRequest(url, "e0475be6-e8dc-40bd-8708-cae0eebbf44e", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void boundFlow2() {  //������-��ѯ�Ѱ󶨵����̺�δ�󶨵����� ����������ڣ���˾Id�����ڣ�

        String url = "https://work.pre.gomeplus.com/approve/setting/type/boundFlow?typeId=50&companyId=2";
        String result = comm.GetRequest(url, "e0475be6-e8dc-40bd-8708-cae0eebbf44e", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void boundFlow3() {  //������-��ѯ�Ѱ󶨵����̺�δ�󶨵����� �������鲻���ڣ���˾Id�����ڣ�

        String url = "https://work.pre.gomeplus.com/approve/setting/type/boundFlow?typeId=-1&companyId=2";
        String result = comm.GetRequest(url, "e0475be6-e8dc-40bd-8708-cae0eebbf44e", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

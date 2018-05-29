package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class addApprove //���������
{
    Common comm = new Common();

    @Test

    public void addApproveList1()//��������� ������״̬��
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/add";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{ \"companyId\": 1, " +
                "\"typeId\": 52," +
                " \"procdefId\": \"\"," +
                " \"name\": \"test1231\", " +
                "\"icon\": \"cjlccs\"," +
                " \"status\": false, " +
                "\"form\": { \"elements\": [ { \"title\": \"one11\"," +
                " \"placeholder\": \"this is example112\", " +
                "\"isMust\": 1, " +
                "\"format\": \"\", " +
                "\"orderCode\": 1, " +
                "\"typeName\": \"checkbox1\", " +
                "\"elementId\": 4, " +
                "\"formElementCode\": \"dygys\", " +
                "\"elementRule\": \"\", \"extra1\": \"\", " +
                "\"items\": [ { \"item\": \"true\"," +
                " \"rule\": \"\" }, " +
                "{ \"item\": \"flase\"," +
                " \"rule\": \"\" } ] } ] } }";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test

    public void addApproveList2()//��������� ���쳣״̬��companyId�����ڣ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/add";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{ \"companyId\": 93, " +
                "\"typeId\": 52," +
                " \"procdefId\": \"\"," +
                " \"name\": \"test1\", " +
                "\"icon\": \"cjlccs\"," +
                " \"status\": false, " +
                "\"form\": { \"elements\": [ { \"title\": \"one\"," +
                " \"placeholder\": \"this is example\", " +
                "\"isMust\": 1, " +
                "\"format\": \"\", " +
                "\"orderCode\": 1, " +
                "\"typeName\": \"checkbox\", " +
                "\"elementId\": 4, " +
                "\"formElementCode\": \"dygys\", " +
                "\"elementRule\": \"\", \"extra1\": \"\", " +
                "\"items\": [ { \"item\": \"true\"," +
                " \"rule\": \"\" }, " +
                "{ \"item\": \"flase\"," +
                " \"rule\": \"\" } ] } ] } }";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test

    public void addApproveList3()//��������� ���쳣״̬���û����Ѵ��ڣ�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/add";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{ \"companyId\": 1, " +
                "\"typeId\": 52," +
                " \"procdefId\": \"\"," +
                " \"name\": \"test1\", " +
                "\"icon\": \"cjlccs\"," +
                " \"status\": false, " +
                "\"form\": { \"elements\": [ { \"title\": \"one\"," +
                " \"placeholder\": \"this is example\", " +
                "\"isMust\": 1, " +
                "\"format\": \"\", " +
                "\"orderCode\": 1, " +
                "\"typeName\": \"checkbox\", " +
                "\"elementId\": 4, " +
                "\"formElementCode\": \"dygys\", " +
                "\"elementRule\": \"\", \"extra1\": \"\", " +
                "\"items\": [ { \"item\": \"true\"," +
                " \"rule\": \"\" }, " +
                "{ \"item\": \"flase\"," +
                " \"rule\": \"\" } ] } ] } }";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test

    public void addApproveList4()//��������� ���쳣״̬���û�������20���ַ���
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/add";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{ \"companyId\": 1, " +
                "\"typeId\": 52," +
                " \"procdefId\": \"\"," +
                " \"name\": \"test11111111111111111111111111111111111112233454564\", " +
                "\"icon\": \"cjlccs\"," +
                " \"status\": false, " +
                "\"form\": { \"elements\": [ { \"title\": \"one\"," +
                " \"placeholder\": \"this is example\", " +
                "\"isMust\": 1, " +
                "\"format\": \"\", " +
                "\"orderCode\": 1, " +
                "\"typeName\": \"checkbox\", " +
                "\"elementId\": 4, " +
                "\"formElementCode\": \"dygys\", " +
                "\"elementRule\": \"\", \"extra1\": \"\", " +
                "\"items\": [ { \"item\": \"true\"," +
                " \"rule\": \"\" }, " +
                "{ \"item\": \"flase\"," +
                " \"rule\": \"\" } ] } ] } }";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test

    public void addApproveList5()//��������� ���쳣״̬���û���20���ַ���
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/add";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{ \"companyId\": 1, " +
                "\"typeId\": 52," +
                " \"procdefId\": \"\"," +
                " \"name\": \"11111111111111111111\", " +
                "\"icon\": \"cjlccs\"," +
                " \"status\": false, " +
                "\"form\": { \"elements\": [ { \"title\": \"one\"," +
                " \"placeholder\": \"this is example\", " +
                "\"isMust\": 1, " +
                "\"format\": \"\", " +
                "\"orderCode\": 1, " +
                "\"typeName\": \"checkbox\", " +
                "\"elementId\": 4, " +
                "\"formElementCode\": \"dygys\", " +
                "\"elementRule\": \"\", \"extra1\": \"\", " +
                "\"items\": [ { \"item\": \"true\"," +
                " \"rule\": \"\" }, " +
                "{ \"item\": \"flase\"," +
                " \"rule\": \"\" } ] } ] } }";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }


    @Test

    public void addApproveList6()//��������� ������״̬��״̬Ϊ���ã�
    {
        String url = "https://work.pre.gomeplus.com/approve/setting/flow/add";
        String token = comm.Get_mobile_access_token("15910688056", "MTIzLmdvbWU=");
        // System.out.println(token);
        String params = "{ \"companyId\": 1, " +
                "\"typeId\": 52," +
                " \"procdefId\": \"\"," +
                " \"name\": \"222222212233\", " +
                "\"icon\": \"cjlccs\"," +
                " \"status\": true, " +
                "\"form\": { \"elements\": [ { \"title\": \"one\"," +
                " \"placeholder\": \"this is example\", " +
                "\"isMust\": 1, " +
                "\"format\": \"\", " +
                "\"orderCode\": 1, " +
                "\"typeName\": \"checkbox\", " +
                "\"elementId\": 4, " +
                "\"formElementCode\": \"dygys\", " +
                "\"elementRule\": \"\", \"extra1\": \"\", " +
                "\"items\": [ { \"item\": \"true\"," +
                " \"rule\": \"\" }, " +
                "{ \"item\": \"flase\"," +
                " \"rule\": \"\" } ] } ] } }";

        String result = comm.PostRequest(url, params, token, "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }


}

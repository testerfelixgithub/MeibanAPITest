package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveFlowList //���ݹ�˾ID��ʹ��״̬��ѯ�����б�
{
    Common comm = new Common();

    @Test
    public void flowList()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ������״̬��
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=6&status=2&pageNo=1&pageSize=1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void flowList1()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ��companyid �����ڣ�
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=2&status=2&pageNo=1&pageSize=1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void flowList2()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ��status=0��
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=6&status=0";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void flowList3()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ��status=1��
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=6&status=1&pageNo=-1&pageSize=-1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void flowList4()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ��status=1��
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=6&status=1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void flowList5()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ��status<0��
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=6&status=-1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void flowList6()//���ݹ�˾ID��ʹ��״̬��ѯ�����б� ��status>0���ǹ涨����ֵ��
    {
        String url = "http://10.112.178.22/approve/setting/flow/flowList?companyId=6&status=11";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //	System.out.println(token);
        String result = comm.GetRequest(url, "d510c6be-c9b3-4ad4-bd87-573e13992b99", "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

//  @Test
 /* public void update() {
	  String token="10dae0c2-7b09-439d-9170-a79a5097c045";
	  String URL="https://work.pre.gomeplus.com/approve/setting/flow/update";
	  String Param="{"+
     "\"id\": 54,"+
    "\"companyId\": 1,"+
    "\"typeId\": 52,"+
    "\"procdefId\": \"\","+
    "\"name\": \"�������̲���11\","+
    "\"icon\":\"cjlccs\"," +
    "\"status\": false,"+
    "\"form\": {"+
       "\"id\": 224,"+
        "\"elements\": ["+
            "{"+
                "\"id\": 222,"+
                "\"formId\": 224,"+
                "\"title\": \"��һ��Ԫ��\","+
                "\"placeholder\": \"��ֻ�Ǹ��򵥵Ĳ��Թ��ܶ��ѡ�����\","+
                "\"isMust\": 1,"+
                "\"format\": \"\","+
                "\"orderCode\": 1,"+
                "\"typeName\": \"checkbox\","+
                "\"elementId\": 4,"+
                "\"formElementCode\": \"dygys\","+
                "\"elementRule\": \"\","+
                "\"extra1\": \"\","+
                "\"items\": ["+
                    "{"+
                        "\"id\": 333,"+
                        "\"formElementId\": 222,"+
                        "\"item\": \"���\","+
                        "\"rule\": \"\""+
                    "},"+
                    "{"+
                        "\"id\": 334,"+
                        "\"formElementId\": 222,"+
                       "\"item\": \"�ٵ�\","+
                        "\"rule\": \"\""+
                    "}"+
                "]"+
            "}"+
        "]"+
    "}"+
"}";
	String result= comm.PostRequest(URL, Param, token, "E:\\approve.txt");
	String  message = comm.GetCode(result);
	Assert.assertEquals(comm.Get_Code(result), 0, message);
  }*/
}

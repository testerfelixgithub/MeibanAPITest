package meibanApprove;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class approveFlowUpdate {
    Common comm = new Common();

    @Test
    public void update() //������ȫ��ȷ
    {
        String token = "d510c6be-c9b3-4ad4-bd87-573e13992b99";
        String URL = "http://10.112.178.22/approve/setting/flow/update";
        String Param = "{" +
                "\"id\":50," +
                "\"companyId\":6," +
                "\"typeId\":49," +
                "\"procdefId\":\"process-6-6-1503887166456\"," +
                "\"name\":\"approve5\"," +
                "\"icon\":\"icon-1\"," +
                "\"status\":true," +
                "\"form\":{" +
                "\"id\":219," +
                "\"elements\":[" +
                "{" +
                "\"id\":13843," +
                "\"formId\":219," +
                "\"title\":\"rodel\"," +
                "\"placeholder\":\"in\"," +
                "\"isMust\":0," +
                "\"format\":\"yyyy-MM-dd\"," +
                "\"orderCode\":1," +
                "\"typeName\":\"checkbox\"," +
                "\"elementId\":4," +
                "\"formElementCode\":\"\"," +
                "\"elementRule\":\"\"," +
                "\"extra1\":\"\"," +
                "\"items\":[" +
                "{" +
                "\"id\":30," +
                "\"formElementId\":13843," +
                "\"item\":\"zhen\"," +
                "\"rule\":\"\"" +
                "}," +
                "{" +
                "\"id\":31," +
                "\"formElementId\":13843," +
                "\"item\":\"jia\"," +
                "\"rule\":\"\"" +
                "}" +
                "]" +
                "}" +
                "]" +
                "}" +
                "}";
        String result = comm.PostRequest(URL, Param, token, "E:\\approve.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void update1() //�޸���������Ϊ�������Ƿ���ʾ��ȷ
    {
        String token = "d510c6be-c9b3-4ad4-bd87-573e13992b99";
        String URL = "http://10.112.178.22/approve/setting/flow/update";
        String Param = "{" +
                "\"id\":50," +
                "\"companyId\":6," +
                "\"typeId\":49," +
                "\"procdefId\":\"process-6-6-1503887166456\"," +
                "\"name\":\"approve3\"," +
                "\"icon\":\"icon-4\"," +
                "\"status\":true," +
                "\"form\":{" +
                "\"id\":219," +
                "\"elements\":[" +
                "{" +
                "\"id\":13843," +
                "\"formId\":219," +
                "\"title\":\"rodel\"," +
                "\"placeholder\":\"in\"," +
                "\"isMust\":0," +
                "\"format\":\"yyyy-MM-dd\"," +
                "\"orderCode\":1," +
                "\"typeName\":\"checkbox\"," +
                "\"elementId\":4," +
                "\"formElementCode\":\"\"," +
                "\"elementRule\":\"\"," +
                "\"extra1\":\"\"," +
                "\"items\":[" +
                "{" +
                "\"id\":30," +
                "\"formElementId\":13843," +
                "\"item\":\"zhen\"," +
                "\"rule\":\"\"" +
                "}," +
                "{" +
                "\"id\":31," +
                "\"formElementId\":13843," +
                "\"item\":\"jia\"," +
                "\"rule\":\"\"" +
                "}" +
                "]" +
                "}" +
                "]" +
                "}" +
                "}";
        String result = comm.PostRequest(URL, Param, token, "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update2() //�޸�radioitme
    {
        String token = "d510c6be-c9b3-4ad4-bd87-573e13992b99";
        String URL = "http://10.112.178.22/approve/setting/flow/update";
        String Param = "{" +
                "\"id\":50," +
                "\"companyId\":6," +
                "\"typeId\":49," +
                "\"procdefId\":\"process-6-6-1503887166456\"," +
                "\"name\":\"approve1\"," +
                "\"icon\":\"icon-4\"," +
                "\"status\":true," +
                "\"form\":{" +
                "\"id\":219," +
                "\"elements\":[" +
                "{" +
                "\"id\":13843," +
                "\"formId\":219," +
                "\"title\":\"rodel\"," +
                "\"placeholder\":\"in\"," +
                "\"isMust\":0," +
                "\"format\":\"yyyy-MM-dd\"," +
                "\"orderCode\":1," +
                "\"typeName\":\"checkbox\"," +
                "\"elementId\":4," +
                "\"formElementCode\":\"\"," +
                "\"elementRule\":\"\"," +
                "\"extra1\":\"\"," +
                "\"items\":[" +
                "{" +
                "\"id\":30," +
                "\"formElementId\":13843," +
                "\"item\":\"zhen\"," +
                "\"rule\":\"\"" +
                "}," +
                "{" +
                "\"id\":31," +
                "\"formElementId\":13843," +
                "\"item\":\"zhen\"," +
                "\"rule\":\"\"" +
                "}" +
                "]" +
                "}" +
                "]" +
                "}" +
                "}";
        String result = comm.PostRequest(URL, Param, token, "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update3() //�޸�radioitme��Ϊ�������Ƿ���ʾ��ȷ
    {
        String token = "d510c6be-c9b3-4ad4-bd87-573e13992b99";
        String URL = "http://10.112.178.22/approve/setting/flow/update";
        String Param = "{" +
                "\"id\":50," +
                "\"companyId\":6," +
                "\"typeId\":49," +
                "\"procdefId\":\"process-6-6-1503887166456\"," +
                "\"name\":\"approve1\"," +
                "\"icon\":\"icon-4\"," +
                "\"status\":true," +
                "\"form\":{" +
                "\"id\":219," +
                "\"elements\":[" +
                "{" +
                "\"id\":13843," +
                "\"formId\":219," +
                "\"title\":\"rodel\"," +
                "\"placeholder\":\"in\"," +
                "\"isMust\":0," +
                "\"format\":\"yyyy-MM-dd\"," +
                "\"orderCode\":1," +
                "\"typeName\":\"checkbox\"," +
                "\"elementId\":4," +
                "\"formElementCode\":\"\"," +
                "\"elementRule\":\"\"," +
                "\"extra1\":\"\"," +
                "\"items\":[" +
                "{" +
                "\"id\":30," +
                "\"formElementId\":13843," +
                "\"item\":\"zhen\"," +
                "\"rule\":\"\"" +
                "}," +
                "{" +
                "\"id\":31," +
                "\"formElementId\":13843," +
                "\"item\":\"zhen\"," +
                "\"rule\":\"\"" +
                "}" +
                "]" +
                "}" +
                "]" +
                "}" +
                "}";
        String result = comm.PostRequest(URL, Param, token, "E:\\approve.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update4() //�޸�text
    {
        String token = "d510c6be-c9b3-4ad4-bd87-573e13992b99";
        String URL = "http://10.112.178.22/approve/setting/flow/update";
        String Param = "{" +
                "\"id\":90," +
                "\"companyId\":6," +
                "\"typeId\":66," +
                "\"procdefId\":\"process-6-6-1503887166456\"," +
                "\"name\":\"text4\"," +
                "\"icon\":\"icon-4\"," +
                "\"status\":true," +
                "\"orderCode\": 1000," +
                "\"form\":{" +
                "\"id\":259," +
                "\"typeName\": \"text\"," +
                "\"approveForms\": {" +
                "\"id\": 259," +
                "\"formName\": \"text\"," +
                "\"des\": \"\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504172555619," +
                "\"utime\": 1504172555619," +
                "\"deleted\": true" +
                "}," +
                "\"elements\":[" +
                "{" +
                "\"id\":14037," +
                "\"formId\":259," +
                "\"title\":\"text\"," +
                "\"placeholder\":\"in\"," +
                "\"isMust\":0," +
                "\"format\":\"yyyy-MM-dd\"," +
                "\"orderCode\":1," +
                "\"typeName\":\"text\"," +
                "\"elementId\":1," +
                "\"formElementCode\":\"\"," +
                "\"elementRule\":\"\"," +
                "\"extra1\":\"\"," +
                "\"items\":[" +
                "]" +
                "}" +
                "]" +
                "}" +
                "}";
        String result = comm.PostRequest(URL, Param, token, "E:\\approve.txt");
        String message = comm.GetCode(result);
//	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void update5() //�޸�text��Ϊ�������Ƿ���ʾ��ȷ
    {
        String token = "d510c6be-c9b3-4ad4-bd87-573e13992b99";
        String URL = "http://10.112.178.22/approve/setting/flow/update";
        String Param = "{" +
                "\"id\":90," +
                "\"companyId\":6," +
                "\"typeId\":66," +
                "\"procdefId\":\"process-6-6-1503887166456\"," +
                "\"name\":\"text4\"," +
                "\"icon\":\"icon-4\"," +
                "\"status\":true," +
                "\"orderCode\": 1000," +
                "\"form\":{" +
                "\"id\":259," +
                "\"typeName\": \"text\"," +
                "\"approveForms\": {" +
                "\"id\": 259," +
                "\"formName\": \"text\"," +
                "\"des\": \"\"," +
                "\"cid\": 6," +
                "\"ctime\": 1504172555619," +
                "\"utime\": 1504172555619," +
                "\"deleted\": true" +
                "}," +
                "\"elements\":[" +
                "{" +
                "\"id\":14037," +
                "\"formId\":259," +
                "\"title\":\"text\"," +
                "\"placeholder\":\"in\"," +
                "\"isMust\":0," +
                "\"format\":\"yyyy-MM-dd\"," +
                "\"orderCode\":1," +
                "\"typeName\":\"text\"," +
                "\"elementId\":1," +
                "\"formElementCode\":\"\"," +
                "\"elementRule\":\"\"," +
                "\"extra1\":\"\"," +
                "\"items\":[" +
                "]" +
                "}" +
                "]" +
                "}" +
                "}";
        String result = comm.PostRequest(URL, Param, token, "E:\\approve.txt");
        String message = comm.GetCode(result);
//	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

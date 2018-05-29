package meibanAddressList;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

//����Ա���ӿڲ�������
public class staffsave {
    Common comm = new Common();

    @Test
    public void staffsave1() //�������Ա���ɹ����Ͷ�������ɹ���
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10004,\"staffName\":\"��ޱ\",\"mobile\":\"18622228884\",\"email\":\"84@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffsave2() //�������Ա���ɹ�������������ɹ���
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10005,\"staffName\":\"��ΰ\",\"mobile\":\"18622228885\",\"email\":\"85@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":2,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffsave3() //�������Ա���ɹ����Ͷ���+��������ɹ���
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10006,\"staffName\":\"��ΰ\",\"mobile\":\"18622228886\",\"email\":\"86@qq.com,\"deptId\":1611,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":3,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffsave4() //�������Ա�����������롣
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10006,\"staffName\":\"��ΰ\",\"mobile\":\"18622228886\",\"email\":\"86@qq.com,\"deptId\":1611,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":,\"sendFlag\":\"false\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        //Assert.assertNotEquals(comm.Get_Code(result), 0,10500, message);
    }

    @Test
    public void staffsave5() //�ظ����ݡ�
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":100001,\"staffName\":\"��ޱ\",\"mobile\":\"18622228884\",\"email\":\"84@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffsave6() //Ա������ظ���
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":100001,\"staffName\":\"��ޱ6\",\"mobile\":\"18622228886\",\"email\":\"86@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffsave7() //�ֻ����ظ���
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10007,\"staffName\":\"��ޱ7\",\"mobile\":\"18622228888\",\"email\":\"87@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffsave8() //�����ظ���
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10008,\"staffName\":\"��ޱ8\",\"mobile\":\"18622228888\",\"email\":\"84@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffsave9() //�ֻ��Ÿ�ʽ����
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10008,\"staffName\":\"��ޱ9\",\"mobile\":\"186222288\",\"email\":\"88@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffsave10() //�����ʽ����
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":10010,\"staffName\":\"��ޱ1\",\"mobile\":\"18622228810\",\"email\":\"@qqcom,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void staffsave11() //Ա�����������ʽ����1λ����
    {
        String url = "http://10.112.178.22/admin/staff/save";
        //String token=comm.Get_mobile_access_token("18622228888", "MTIzLmdvbWU=");
        //System.out.println(token);
        String token = "7a0da874-e972-400e-a4ce-2572f4bbc5da";
        String params = "{\"staffNo\":4,\"staffName\":\"��\",\"mobile\":\"18622227778\",\"email\":\"7778@qq.com,\"deptId\":1610,\"dutyName\":\"���Թ���ʦ\",\"dutyIds\":\"\",\"sendType\":1,\"sendFlag\":\"true\"}";
        String result = comm.PostRequest(url, params, token, "E:\\save.txt");
        String message = comm.GetCode(result);
        //Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

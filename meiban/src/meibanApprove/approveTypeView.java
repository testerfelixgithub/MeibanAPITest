package meibanApprove;

import org.testng.Assert;
import org.testng.annotations.Test;

import meibanCommon.Common;

public class approveTypeView {  //�鿴������    
    Common comm = new Common();

    @Test
    public void approveTypeView() //������ID����˾ID��ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=54&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void approveTypeView1() //������ID�����ڡ���˾ID��ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=0&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView2() //������IDΪ�ա���˾ID��ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView3() //������ID���Ͳ���ȷ����˾ID��ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId='66'&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView4() //�½�������
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=82&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView5() //ɾ��������
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=81&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView6() //������ID��ȷ����˾IDΪ��
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=82&companyId=null";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView7() //������ID����˾ID����ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=82&companyId=55";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView8() //������ID��ȷ����˾ID���Ͳ���ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=82&companyId='6'";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView9() //������ID����ȷ����˾ID����ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=99&companyId=66";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView10() //������ID��0����˾ID��ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=0&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView11() //������ID��<0����˾ID��ȷ
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=-1&companyId=6";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView12() //������ID����ȷ����˾ID��<0
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=54&companyId=-1";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void approveTypeView13() //������ID����ȷ����˾ID��=0
    {
        String url = "http://10.112.178.22/approve/setting/type/view?typeId=54&companyId=0";
        //String token=comm.Get_mobile_access_token("15210275852", "MTIzLmdvbWU=");
        //System.out.println(token);
        String result = comm.GetRequest(url, "49f00be0-462a-46af-9c9b-e5e572a4c723", "E:\\approveTypeView.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, 10500, message);
    }
}


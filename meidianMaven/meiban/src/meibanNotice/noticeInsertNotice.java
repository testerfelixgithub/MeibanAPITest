package meibanNotice;

import java.util.Date;
import java.text.SimpleDateFormat;

import meibanCommon.Common;
import org.testng.Assert;
import org.testng.annotations.Test;

public class noticeInsertNotice { //����Ա��ӹ���
    Common comm = new Common();

    //��ȡ��ǰʱ��
    public Date getDate() // ParseException
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        String date = df.format(new Date());
        Date newDate = null;
        try {
            newDate = df.parse(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return newDate;
    }

    @Test
    public void insertnotice() { //��������  Ŀǰ��Ⱥ�ǲ���
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{" +
                "\"title\":\"testpart\"," +
                "\"state\":1," +
                "\"author\":\"authortest\"," +
                "\"companyId\":1," +
                "\"text\":\"testpart\"," +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1327" +
                "}," +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1342" +
                "}" +
                "]" +
                "}";
//	  System.out.println(params);
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice1() { //��������    Ŀ����Ⱥ�ǹ�˾
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testcompany\",\"state\": 1,\"author\": \"testcompanyauthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 2," +
                "\"targetid\": 1" +
                "}," +
                "{" +
                "\"type\": 2," +
                "\"targetid\": 1" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice2() { //��������    Ŀ����Ⱥ�Ǹ���
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testperpon\",\"state\": 1,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice4() { //��������    Ŀ���Ǽ���,Ŀǰ���Ż�û��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testperpon\",\"state\": 1,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 1," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 1," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice5() { //typeĿ���ǲ��ţ�targetidĿ�������Ǹ���  ���Է����ɹ��������κ��˿ɲ鿴��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testperponerror\",\"state\": 1,\"author\": \"testperponanthorerror\",\"companyId\": 1,\"text\":\"testcompanytexterror\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice7() { //type�����ڣ�targetid������  ���سɹ��ˣ���BUG
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testperponerror\",\"state\": 1,\"author\": \"testperponanthorerror\",\"companyId\": 1,\"text\":\"testcompanytexterror\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 0," +
                "\"targetid\": -1" +
                "}," +
                "{" +
                "\"type\": 0," +
                "\"targetid\": -1" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice8() { //typeΪ�գ�targetidΪ-1
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testperponerror\",\"state\": 1,\"author\": \"testperponanthorerror\",\"companyId\": 1,\"text\":\"testcompanytexterror\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": ," +
                "\"targetid\": -1" +
                "}," +
                "{" +
                "\"type\": ," +
                "\"targetid\": -1" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice9() { //noticeTargetsΪ��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"testperponerror\",\"state\": 1,\"author\": \"testperponanthorerror\",\"companyId\": 1,\"text\":\"testcompanytexterror\", \"noticeTargets\":[]}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice10() { //��������    titleΪ64λ
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"0123456789012345678901234567890123456789012345678901234567890123\",\"state\": 1,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice11() { //title����64λ
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"01234567890123456789012345678901234567890123456789012345678901234\",\"state\": 1,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice12() { //titleΪ��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"\",\"state\": 1,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice13() { //�������� stateΪ2��Ϊ�ݸ�
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"caogao\",\"state\": 2,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1327" +
                "}," +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1342" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice14() { //�������� stateΪ3��ʱ����
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"dingshi\",\"state\": 3,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\",\"sendtime\":\"2018-09-05 17:19:00\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1327" +
                "}," +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1342" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice15() { //stateΪ3��ʱ���� ����ʱ��С�ڵ�ǰʱ��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"dingshi\",\"state\": 3,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\",\"sendtime\":\"2016-09-05 17:09:00\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1327" +
                "}," +
                "{" +
                "\"type\": 3," +
                "\"targetid\": 1342" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice16() { //��������   stateΪ4 �ѳ���
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"chehui\",\"state\": 0,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice17() { //  stateΪ-1 ������
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"chehui\",\"state\": -1,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice18() { //  stateΪ��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"chehui\",\"state\": ,\"author\": \"testperponanthor\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice19() { //  author����Ϊ32
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"author32\",\"state\": 1,\"author\": \"01234567890123456789012345678901\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice20() { //  author����Ϊ����32
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"author32\",\"state\": 1,\"author\": \"012345678901234567890123456789012\",\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice21() { //��������  authorΪ��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"author32\",\"state\": 1,\"author\":\"\" ,\"companyId\": 1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void insertnotice22() { //  companyId������
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"author32\",\"state\": 1,\"author\": \"test\",\"companyId\": -1,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void insertnotice23() { //  companyIdΪ��
        String url = "https://work.pre.gomeplus.com/notice/admin/insertnotice";
//	  String token=comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
//	  System.out.println(token);
        String token = "189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String params = "{\"title\":\"author32\",\"state\": 1,\"author\": \"test\",\"companyId\": ,\"text\":\"testcompanytext\", " +
                "\"noticeTargets\":[" +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}," +
                "{" +
                "\"type\": 4," +
                "\"targetid\": 3620" +
                "}" +
                "]" +
                "}";
        String result = comm.PostRequest(url, params, token, "E:\\noticeInsertNotice.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

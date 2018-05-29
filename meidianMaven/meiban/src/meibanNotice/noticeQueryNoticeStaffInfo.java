package meibanNotice;

import meibanCommon.Common;
import org.testng.Assert;

import org.testng.annotations.Test;

public class noticeQueryNoticeStaffInfo {//Ա���鿴�����б�

    Common comm = new Common();

    @Test
    public void noticeQueryNoticeStaffInfo() {//��������
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=1";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo1() {//��������     �Ƿ��ղ�Ϊ��
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=2&hascollect=";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo2() {//��������     �Ƿ��ղ�Ϊ0 δ�ղ� ��������Ϊ�գ�ʵ���������ݵ�
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=2&hascollect=0";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo3() {//��������     �Ƿ��ղ�Ϊ 1 ���ղ�
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=2&hascollect=1";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo4() {//ҳ���������ֵ������������������Ӧ��
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=2000&pageSize=1";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo5() {//ҳ�������� ��10500����
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=-1&pageSize=20";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo6() {//ҳ��Ϊ��
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=&pageSize=20";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo7() {//ҳ����ʾ����������   ��10500
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=-1";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo8() {//ҳ����ʾ����Ϊ��
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void noticeQueryNoticeStaffInfo9() {//�����Ƿ��ղ�״̬�벻����  ��10500
        String url = "https://work.pre.gomeplus.com/notice/queryNoticeStaffInfo?pageNo=1&pageSize=-1";
        String token = comm.Get_mobile_access_token("13691246710", "MTIzLmdvbWU=");
        System.out.println(token);
//	  String token="189198f0-e11a-42b7-9a4a-0496b4d626d5";
        String result = comm.GetRequest(url, token, "E:\\noticeQueryNoticeStaffInfo.txt");
        String message = comm.GetCode(result);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

package meibanAttend;

import meibanCommon.Common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attendSchemeModify {
    Common comm = new Common();

    @Test
    public void attendschemeModify() //�޸ķ�����(�����ڷ�����)
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/modify";
        //  String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"scheme\": {" +
                "\"schemeId\": 235," +
                "\"name\": \"fxztest3\"," +
                "\"weekRule\": \"0\"," +
                "\"valid\": false," +
                "\"cid\": 1," +
                "\"ownerId\": 0," +
                "\"tenantId\": 0," +
                "\"ctime\": 1504602938227," +
                "\"utime\": 1504602938227," +
                "\"deleted\": false" +
                "}," +
                "\"shcemeTimes\": [" +
                "{" +
                "\"schemeTime\": {" +
                "\"id\": 235," +
                "\"schemeId\": 235," +
                "\"beginTime\": \"08:30:00\"," +
                "\"endTime\": \"17:30:00\"," +
                "\"beginTimeType\": 0," +
                "\"endTimeType\": 0," +
                "\"beginNooning\": \"12:30:00\"," +
                "\"endNooning\": \"13:30:00\"," +
                "\"workTime\": \"8.00\"," +
                "\"elasticTime\": 60," +
                "\"workOnBefore\": 0," +
                "\"workOffAfter\": 0," +
                "\"overtime\": 0," +
                "\"deleted\": false," +
                "\"elastic\": true" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]," +
                "\"schemeAddresses\": [" +
                "{" +
                "\"schemeAddress\": {" +
                "\"id\": 350," +
                "\"schemeId\": 235," +
                "\"name\": \"fxz\"," +
                "\"coordinateX\": 116.45428," +
                "\"coordinateY\": 39.957973," +
                "\"clockRange\": 100," +
                "\"comment\": \"\"," +
                "\"deleted\": false" +
                "}," +
                "\"locateX\": 0," +
                "\"locateY\": 0," +
                "\"actionFlag\": 0," +
                "\"cid\": 0," +
                "\"valid\": false" +
                "}" +
                "]," +
                "\"schemeArranges\": [" +
                "{" +
                "\"schemeArrange\": {" +
                "\"id\": 268," +
                "\"schemeId\": 235," +
                "\"arrangeType\": 1," +
                "\"arrangeObjectId\": 488," +
                "\"arrangeObjectName\": \"\"," +
                "\"ctime\": 1504602938234," +
                "\"utime\": 1504602938234," +
                "\"deleted\": false" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]" +
                "}";

        String result = comm.PostRequest(url, params, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        Assert.assertEquals(comm.Get_Code(result), 0, message);
        // Assert.assertNotEquals(comm.Get_Code(result), 0, 10500,message);
    }

    @Test
    public void attendschemeModify1() //�޸ķ�����(���ڷ�����)
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/modify";
        //  String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"scheme\": {" +
                "\"schemeId\": 235," +
                "\"name\": \"fxztest3\"," +
                "\"weekRule\": \"0\"," +
                "\"valid\": false," +
                "\"cid\": 1," +
                "\"ownerId\": 0," +
                "\"tenantId\": 0," +
                "\"ctime\": 1504602938227," +
                "\"utime\": 1504602938227," +
                "\"deleted\": false" +
                "}," +
                "\"shcemeTimes\": [" +
                "{" +
                "\"schemeTime\": {" +
                "\"id\": 235," +
                "\"schemeId\": 235," +
                "\"beginTime\": \"08:30:00\"," +
                "\"endTime\": \"17:30:00\"," +
                "\"beginTimeType\": 0," +
                "\"endTimeType\": 0," +
                "\"beginNooning\": \"12:30:00\"," +
                "\"endNooning\": \"13:30:00\"," +
                "\"workTime\": \"8.00\"," +
                "\"elasticTime\": 60," +
                "\"workOnBefore\": 0," +
                "\"workOffAfter\": 0," +
                "\"overtime\": 0," +
                "\"deleted\": false," +
                "\"elastic\": true" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]," +
                "\"schemeAddresses\": [" +
                "{" +
                "\"schemeAddress\": {" +
                "\"id\": 350," +
                "\"schemeId\": 235," +
                "\"name\": \"fxz\"," +
                "\"coordinateX\": 116.45428," +
                "\"coordinateY\": 39.957973," +
                "\"clockRange\": 100," +
                "\"comment\": \"\"," +
                "\"deleted\": false" +
                "}," +
                "\"locateX\": 0," +
                "\"locateY\": 0," +
                "\"actionFlag\": 0," +
                "\"cid\": 0," +
                "\"valid\": false" +
                "}" +
                "]," +
                "\"schemeArranges\": [" +
                "{" +
                "\"schemeArrange\": {" +
                "\"id\": 268," +
                "\"schemeId\": 235," +
                "\"arrangeType\": 1," +
                "\"arrangeObjectId\": 488," +
                "\"arrangeObjectName\": \"\"," +
                "\"ctime\": 1504602938234," +
                "\"utime\": 1504602938234," +
                "\"deleted\": false" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]" +
                "}";

        String result = comm.PostRequest(url, params, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendschemeModify2() //(weekRule)Ϊ null
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/modify";
        //  String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"scheme\": {" +
                "\"schemeId\": 235," +
                "\"name\": \"fxztest3\"," +
                "\"weekRule\": \"0\"," +
                "\"valid\": false," +
                "\"cid\": 1," +
                "\"ownerId\": 0," +
                "\"tenantId\": 0," +
                "\"ctime\": 1504602938227," +
                "\"utime\": 1504602938227," +
                "\"deleted\": false" +
                "}," +
                "\"shcemeTimes\": [" +
                "{" +
                "\"schemeTime\": {" +
                "\"id\": 235," +
                "\"schemeId\": 235," +
                "\"beginTime\": \"08:30:00\"," +
                "\"endTime\": \"17:30:00\"," +
                "\"beginTimeType\": 0," +
                "\"endTimeType\": 0," +
                "\"beginNooning\": \"12:30:00\"," +
                "\"endNooning\": \"13:30:00\"," +
                "\"workTime\": \"8.00\"," +
                "\"elasticTime\": 60," +
                "\"workOnBefore\": 0," +
                "\"workOffAfter\": 0," +
                "\"overtime\": 0," +
                "\"deleted\": false," +
                "\"elastic\": true" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]," +
                "\"schemeAddresses\": [" +
                "{" +
                "\"schemeAddress\": {" +
                "\"id\": 350," +
                "\"schemeId\": 235," +
                "\"name\": \"fxz\"," +
                "\"coordinateX\": 116.45428," +
                "\"coordinateY\": 39.957973," +
                "\"clockRange\": 100," +
                "\"comment\": \"\"," +
                "\"deleted\": false" +
                "}," +
                "\"locateX\": 0," +
                "\"locateY\": 0," +
                "\"actionFlag\": 0," +
                "\"cid\": 0," +
                "\"valid\": false" +
                "}" +
                "]," +
                "\"schemeArranges\": [" +
                "{" +
                "\"schemeArrange\": {" +
                "\"id\": 268," +
                "\"schemeId\": 235," +
                "\"arrangeType\": 1," +
                "\"arrangeObjectId\": 488," +
                "\"arrangeObjectName\": \"\"," +
                "\"ctime\": 1504602938234," +
                "\"utime\": 1504602938234," +
                "\"deleted\": false" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]" +
                "}";

        String result = comm.PostRequest(url, params, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }

    @Test
    public void attendschemeModify3() //(beginTime && endTime)Ϊ null
    {
        String url = "https://work.pre.gomeplus.com/attend/admin/scheme/modify";
        //  String token=comm.Get_mobile_access_token("13552883581", "MTIzLmdvbWU=");
        //System.out.println(token);
        // String result=comm.GetRequest(url, "7ae06007-cb17-4439-b57a-43e236d29043", "E:\\approvelist.txt");
        String params = "{" +
                "\"scheme\": {" +
                "\"schemeId\": 235," +
                "\"name\": \"fxztest3\"," +
                "\"weekRule\": \"1,2\"," +
                "\"valid\": false," +
                "\"cid\": 1," +
                "\"ownerId\": 0," +
                "\"tenantId\": 0," +
                "\"ctime\": 1504602938227," +
                "\"utime\": 1504602938227," +
                "\"deleted\": false" +
                "}," +
                "\"shcemeTimes\": [" +
                "{" +
                "\"schemeTime\": {" +
                "\"id\": 235," +
                "\"schemeId\": 235," +
                "\"beginTime\": \"\"," +
                "\"endTime\": \"\"," +
                "\"beginTimeType\": 0," +
                "\"endTimeType\": 0," +
                "\"beginNooning\": \"12:30:00\"," +
                "\"endNooning\": \"13:30:00\"," +
                "\"workTime\": \"8.00\"," +
                "\"elasticTime\": 60," +
                "\"workOnBefore\": 0," +
                "\"workOffAfter\": 0," +
                "\"overtime\": 0," +
                "\"deleted\": false," +
                "\"elastic\": true" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]," +
                "\"schemeAddresses\": [" +
                "{" +
                "\"schemeAddress\": {" +
                "\"id\": 350," +
                "\"schemeId\": 235," +
                "\"name\": \"fxz\"," +
                "\"coordinateX\": 116.45428," +
                "\"coordinateY\": 39.957973," +
                "\"clockRange\": 100," +
                "\"comment\": \"\"," +
                "\"deleted\": false" +
                "}," +
                "\"locateX\": 0," +
                "\"locateY\": 0," +
                "\"actionFlag\": 0," +
                "\"cid\": 0," +
                "\"valid\": false" +
                "}" +
                "]," +
                "\"schemeArranges\": [" +
                "{" +
                "\"schemeArrange\": {" +
                "\"id\": 268," +
                "\"schemeId\": 235," +
                "\"arrangeType\": 1," +
                "\"arrangeObjectId\": 488," +
                "\"arrangeObjectName\": \"\"," +
                "\"ctime\": 1504602938234," +
                "\"utime\": 1504602938234," +
                "\"deleted\": false" +
                "}," +
                "\"actionFlag\": 0" +
                "}" +
                "]" +
                "}";

        String result = comm.PostRequest(url, params, "1974662b-1be9-4293-83c8-f4d743d8c1ea", "E:\\approveTransfer.txt");
        String message = comm.GetCode(result);
        //	Assert.assertEquals(comm.Get_Code(result), 0, message);
        Assert.assertNotEquals(comm.Get_Code(result), 0, 10500, message);
    }
}

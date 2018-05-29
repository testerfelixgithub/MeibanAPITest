package meibanCommon;
//------author------fuxiaozhen

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

//import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Common {
    Config Host = new Config();

    public String Get_mobile_access_token(String UserName, String PassWord) {
        String host = Host.getURL();
        String tocken = host + "/v1/access_token?username=" + UserName + "&password=" + PassWord;
        //	String tocken="https://work.pre.gomeplus.com/v1/access_token?username="+UserName+"&password="+PassWord;//Ԥ����
        //	String tocken="http://10.112.178.22/v1/access_token?username="+UserName+"&password="+PassWord;//��������
        String Result = PostRequest(tocken, "", "", "");
        //System.out.println(Result);
        String token = null;
        //List<String> s=new ArrayList<String> ();
        try {
            JSONObject jsonObject = new JSONObject(Result);
            String ss2 = jsonObject.getString("data");
            // System.out.println(ss2);
            JSONObject jsonObject1 = new JSONObject(ss2);
            token = jsonObject1.getString("token");

        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return token;
    }

    public String PutRequest(String httpUrl, String Param, String token, String fileName) {
        String result = "";
        URL url = null;
        try {
            url = new URL(httpUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url != null) {
            try {
                trustAllHttpsCertificates();
                HttpsURLConnection.setDefaultHostnameVerifier(hv);
                HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
                urlConn.setRequestProperty("content-type", "application/json");
                urlConn.setDoInput(true);
                urlConn.setDoOutput(true);
                urlConn.setConnectTimeout(5 * 1000);
                //��������ʽΪ PUT  
                urlConn.setRequestMethod("PUT");

                //  urlConn.setRequestProperty("Content-Type", "application/json");
                urlConn.setRequestProperty("Accept", "application/json");

                urlConn.setRequestProperty("Charset", "UTF-8");
                if (token != "") {
                    urlConn.addRequestProperty("access_token", token);
                }

                DataOutputStream dos = new DataOutputStream(urlConn.getOutputStream());
                //д���������  
                //����Ҫע����ǣ��ڹ���JSON�ַ�����ʱ��ʵ��֤������ò�Ҫʹ�õ����ţ������á�\������ת�壬����ᱨ��   
                dos.write(Param.getBytes("UTF-8"));
                dos.flush();
                dos.close();

                if (urlConn.getResponseCode() == 200) {
                    InputStreamReader isr = new InputStreamReader(urlConn.getInputStream(), "UTF-8");
                    BufferedReader br = new BufferedReader(isr);
                    String inputLine = null;
                    while ((inputLine = br.readLine()) != null) {
                        result += inputLine;
                    }
                    //  System.out.println(result);
                    if (token != "" || fileName != "") {
                        // System.out.println(content.toString());
                        System.out.println(result);
                        WirteFile(fileName, "------------------����URL--------------------");
                        WirteFile(fileName, httpUrl);
                        WirteFile(fileName, "------------------�������--------------------");
                        WirteFile(fileName, Param);
                        WirteFile(fileName, "------------------Ӧ����:" + urlConn.getResponseCode() + "Ӧ����:" + GetCode(result) + "--------------------");
                        WirteFile(fileName, result);
                    }
                    isr.close();
                    urlConn.disconnect();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public String GetRequest(String httpUrl, String token, String fileName) //throws Exception //throws Exception
    {
        HttpURLConnection httpConn = null;
        BufferedReader in = null;
        String Result = null;
        try {
            URL url = new URL(httpUrl);
            // System.out.println("test1");
            try {
                trustAllHttpsCertificates();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
            httpConn = (HttpURLConnection) url.openConnection();
            httpConn.setRequestMethod("GET");
            httpConn.setRequestProperty("Charset", "UTF-8");
            //   httpConn.addRequestProperty("access_token","6d7eb5b1-51d6-4fe0-bd76-007d9e46971a");
            if (token != "") {
                httpConn.addRequestProperty("access_token", token);
            }
            //   System.out.println(httpConn.getHeaderFields());
            // httpConn.addRequestProperty("Cookie", "sid=2c011fae-9031-4eb1-99d6-8f9065eb52c3;rm_sid=rZHfVwKiWkZzragEPOU6+I9hi6znU44eFKRDg6qqDKegbb8QbLmRCP0XkJEXs2RcP6qe5NVKGRQQGKGcX++1zRTaMbgI+DQTxfB1y3DKfdGGk1WCrZT/WjlL5Yc+BUKrWPwQCuesvMfkLEQBBC4YopbH+6Y/+Y1u36EgwQdZ5OvII7AWKQK4fpO35qGpZzxXqA2PBrBrY+AoQxPlPDNMey9oTZWga60Xkj+5VtBE3v+cNTRviCAC7dU9LLDU1dByZ+1OsRVaR2DhPYcoWQb8SY0eaLKrtGq7efEifruhdVMPooXGgIZKg4DmXd/QkSWVKaaGTJrtuncuO9aAAEuPH/9l0gIGyN4shTbThsyPYasR6V2BwhEg1EOF5A7pIVGcNSbQYgwQ430NoW+oSYDboOaAkyMBoOrcWXYxYar6n4oDDyVD3PnrdodxHHUfwZ+0XNhshYGpXmqGpQZbMoWtYJbvsCI13NR8aj1I89bMGHGliYudsa1JGRWyuLIzAKGIXbLSz+qDXzEeKAlKDZ98p8zoUlTOxM7pTDkDeT91XOsQ1a6K1D5o5fRtYzEmqcYPZ8tcolRHoAdwtAmJ/WWbHLiejyV3Fy0WoO3m7t+ZuhONmtacdPB0AyFmiVgoFdblR3GMV5jdx+Dr6SGQSP8pm02xSyGNFEsCtJJjPU6bDmiyseS98s58Mpe3/6YFmDvoKx3t1PjtjI3VoZuJbayTMap/vJ0JtRFJwIpBdHQw8f3VexhmIswfneWAQ3FSLvSxpICh1ShDH2I8zpWZsy8ZAredWcdTxEGR2clgNDc5/3FA4g6c2lrHvYPv8yO4I8Vmxl9jxIRVBj8KM8Kt8wSX51Z5oMcF0kTV/t+ZacUP75Qy7yh6cYVPZQrgpRSnduwCsbh+hwZeqJ7KCriUT9OWRHlb+d58m5kyJEpiSawQ2os+vpZYSOiKq+iAw9ytXwzTGx1vRLMeccW8J2IryebN4tEaaRVzgJLZ13/oXvuasFezGM1MGiz8pBdcz9WBfPToquN5Nf97cWNi/Gdmjkccs8iZ5/2FZNuuBpH82Nk8myePPSCskW5fBccTn3tuexIwWPQS1hc+ZZrQOW1WYPz0fF2XSQlMIMII6zHK4Ge7AxwnUddY/hxeY+mIWvqJrDqY4PMWStMrRKS5RPoQ1kCDE7mIffKrlwulOoY/1VS+odpZmfZLH+imKx2K1N57Z0SepFKz2ajx9T4UGlpRGct8R9CnT5iGtQBFxW1oGelB/YQIgvh8uwIkKGwJPIT58xG8SYBTMaZRHG/V95dHqtRC354MQiiNC+gyE8/p38klZqxwOHFUpu61DCYUEMy/0NIzpcQKmU4Efij+Hfaftxld2Kk+WXOgLe317nFdQYvDHsP1Hm2mUW5pEsmEomEGdRGxCROqG40BPmwiz+4bNeGOTStRpqGykx79k9LszZ/EctMjTJzsdzDEuwqBnJyJcUHW0ukWB7xJLFSP7B/0s/+LHX1rR1qigz7SqS8kyoIFLSWXt/jKcBgL2TuJWWhB7nRjMhzg/4nly4GXO8DonqaqhGINiaFVeV3iO1RXkLlthwuQm1BmVVM5Mresqb3iGwNe3wZ1cx90IGdwN1TAJBd/9w30/LeXP0iKAGQbQhl3KvR1fpjFIJ49eK7PWtuF6slzKo2kStO4YLbR6Vj2ZAzcDyX4KGHvc5BD9vK3cn59klRi43bz5vWHR4jhj2Z0POdlgzOfSP2jP/RG//aOpPLDO82mTiG9gSbMTPUg4N1Xer+q9z5OiIjluJqrSINHWN5BGe4FOPuS/vNeCwKxirTdCZvaokMg1mMhL3n5AnY+k/kQ24Xw7UFSsK4xpP0FP9iR");
            //    System.out.println("test2");
            //��ȡ��Ӧ
            System.out.println(httpConn.getHeaderFields());
            if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // 	System.out.println("test3");
                StringBuffer content = new StringBuffer();
                String tempStr = "";
                in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
                while ((tempStr = in.readLine()) != null) {
                    content.append(tempStr);
                }
                Result = content.toString();
                if (token != "" || fileName != "") {
                    System.out.println(content.toString());
                    WirteFile(fileName, "------------------����URL--------------------");
                    WirteFile(fileName, httpUrl);
                    // WirteFile(fileName,"------------------�������--------------------");
                    // WirteFile(fileName,params);
                    WirteFile(fileName, "------------------Ӧ����:" + httpConn.getResponseCode() + "Ӧ����:" + GetCode(content.toString()) + "--------------------");
                    WirteFile(fileName, content.toString());
                }
                //   System.out.println(content.toString());
            } else {
                //throw new Exception("�������������!");
                System.out.println("�������������!" + httpConn.getResponseCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                httpConn.disconnect();
            }
        }
        return Result;

    }

    public String PostRequest(String httpUrl, String params, String token, String fileName) //throws Exception
    {
        HttpURLConnection httpConn = null;
        BufferedReader in = null;
        PrintWriter out = null;
        DataOutputStream dos = null;
        String Result = null;
        try {
            URL url = new URL(httpUrl);
            //   System.out.println("test1");
            try {
                trustAllHttpsCertificates();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
            httpConn = (HttpURLConnection) url.openConnection();
            //    System.out.println("test2");
            httpConn.setRequestMethod("POST");
            httpConn.addRequestProperty("Content-Type", "application/json");
            httpConn.setRequestProperty("Charset", "UTF-8");
            //   System.out.println("test3");
            // httpConn.addRequestProperty("ClientOs", "6");
            //    httpConn.addRequestProperty("access_token","6d7eb5b1-51d6-4fe0-bd76-007d9e46971a");kehuduan
            if (token != "") {
                httpConn.addRequestProperty("access_token", token);
            }
            //  System.out.println(httpConn.getHeaderFields());
            httpConn.setDoInput(true);
            httpConn.setDoOutput(true);
            //    System.out.println("test2");
            //����post�������
            if (params != null) {
      /*      out=new PrintWriter(httpConn.getOutputStream());
          //  out.println(params);
            out.write(params);
            out.flush();*/
                dos = new DataOutputStream(httpConn.getOutputStream());
                //д���������
                //����Ҫע����ǣ��ڹ���JSON�ַ�����ʱ��ʵ��֤������ò�Ҫʹ�õ����ţ������á�\������ת�壬����ᱨ��
                // dos.writeBytes(params);  
                dos.write(params.getBytes("UTF-8"));
                dos.flush();

            }
            dos.close();
            //     out.close();
            //   System.out.println("test3");
            //��ȡ��Ӧ
            if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                StringBuffer content = new StringBuffer();
                String tempStr = "";
                in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
                while ((tempStr = in.readLine()) != null) {
                    content.append(tempStr);
                }
                //   return content.toString();
                //   System.out.println(content.toString());
                Result = content.toString();
                if (token != "" || fileName != "") {
                    System.out.println(content.toString());
                    WirteFile(fileName, "------------------����URL--------------------");
                    WirteFile(fileName, httpUrl);
                    WirteFile(fileName, "------------------�������--------------------");
                    WirteFile(fileName, params);
                    WirteFile(fileName, "------------------Ӧ����:" + httpConn.getResponseCode() + "Ӧ����:" + GetCode(content.toString()) + "--------------------");
                    WirteFile(fileName, content.toString());
                }
            } else {
                try {
                    //throw new Exception("�������������!");
                    System.out.println(httpConn.getResponseCode());
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // out.close();
            httpConn.disconnect();
        }
        return Result;
    }

    public String PostFileRequest(String httpUrl, String postfilepath, String token, String fileName) //throws Exception
    {
        HttpURLConnection httpConn = null;
        BufferedReader in = null;
        PrintWriter out = null;
        DataOutputStream dos = null;
        String Result = null;
        String BOUNDARY = "----WebKitFormBoundarywEDz8eRzmzrPybXO";
        FileInputStream fis = null;// ��������д��Ӧ��
        try {
            URL url = new URL(httpUrl);
            //   System.out.println("test1");
            try {
                trustAllHttpsCertificates();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
            httpConn = (HttpURLConnection) url.openConnection();
            httpConn.setDoInput(true);
            httpConn.setDoOutput(true);
            httpConn.setUseCaches(false);
            httpConn.setRequestMethod("POST");
            httpConn.addRequestProperty("Connection", "Keep-Alive");
            httpConn.addRequestProperty("Charset", "UTF-8");
            httpConn.addRequestProperty("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundarywEDz8eRzmzrPybXO");
            if (token != "") {
                httpConn.addRequestProperty("access_token", token);
            }

            dos = new DataOutputStream(httpConn.getOutputStream());
            //д���������
            //����Ҫע����ǣ��ڹ���JSON�ַ�����ʱ��ʵ��֤������ò�Ҫʹ�õ����ţ������á�\������ת�壬����ᱨ��
            File file = new File(postfilepath);
            StringBuilder sb = new StringBuilder();
            sb.append("--");
            sb.append(BOUNDARY);
            sb.append("\r\n");
            sb.append("Content-Disposition: form-data;name=\"file\";filename=\"" + file.getName() + "\"\r\n");
            sb.append("Content-Type:application/ms-word\r\n\r\n");
            byte[] head = sb.toString().getBytes("UTF-8");
            dos.write(head);

            // �ļ�����
            fis = new FileInputStream(file);
            long leng = file.length();
            int filelong = (int) (leng);
            byte[] read = new byte[filelong];
            int offset = 0;
            while ((offset = fis.read(read)) != -1) {
                dos.write(read, 0, offset);
            }
            dos.write(("\r\n--" + BOUNDARY + "--\r\n").getBytes());
            dos.flush();// ��������

            //��ȡ��Ӧ
            if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                StringBuffer content = new StringBuffer();
                String tempStr = "";
                in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
                while ((tempStr = in.readLine()) != null) {
                    content.append(tempStr);
                }
                //   return content.toString();
                //   System.out.println(content.toString());
                Result = content.toString();
                if (token != "" || fileName != "") {
                    System.out.println(content.toString());
                    WirteFile(fileName, "------------------����URL--------------------");
                    WirteFile(fileName, httpUrl);
                    WirteFile(fileName, "------------------�������--------------------");
                    WirteFile(fileName, postfilepath);
                    WirteFile(fileName, "------------------Ӧ����:" + httpConn.getResponseCode() + "Ӧ����:" + GetCode(content.toString()) + "--------------------");
                    WirteFile(fileName, content.toString());
                }
            } else {
                try {
                    //throw new Exception("�������������!");
                    System.out.println(httpConn.getResponseCode());
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // out.close();
            httpConn.disconnect();
        }
        return Result;
    }


    public String GetCode(String result) {
        JSONObject jsonObject = null;
        String ss2 = null;
        String ss = null;
        try {
            jsonObject = new JSONObject(result);
            ss2 = jsonObject.getString("code");
            ss = jsonObject.getString("msg");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ss2 + " StateMessage:" + ss;
    }

    public int Get_Code(String result) {
        JSONObject jsonObject = null;
        int code = 0;
        String ss2 = null;
        // String ss=null;
        try {
            jsonObject = new JSONObject(result);
            ss2 = jsonObject.getString("code");
            code = Integer.parseInt(ss2);
            // ss=jsonObject.getString("msg");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            code = -1;
            e.printStackTrace();
        }
        return code;
    }

    public void WirteFile(String FilenName, String value) {
        FileWriter fw = null;
        try {
            //����ļ����ڣ���׷�����ݣ�����ļ������ڣ��򴴽��ļ�
            File f = new File(FilenName);
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println(value);
        pw.flush();
        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String Str_utf(String param) {

        String aa = null;
        try {
            aa = java.net.URLEncoder.encode(param, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return aa;
    }

    HostnameVerifier hv = new HostnameVerifier() {
        public boolean verify(String urlHostName, SSLSession session) {
            System.out.println("Warning: URL Host: " + urlHostName + " vs. "
                    + session.getPeerHost());
            return true;
        }
    };

    private static void trustAllHttpsCertificates() throws Exception {
        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
        javax.net.ssl.TrustManager tm = new miTM();
        trustAllCerts[0] = tm;
        javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
                .getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
                .getSocketFactory());
    }

    static class miTM implements javax.net.ssl.TrustManager,
            javax.net.ssl.X509TrustManager {
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public boolean isServerTrusted(
                java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public boolean isClientTrusted(
                java.security.cert.X509Certificate[] certs) {
            return true;
        }

        public void checkServerTrusted(
                java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }

        public void checkClientTrusted(
                java.security.cert.X509Certificate[] certs, String authType)
                throws java.security.cert.CertificateException {
            return;
        }
    }

}
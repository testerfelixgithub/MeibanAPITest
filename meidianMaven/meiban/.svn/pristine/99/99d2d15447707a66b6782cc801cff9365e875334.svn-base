package meibanCommon;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonproxy
{
	public static void main(String[] args)
	{
		jsonproxy json=new jsonproxy();
		json.jsonjiexi();
	}
	
	public void jsonjiexi()
	{
		String ss="{'a':'b','c':[{'key1':'value1'},{'key2':'value2'},{'key3':'value3'}]}";
		//	String ss1="{'a':'b'}";
			List<String> s=new ArrayList<String> ();
			 try {  
		            JSONObject jsonObject = new JSONObject(ss);
		           // String ss2=jsonObject.getString("c"); 
		            //  System.out.println(ss2);
		              JSONArray jsonArray = jsonObject.getJSONArray("c");
		              System.out.println(jsonArray.toString());
		               ArrayList<String> list1 = new ArrayList<String>();  
		               for(int i = 0; i < jsonArray.length(); i ++ ){  
		                   String str = "";  
		                  // System.out.println(jsonArray.length()+jsonArray.getString(i));
		                   JSONObject jsonObject2 = jsonArray.getJSONObject(i);
		                   int b=i+1;
		                   String aa="key"+b;
		                  // System.out.println(aa);
		                   System.out.println(jsonObject2.getString(aa));
		                  
		                 //  str = jsonObject2.getString("firstName");  
		                //   str = str + jsonObject2.getString("lastName");  
		               //    str = str + jsonObject2.getString("email");  
		                //   list1.add(str);  
		               }  
		                    
		            
			 }
			 catch(Exception e)
			 {
				// System.out.print(e.toString());
			 }
	}
	}
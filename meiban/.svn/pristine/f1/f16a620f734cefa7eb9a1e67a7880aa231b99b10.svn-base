package meibanCommon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnect {
	
         public MySqlConnect()
         {
        	 
         }
   public static  void main(String args[])
   {
	   MySqlConnect test=new MySqlConnect();
	    test.mysqlTest();
   }
   public void mysqlTest()
   {
	   Connection con = null;
	   Statement  st  = null;
	   ResultSet  rs  = null;
	   try {
		                // 获得MySQL驱动的实例
		   //System.out.println("test"+ con);
		               Class.forName("com.mysql.jdbc.Driver").newInstance();
		             // jdbc.Driver driver = new com.mysql.jdbc.Driver();
		               // 获得连接对象(提供：地址，用户名，密码)
		              // System.out.println("test"+ con);
		               con = DriverManager.getConnection("jdbc:mysql://10.126.44.55:6321/qyyloadtest","pre_qyyloadtest", "SNhHvFsswFigIXNt");
		              
		               if (!con.isClosed())
		                   System.out.println("Successfully connected ");
		              else
		                   System.out.println("failed connected");
		               
		                //建立一个Statement，数据库对象
		                st = con.createStatement();
		                // 运行SQL查询语句
		               rs = st.executeQuery("select * from qyyloadtest.uc_user;");
		                // 读取结果集
		               //System.out.println("test");
		                while (rs.next()) {
		                	//System.out.println("test");
		                    System.out.println("column1:"+rs.getInt(1));
		                    System.out.println("column2:"+rs.getString(2));
		                    System.out.println("column3:"+rs.getString(3));
		                    System.out.println("column4:"+rs.getString(4));
		                }
		                // 关闭链接
		                con.close();
		            } catch(Exception e) {
		                System.err.println("Exception: " + e.getMessage());
		            }
	     
   }
}

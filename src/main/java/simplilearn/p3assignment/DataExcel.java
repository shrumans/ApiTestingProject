package simplilearn.p3assignment;

import java.io.File;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataExcel {

	static String env = null == System.getProperty("env")?"stage":System.getProperty("env");

	
	  //final static String filepath = System.getProperty("user.dir")+File.separator+"resources"+File.separator+
		//"TestDataStage.xlsx";
		
		 static String filepath = env.toLowerCase().equals("prod")?
		 	 System.getProperty("user.dir")+File.separator+"resources"+File.separator+"TestDataProduction.xlsx":
			 System.getProperty("user.dir")+File.separator+"resources"+File.separator+"TestDataStaging.xlsx";
		 
		 
		 
		public static String getDatafmExcel(String sheetname, String ID) {
			
			String result="not able to fetch data";
			
			try {
				
				Fillo fillo=new Fillo();
				Connection connection=fillo.getConnection(filepath);
				String strQuery="Select * from "+sheetname +" where ID='"+ ID +"'";
				Recordset recordset=connection.executeQuery(strQuery);
				 
				while(recordset.next()){
				result= recordset.getField("Value");
				}
				 
				recordset.close();
				connection.close();
				
			} catch (FilloException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return result;
			
		}
	
}

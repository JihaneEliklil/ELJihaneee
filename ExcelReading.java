package fst.hns;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelReading {
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<String> values=new ArrayList<>();
		Connection connection;
		Statement statement;
		
		try {
			
			InputStream input = new FileInputStream("PatientField.csv");
			POIFSFileSystem fs= new POIFSFileSystem(input);
			HSSFWorkbook wb=new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			Iterator rows =sheet.rowIterator();
			
			while(rows.hasNext()) {
				HSSFRow row=(HSSFRow) rows.next();
				Iterator cells= row.cellIterator();
				while(cells.hasNext()) {
					HSSFCell cell= (HSSFCell) cells.next();
					if(HSSFCell.CELL_TYPE_NUMERIC==cell.getCellType())
						values.add(Integer.toString((int) cell.getNumericCellValue()));
						else if (HSSFCell.CELL_TYPE_STRING == cell.getCellType()) 
							values.add(cell.getStringCellValue());
							
				}
				try {
				     Class.forName("com.mysql.jdbc.Driver").newInstance();
				     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_homenursingservice1","root","");
					 statement=connection.createStatement();
					 String sql=String.format("insert into patient(first_namep,last_namep,birth_datep,social_security_numberp,adressp,buildingp,floorp,door_numberp,access_codep,phone_numberp,referent_namep,referentphonep,keyhns,doctors_name,doctors_adress,doctors_phone,pharmacy_name,pharmacy_phone,laboratory_name,laboratory_phone,priority_order,pass_day,type_of_nursing_stuff,number_of_nursing_stuff,rattachement_sector) values ('%s','%s','%s',%s,'%s','%s',%s,%s,%s,%s,'%s',%s,%s,'%s','%s',%s,'%s','%s','%s',%s,'%s','%s','%s','%s','%s')"
							 , values.get(0), values.get(1), values.get(2), values.get(3), values.get(4), values.get(5), values.get(6), values.get(7), values.get(8), values.get(9), values.get(10), values.get(11), values.get(12), values.get(13), values.get(14), values.get(15), values.get(16), values.get(17), values.get(18), values.get(19), values.get(20), values.get(21), values.get(22), values.get(23), values.get(24));
				
				     int count=statement.executeUpdate(sql);
				     if(count>0) {
				    	 System.out.println("enregistrement effectue");
				     }
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
				
			
		}
    }

			
		
		




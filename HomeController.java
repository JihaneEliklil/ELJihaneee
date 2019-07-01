package fst.hns.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController{
	 //private static final long serialVersionUID = 1L;
	 @SuppressWarnings("rawtypes")
	 @RequestMapping(value="/addPatient",method = RequestMethod.GET)
	public void writeFile(){
		ArrayList<String> values=new ArrayList<>();
		Connection connection;
		Statement statement;
	//	String f=request.getParameter("file");
		try {
			
			InputStream input = new FileInputStream("PatientField.xlsx");
			OPCPackage fs=OPCPackage.open(input);

			XSSFWorkbook wb=new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator rows =sheet.rowIterator();
			
			while(rows.hasNext()) {
				values.clear();
				XSSFRow row=(XSSFRow) rows.next();
				Iterator cells= row.cellIterator();
				while(cells.hasNext()) {
					XSSFCell cell= (XSSFCell) cells.next();
					if(XSSFCell.CELL_TYPE_NUMERIC==cell.getCellType())
						if (DateUtil.isCellDateFormatted(cell)) {
							
							Date date = (Date) cell.getDateCellValue();				                    
		                    SimpleDateFormat dformat = new SimpleDateFormat(
		                            "yyyy-MM-dd");
		                    String val = dformat.format(date);
		                    values.add(val);
						} else {
							values.add(Integer.toString((int) cell.getNumericCellValue()));
						}
						
						else if (XSSFCell.CELL_TYPE_STRING == cell.getCellType()) 
							values.add(cell.getStringCellValue());
						else if(XSSFCell.CELL_TYPE_FORMULA==cell.getCellType())
							values.add(Integer.toString((int) cell.getNumericCellValue()));
							
				}
				try {
					/*
					 * String datebirth = values.get(2); SimpleDateFormat formatter = new
					 * SimpleDateFormat("yyyy-MM-dd"); // your template here Date dateStr1 = (Date)
					 * formatter.parse(datebirth); String db1=formatter.format(dateStr1); String
					 * datePass = values.get(21); Date dateStr2 = (Date) formatter.parse(datePass);
					 * String db2=formatter.format(dateStr2);
					 */

				     Class.forName("com.mysql.jdbc.Driver").newInstance();
				     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_homenursingservice1?verifyServerCertificate=false&useSSL=true","root","");
					 statement=connection.createStatement();
					 String sql=String.format("insert into patient(first_namep,last_namep,birth_datep,social_security_numberp,adressp,buildingp,floorp,door_numberp,access_codep,phone_numberp,referent_namep,referentphonep,keyhns,doctors_name,doctors_adress,doctors_phone,pharmacy_name,pharmacy_phone,laboratory_name,laboratory_phone,priority_order,pass_day,type_of_nursing_stuff,number_of_nursing_stuff,rattachement_sector) values ('%s','%s','%s',%s,'%s','%s',%s,%s,%s,%s,'%s',%s,%s,'%s','%s',%s,'%s','%s','%s',%s,'%s','%s','%s','%s','%s')"
							 , values.get(0), values.get(1),values.get(2) , values.get(3), values.get(4), values.get(5), values.get(6), values.get(7), values.get(8), values.get(9), values.get(10), values.get(11), values.get(12), values.get(13), values.get(14), values.get(15), values.get(16), values.get(17), values.get(18), values.get(19), values.get(20), values.get(21), values.get(22), values.get(23), values.get(24));
				
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
			} catch (InvalidFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		
	}
	
}

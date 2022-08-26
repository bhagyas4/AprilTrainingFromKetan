package ddt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	
	  @DataProvider(name="CSV")
	  public Iterator getDataFromExternalSourceCSV() throws IOException{
		  
		  Collection<String[]> retobjARR = getTestDataFromCSV("test\\resources\\data\\Datacsv.csv");
		return (retobjARR.iterator());
		  
	  }
	  
	  
	  //method for reading the CSV file 
	  
	  public static Collection<String[]> getTestDataFromCSV(String fileName) throws IOException {
		  String record;
		  
		  List<String[]> records = new ArrayList<String[]>();
		  
		  
		  
		  BufferedReader file = new BufferedReader(new FileReader(fileName));
		  while ((record = file.readLine()) != null) {
			  String fields[] = record.split(",");
			  records.add(fields);
		  }
		  file.close();
		  
			return records;
			  
		  }
}

		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	


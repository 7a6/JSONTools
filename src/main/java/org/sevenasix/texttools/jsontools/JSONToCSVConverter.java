package org.sevenasix.texttools.jsontools;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.json.*;

import org.sevenasix.texttools.TextConverter;

public class JSONToCSVConverter implements TextConverter{

	InputStream is = null;
	public boolean convert() {
		// TODO Auto-generated method stub
		
		
		return false;
	}



	public void setOutputStream(OutputStream os) {
		
		
	}



	public void setInputStream(InputStream is) {
		
		this.is = is;
	}
	
	public void createJSONReader()
	{

		JsonReader reader = Json.createReader(new InputStreamReader(is));
		JsonStructure jsonst = reader.read();
		
	}
	
	

}

package org.sevenasix.texttools;

import java.io.InputStream;
import java.io.OutputStream;

public interface TextConverter {
	
	public boolean convert();
	public void setOutputStream(OutputStream os);
	public void setInputStream(InputStream is);

}

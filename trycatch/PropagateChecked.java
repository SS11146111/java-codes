package com.sangita.trycatch;

import java.io.IOException;

public class PropagateChecked {

	void m() throws IOException
	{  
	    throw new IOException("device error");//checked exception  
	}  
	  
	void n() throws IOException
	{  
	   m();  
	}  
}

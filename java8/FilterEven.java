package com.sangita.java8;
import java.util.*;

public class FilterEven {

	List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,1,3,4,5,6,7,8));
	
	public void filterEven()
	{
		List<Integer> evenList = list.stream().filter(x->x%2==0).toList();
		evenList.forEach(e->System.out.print(e+" "));
	}
	
}

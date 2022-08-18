package opps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterrator {
	void itrt()
	{
		List<String> v = new ArrayList<String>();
		v.add("hello");
		v.add("beautiful");
		v.add("world");
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 iterrator obj = new iterrator();
 obj.itrt();
	}

}



	
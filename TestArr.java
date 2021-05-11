package tema14;

public class TestArr implements Comparable<TestArr>{
	
	int val = (int) (Math.random()*100 + 1);

	@Override
	public int compareTo(TestArr o) {
		if(this.val<o.val)
			return -1;
		else if(this.val>o.val)
			return 1;
		
		return 0;
	}

}

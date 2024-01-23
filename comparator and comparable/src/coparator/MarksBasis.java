package coparator;

import java.util.Comparator;

public class MarksBasis implements Comparator<A> {

	@Override
	public int compare(A a1, A a2) {
		
		return (a1.getMarks()-a2.getMarks());
	}

}

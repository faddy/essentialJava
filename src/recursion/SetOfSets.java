package recursion;

import java.util.*;

/**
 * @author fahad
 * Generate all subsets of a given set
 */
public class SetOfSets {
	
	public static void main(String[] args){
		
		ArrayList orig = new ArrayList();
		orig.add(1); orig.add(2); orig.add(3);
		ArrayList<ArrayList> master = new ArrayList<ArrayList>();
		master.add(new ArrayList());
		
		setOfSetsHelper(orig, master);
		
		for (ArrayList<Integer> set : master){
			StringBuilder s = new StringBuilder("(");
			for (Integer i : set){
				s.append(i);
				s.append(",");
			}
			s.append(")");
			System.out.println(s);
		}
	}
	
	public static void setOfSetsHelper(ArrayList list, ArrayList<ArrayList> master){
		System.out.println(list + ", " + master);
		
		if (list.size() == 0) return;
		
		int item =  (Integer) list.remove(0);
		ArrayList temp = new ArrayList();
		
		for (ArrayList l : master){
			ArrayList new_l = (ArrayList) l.clone();
			new_l.add(item);
			temp.add(new_l);
		}
		
		master.addAll(temp);
		
		setOfSetsHelper(list, master);
		
	}
}

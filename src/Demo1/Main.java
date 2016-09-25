package Demo1;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int personNum = cin.nextInt();
		List<Integer> persons = new LinkedList<>();
		for(int i = 1 ; i <= personNum ; i++ ){
			persons.add(i);
		}
		persons = leave(persons);
		System.out.println(persons);
	}
	public static List<Integer> leave(List<Integer> persons){
		Iterator<Integer> it = persons.iterator();
		int i = 0;
		while(it.hasNext()){
			i++;
			it.next();
			if(i == 3){
				i = 0;
				it.remove();
			}
		}
		System.out.println(persons.size());
		if(persons.size() == 2) {
			persons.remove(1);
		}
		if(persons.size() > 2) {leave(persons);}
		return persons;
	}
}

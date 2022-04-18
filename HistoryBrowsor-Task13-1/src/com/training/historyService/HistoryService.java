package com.training.historyService;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.training.history.History;

public class HistoryService {
	
	
		private LinkedList <History> list=new LinkedList<>();

		public boolean add(History detail) {
			
			return this.list.add(detail);
		}
		
		
		public void recenturl(){
			
			
			//using for loop
/*			if(list.size()>5) {
				int num=list.size()-5;
		for(int i=list.size()-1;i>=num;i--) {
			System.out.println(list.get(i));
		}
			
			}
			
			
			
*/				//using ListIterator
			/*ListIterator<History> itr= list.listIterator();

			while (itr.hasNext()) {
				itr.next();
			}
			int i=0;
			while(itr.hasPrevious()) {
				if(i!=5) {
					System.out.println(itr.previous());
					i++;
				}
				else {
					break;
				}
			}*/
			
			
			
			ListIterator<History>itr= list.listIterator(list.size());
			int i=0;
			while(itr.hasPrevious()) {
				if(i!=5) {
					System.out.println(itr.previous());
					i++;
				}
				else {
					break;
				}
			}
			
			
			
			
		}
}



import java.util.LinkedList;
import java.util.Scanner;

public class LinkList {
	public LinkedList<Integer> sortLinkedListUsingInsertion(LinkedList<Integer> myArray){
		int n = myArray.size();
        for (int i = 1; i < n; ++i) {
            int key = myArray.get(i);
            int j = i - 1;
  
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && myArray.get(j) > key) {
            	myArray.set(j+1, myArray.get(j));
                
                j = j - 1;
            }
            myArray.set(j+1, key);
            
        }
        
        return myArray;

	}
	
	public LinkedList<Integer> sortLinkedListUsingBubble(LinkedList<Integer> link){
		int temp = 0;
		
		for (int i = 0; i < link.size(); i++) {
			for (int j = 1; j < link.size(); j++) {
				if(link.get(j-1)>link.get(j)) {  // eg. 0th element > 1st element, then it will be swapped
					temp = link.get(j-1);   // swapping element storing in temp
					link.set(j-1, link.get(j));  // eg. swap the smaller element
					link.set(j, temp); // swap the bigger element, which have stored in temp
				}
			}
		}
		
		return link;
	}

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<Integer>();
		LinkList linkedlist = new LinkList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the linked list");
		
		int len = sc.nextInt();
		System.out.println("Enter the elemnt and press enter.");
		for (int i = 0; i < len; i++) {
			link.add(sc.nextInt());
		}
		
		System.out.println("1.Using Bubble Sort\t 2.Using Insertion Sort.");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: {
			link =linkedlist.sortLinkedListUsingBubble(link);
			System.out.println("After sorting, the array is");
			for (int i = 0; i < link.size(); i++) {
				System.out.print(link.get(i)+",\t");
			}
			break;
		}
			case 2:
				link =linkedlist.sortLinkedListUsingInsertion(link);
				System.out.println("After sorting, the array is");
				for (int i = 0; i < link.size(); i++) {
					System.out.print(link.get(i)+",\t");
				}
		
		default:
			break;
		}
		
	}
}

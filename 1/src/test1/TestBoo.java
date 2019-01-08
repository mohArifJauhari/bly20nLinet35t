package test1;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TestBoo {
	// public void run() {
	// synchronized (this) {
	// try {
	// wait(5000);
	// } catch (InterruptedException ie) {
	// }
	// }
	// }
	//
	// public static void main(String[] args) {
	// // HashSet myMap = new HashSet();
	// // String s1 = new String("das");
	// // String s2 = new String("das");
	// // NameBean s3 = new NameBean("abcdef");
	// // NameBean s4 = new NameBean("abcdef");
	// //
	// // myMap.add(s1);
	// // myMap.add(s2);
	// // myMap.add(s3);
	// // myMap.add(s4);
	// //
	// // System.out.println(myMap);
	//
	// //
	// // NavigableMap <Integer, String> nM = new ConcurrentSkipListMap<Integer,
	// // String>();
	// // nM.put(4, "Wednesday");
	// // nM.put(5, "Thursday");
	// // nM.put(6, "Friday");
	// // nM.put(1, "Sunday");
	// // nM.put(2, "Monday");
	// // System.out.print(nM.ceilingKey(3));
	//
	//// TestBoo a1 = new TestBoo();
	//// long startTime = System.currentTimeMillis();
	//// a1.start();
	//// try {
	//// a1.join(6000);
	//// } catch (InterruptedException ie) {
	//// }
	//// System.out.print(System.currentTimeMillis() - startTime);
	// }
	// B1 b = new B1();
	//
	// public static void main(String argv[]) throws Exception {
	// TestBoo t = new TestBoo();
	// Thread t1 = new Thread(t, "t1");
	// Thread t2 = new Thread(t, "t2");
	// t1.start();
	// t2.start();
	// }
	//
	// public void run() {
	// if (Thread.currentThread().getName().equals("t1")) {
	// b.printName();
	// } else {
	// b.printValue();
	// }
	// }

	// int x = 0, y = 0;
	//
	// int addX() {
	// x++;
	// return x;
	// }
	//
	// int addY() {
	// y++;
	// return y;
	// }
	//
	// public void run() {
	// for (int i = 0; i < 10; i++)
	// System.out.println(addX() + " " + addY());
	// }
	Node startNode;

	public static void main(String args[]) {
		 addNode(new Node(10));
	        addNode(new Node(20));
	        addNode(new Node(30));
	        addNode(new Node(40));
	        addNode(new Node(50));
	        addNode(new Node(60));
	        addNode(new Node(70));
	}

	private static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	static Node findNthNodeFromLast(Node head, int N) {
		if(N <=0 || head==null){
            return new Node(-1);
        }
 
        Node ptr1 = head;
         
        
        for(Node ptr2=head; ptr2!=null; ptr2 = ptr2.getNext()){
            N--; 
            if(N<0){
                ptr1 = ptr1.getNext();
            }
        }
         
        if(N<=0){
            return new Node(ptr1.getValue());
        }
         
        
		return new Node(-1);;
	}

	private void addNode(Node n) {
		if (startNode != null) {
			Node tempNode = startNode;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(n);
		} else {
			this.startNode = n;
		}

	}
	
	  private void printLinkList() {
	        Node tempNode = startNode;
	        while(tempNode!=null){
	            System.out.print(tempNode.getValue() + " ");
	            tempNode = tempNode.getNext();
	        }
	        System.out.println("\n============================================");
	    }
}
//
// interface BooInterface {
// final class BooClass {
// static int booInt = 10;
// }
// }
//
// abstract class A {
// int i;
//
// abstract void display();
// }
//
// class B extends A {
// int j;
//
// void display() {
// System.out.println(j);
// }
// }
//
// class NameBean {
// private String str;
//
// NameBean(String str) {
// this.str = str;
// }
//
// public String toString() {
// return str;
// }
// }
//
// class B1 {
// public static synchronized void printName() {
// try {
// System.out.println("printName");
// Thread.sleep(5 * 1000);
// } catch (InterruptedException e) {
// }
// }
//
// public synchronized void printValue() {
// System.out.println("printValue");
// }
// }

// class Test extends Thread {
// B b = new B();
//
// public static void main(String argv[]) throws Exception {
// Test t = new Test();
// Thread t1 = new Thread(t, "t1");
// Thread t2 = new Thread(t, "t2");
// t1.start();
// t2.start();
// }
//
// public void run() {
// if (Thread.currentThread().getName().equals("t1")) {
// b.printName();
// } else {
// b.printValue();
// }
// }
// }
//
// class s1 implements Runnable {
// int x = 0, y = 0;
//
// int addX() {
// x++;
// return x;
// }
//
// int addY() {
// y++;
// return y;
// }
//
// public void run() {
// for (int i = 0; i < 10; i++)
// System.out.println(addX() + " " + addY());
// }
//
// public static void main(String args[]) {
// s1 run1 = new s1();
// s1 run2 = new s1();
// Thread t1 = new Thread(run1);
// Thread t2 = new Thread(run2);
// t1.start();
// t2.start();
// }
// }

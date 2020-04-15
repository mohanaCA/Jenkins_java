package testone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Duplicateelementsinjavaarray {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr= {"india","pak","pak","india","usa"};
int arrsize=arr.length;
for(int i=0;i<arrsize;i++) {
	for(int j=i+1;j<arrsize;j++) {
		if(arr[i].equals(arr[j])) {
			System.out.println("*****" + arr[i]);
		}}}
//		}}
	
	
//HashSet
	Set<String> duplicatename=new HashSet<String>();
	for(String name:arr) {
		if(duplicatename.add(name)==false) {
			System.out.println(name);
		}
			
}
	
	HashMap<String,Integer>dupnamehash=new HashMap<String,Integer>();
	for(String name_hash:arr) {
		if(dupnamehash.containsKey(name_hash)) {
			dupnamehash.put(name_hash, dupnamehash.get(name_hash)+1);
		}else {
			dupnamehash.put(name_hash, 1)	;
			}
	}
	Set<String> dupliele=dupnamehash.keySet();
	for(String print:dupliele) {
		if(dupnamehash.get(print)>1) {
			System.out.println(print);
		}
	}
	}
}
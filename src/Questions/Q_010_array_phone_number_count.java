package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_010_array_phone_number_count {

	public static void main(String[] args) {
		int array[] = {987654321,123445566,983973827,323223434,100000001,100001};
		
		HashMap <Character, Integer> hm = new HashMap<>();
		for(int v:array)
		{
			String s = String.valueOf(v);
			for(int i=0;i<s.length();i++)
			{
				switch(s.charAt(i))
				{
				case '0' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				case '1' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '2' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '3' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '4' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '5' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '6' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '7' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '8' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				case '9' :  if(hm.containsKey(s.charAt(i))==false)
				{
					hm.put(s.charAt(i), 1);
				}
				else {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
					break;
				}
			}
			
		}
		
		System.out.println(hm);
		
	}
}

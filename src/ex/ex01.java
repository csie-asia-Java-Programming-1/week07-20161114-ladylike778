package ex;
/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[]=new int[n];
		float sum=0;
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();	
		    sum=sum+data[i];
		}sum=sum/n;
		System.out.println(var(sum,data)/n);

	}
	public static float var (float v, int data[]){
		float sum=0;
		for(int i=0;i<data.length;i++){
			
			sum=sum+((v-data[i])*(v-data[i]));
			
		}
		
		
	return sum;}



}
	



package com.johir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Chef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			long N=sc.nextLong();
			long K=sc.nextLong();
			ArrayList<Long> A=new ArrayList<Long>();
			ArrayList<Long> B=new ArrayList<Long>();
			long max=0;
			Map<Long, Long> AB=new HashMap<Long,Long>();
			for(int i=0;i<N;i++)
				A.add(sc.nextLong());
			for(int j=0;j<N;j++)
				B.add(sc.nextLong());
			Long[] Ar=(Long[]) A.toArray(new Long[A.size()]);
			Long[] Br=(Long[]) B.toArray(new Long[B.size()]);
			for (int l=0;l<Ar.length;l++) {
				long price=(K/(long)Ar[l])*(long)Br[l];
				if(max<price)
					max=price;
			}
			System.out.println(max);
		}

	}

}

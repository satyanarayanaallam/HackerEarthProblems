package com.hackerearth.application.datastructures.disjoint;

import java.util.ArrayList;
import java.util.Collections;

/*
 * You are given number of nodes, N, and number of edges, M, of a undirected connected graph. After adding each edge, print the size of all the connected components (in increasing order).

Input:
First line contains two integers, N and M, number of nodes and number of edges.
Next M lines contains two integers each, X and Y, denoting that there is an edge between X and Y.

Output:
For each edge, print the size of all the connected components (in increasing order) after adding that edge.

Constraints:
 1<=N<=10^3
 1<=M<=N-1
 1<=X,Y<=N
 
 Sample Input:
 5 4
 1 2
 3 4
 4 5
 1 3
 
 Sample Output:
 1 1 1 2
 1 2 2
 2 3
 5
 * */
@org.springframework.stereotype.Component
public class DisjointSetUnion {
	
	public ArrayList<Integer>[] getSizeOfConnectedComponents(int n,int m,Component[] components) {
		ArrayList<Integer>[] arrays=new ArrayList[m];
		int[] a=new int[n+1];
		int[] size=new int[n+1]; 
		for(int i=1;i<=n;i++) {
			a[i]=i;
			size[i]=1;
		}
		for(int i=0;i<m;i++) {
			ArrayList<Integer> size1=new ArrayList<Integer>();
			weightedUnion(a,size,components[i].getX(),components[i].getY());
			for(int j=1;j<=n;j++) {
				if(size[j]>0) {
					 size1.add(size[j]);
					//System.out.print( size[j]+" ");
				}
			}
			Collections.sort(size1);
			arrays[i]=size1;
		}
		return arrays;
	}
	
	private boolean find(int[] arr, int a, int b) {
		if (root(arr, a) == root(arr, b)) {
			return true;
		} else {
			return false;
		}
	}

	private int root(int[] a, int i) {
		while (a[i] != i) {
			a[i] = a[a[i]];
			i = a[i];
		}
		return i;
	}

	private void weightedUnion(int[] arr, int[] size, int a, int b) {
		int roota = root(arr, a);
		int rootb = root(arr, b);
		if (size[roota] > size[rootb]) {
			arr[rootb] = arr[roota];
			size[roota] = size[roota] + size[rootb];
			size[rootb] = 0;
		} else {
			arr[roota] = arr[rootb];
			size[rootb] = size[rootb] + size[roota];
			size[roota] = 0;
		}
	}
}

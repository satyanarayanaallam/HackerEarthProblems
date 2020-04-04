package com.hackerearth.application.datastructures.trie;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

class TrieNode{
	int priority;
	TrieNode[] child=new TrieNode[26];
	boolean isEndOfWord;
	TrieNode(int priority) {
		this.isEndOfWord=false;
		this.priority=priority;
	}
}
@Component
public class SearchEngine {
	
	public ArrayList<Integer> getMaxPossibleMatchWeights(int n,int q,DictionaryEntry[] entries,String[] searches ){
		ArrayList<Integer> list=new ArrayList<Integer>();
		TrieNode root=new TrieNode(0);
		for(int i=0;i<n;i++) {
			insert(entries[i].getText(),root,entries[i].getPriority());
		}
		for(int i=0;i<q;i++) {
			list.add(findMaximum(searches[i],root));
		}
		return list;
	}
	private void insert(String key,TrieNode root,int priority) {
		char[] ch=key.toCharArray();
		TrieNode p=root;
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-'a';
			if(p.child[index]==null) {
				p.child[index]=new TrieNode(priority);
			}
			if(p.child[index].priority<priority) {
				p.child[index].priority=priority;
			}
			p=p.child[index];
		}
		p.isEndOfWord=true;
	}
	 private int findMaximum(String key,TrieNode root) {
		char[] ch=key.toCharArray();
		TrieNode p=root;
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-'a';
			if(p.child[index]==null) {
				return -1;
			}
			p=p.child[index];
		}
		return p.priority;
	}
}

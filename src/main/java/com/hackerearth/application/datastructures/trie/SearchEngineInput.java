package com.hackerearth.application.datastructures.trie;

import org.springframework.stereotype.Component;

@Component
public class SearchEngineInput {
	private int n;
	private int q;
	private DictionaryEntry[] entries;
	private String[] searches;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	public DictionaryEntry[] getEntries() {
		return entries;
	}
	public void setEntries(DictionaryEntry[] entries) {
		this.entries = entries;
	}
	public String[] getSearches() {
		return searches;
	}
	public void setSearches(String[] searches) {
		this.searches = searches;
	}
	
}

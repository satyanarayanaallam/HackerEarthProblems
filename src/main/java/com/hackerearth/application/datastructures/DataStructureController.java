package com.hackerearth.application.datastructures;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hackerearth.application.datastructures.disjoint.Disjoint;
import com.hackerearth.application.datastructures.disjoint.DisjointSetUnion;
import com.hackerearth.application.datastructures.trie.SearchEngine;
import com.hackerearth.application.datastructures.trie.SearchEngineInput;

@RestController
public class DataStructureController {
	
	@Autowired
	private DisjointSetUnion disjointSetUnion;
	
	@Autowired
	private SearchEngine searchEngine;
	
	@RequestMapping(value = "hackerearth/practice/datastructures/disjoint/getSizeOfConnectedComponents", 
			method = RequestMethod.GET, headers = "Accept=application/json")
    public ArrayList<Integer>[] getSizeOfConnectedComponents(@RequestBody Disjoint disjoint){
		
		return disjointSetUnion.getSizeOfConnectedComponents(disjoint.getN(), disjoint.getM(), 
				disjoint.getComponents());
    }	
	
	@RequestMapping(value="hackerearth/practice/datastructures/trie/getMaxPossibleMatchWeights",
			method=RequestMethod.GET,headers="Accept=application/json")
	public ArrayList<Integer> getMaxPossibleMatchWeights(@RequestBody SearchEngineInput searchInput){
		return searchEngine.getMaxPossibleMatchWeights(searchInput.getN(), searchInput.getQ(),
				searchInput.getEntries(),searchInput.getSearches());
	}
}

package com.hackerearth.application.datastructures.disjoint;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@org.springframework.stereotype.Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "n",
    "m",
    "components"
})
public class Disjoint {

	@JsonProperty("n")
	int n;
	
	@JsonProperty("m")
	int m;
	
	@JsonProperty("components")
	Component[] components;
	
	@JsonProperty("n")
	public int getN() {
		return n;
	}
	
	@JsonProperty("n")
	public void setN(int n) {
		this.n = n;
	}
	
	@JsonProperty("m")
	public int getM() {
		return m;
	}
	
	@JsonProperty("m")
	public void setM(int m) {
		this.m = m;
	}
	
	@JsonProperty("components")
	public Component[] getComponents() {
		return components;
	}
	
	@JsonProperty("components")
	public void setComponents(Component[] components) {
		this.components = components;
	}
	
}

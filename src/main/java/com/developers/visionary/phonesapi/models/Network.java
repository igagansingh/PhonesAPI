package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Network {
	public String technology;
	public String bands2g;
	public String gprs;
	public String edge;
	
	@Override
	public String toString() {
		return "Network [technology=" + technology + ", bands2g=" + bands2g + ", gprs=" + gprs + ", edge=" + edge + "]";
	}
}

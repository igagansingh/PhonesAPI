package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Battery {
	public String type;
	public String talkTime;
	
	@Override
	public String toString() {
		return "Battery [type=" + type + ", talkTime=" + talkTime + "]";
	}
}

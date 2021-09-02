package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Platform {
	public String os;
	public String chipset;
	public String cpu;

	@Override
	public String toString() {
		return "Platform [os=" + os + ", chipset=" + chipset + ", cpu=" + cpu + "]";
	}
}

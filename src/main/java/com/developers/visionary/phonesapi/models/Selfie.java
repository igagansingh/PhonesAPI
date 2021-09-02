package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Selfie {
	public String single;
	public String video;
	
	@Override
	public String toString() {
		return "Selfie [single=" + single + ", video=" + video + "]";
	}
}

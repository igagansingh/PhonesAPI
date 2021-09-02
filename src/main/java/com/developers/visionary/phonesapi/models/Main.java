package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
	public String single;
	public String video;
	
	@Override
	public String toString() {
		return "Main [single=" + single + ", video=" + video + "]";
	}
}

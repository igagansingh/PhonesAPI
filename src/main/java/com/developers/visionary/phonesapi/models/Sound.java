package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sound {
	public String loudspeaker;
	public String jack;
	
	@Override
	public String toString() {
		return "Sound [loudspeaker=" + loudspeaker + ", jack=" + jack + "]";
	}
}

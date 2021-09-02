package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Display {
	public String Resolution;
    public String Type;
    public String Size;
    
	@Override
	public String toString() {
		return "Display [Resolution=" + Resolution + ", Type=" + Type + ", Size=" + Size + "]";
	}
}

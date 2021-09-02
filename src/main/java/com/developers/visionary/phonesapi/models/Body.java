package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Body {
    public String dimensions;
    public String weight;
    public String sim;
    public String misc;
    
    @Override
	public String toString() {
		return "Body [dimensions=" + dimensions + ", weight=" + weight + ", sim=" + sim + ", misc=" + misc + "]";
	}
}

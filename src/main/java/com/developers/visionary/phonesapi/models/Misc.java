package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Misc {
	public String colors;
	public String price;

	@Override
	public String toString() {
		return "Misc [colors=" + colors + ", price=" + price + "]";
	}
}

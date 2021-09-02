package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Images {
	public String info;
	public String src;
	
	@Override
	public String toString() {
		return "Images [info=" + info + ", src=" + src + "]";
	}
}

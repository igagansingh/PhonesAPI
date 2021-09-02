package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Features {
	public String sensors;

	@Override
	public String toString() {
		return "Features [sensors=" + sensors + "]";
	}
}

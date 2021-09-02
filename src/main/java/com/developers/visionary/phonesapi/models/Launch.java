package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Launch {
	public String announced;
	public String status;
	
	@Override
	public String toString() {
		return "Launch [announced=" + announced + ", status=" + status + "]";
	}
}

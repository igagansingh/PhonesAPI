package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Memory {
	public String cardSlot;
	public String internal;
	
	@Override
	public String toString() {
		return "Memory [cardSlot=" + cardSlot + ", internal=" + internal + "]";
	}
}

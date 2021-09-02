package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Camera {
	public Main main;
	public Selfie selfie;
    
    @Override
	public String toString() {
		return "Camera [main=" + main + ", selfie=" + selfie + "]";
	}
}

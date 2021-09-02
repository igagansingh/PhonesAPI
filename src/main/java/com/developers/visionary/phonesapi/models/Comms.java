package com.developers.visionary.phonesapi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comms {
	public String wlan;
    public String bluetooth;
    public String gps;
    public String nfc;
    public String radio;
    public String usb;
    
	@Override
	public String toString() {
		return "Comms [wlan=" + wlan + ", bluetooth=" + bluetooth + ", gps=" + gps + ", nfc=" + nfc + ", radio=" + radio
				+ ", usb=" + usb + "]";
	}
}

package com.developers.visionary.phonesapi.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "phones")
public class Phone {
	@Id
	private String id;
	private String company;
	@Indexed(unique = true) 
	private String model;
	private String name;
	private List<Images> images;
	private Network network;
	private Launch launch;
	private Body body;
	private Display display;
	private Platform platform;
	private Memory memory;
	private Camera camera;
    private Sound sound;
    private Comms comms;
    private Features features;
    private Battery battery;
    private Misc misc;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public Launch getLaunch() {
		return launch;
	}

	public void setLaunch(Launch launch) {
		this.launch = launch;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Sound getSound() {
		return sound;
	}

	public void setSound(Sound sound) {
		this.sound = sound;
	}

	public Comms getComms() {
		return comms;
	}

	public void setComms(Comms comms) {
		this.comms = comms;
	}

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Misc getMisc() {
		return misc;
	}

	public void setMisc(Misc misc) {
		this.misc = misc;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", company=" + company + ", model=" + model + ", name=" + name + ", images=" + images
				+ ", network=" + network + ", launch=" + launch + ", body=" + body + ", display=" + display
				+ ", platform=" + platform + ", memory=" + memory + ", camera=" + camera + ", sound=" + sound
				+ ", comms=" + comms + ", features=" + features + ", battery=" + battery + ", misc=" + misc + "]";
	}
}

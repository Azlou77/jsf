package com.example.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ViewScoped
public class SaisieOptions implements Serializable {
	private String software;
	private String os;
	private List<String> softwareItems = Arrays.asList("Photoshop", "Visual Studio Code", "Eclipse", "Autre");
	private List<String> osItems = Arrays.asList("MacOS", "Windows", "Linux", "Autre");
	
	public String getsoftware() {
		return software;
	}

	public void setsoftware(String software) {
		this.software = software;
	}

	public List<String> getSoftwareItems() {
		return softwareItems;
	}
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public List<String> getOsItems() {
		return osItems;
	}

	public void valider() {
		System.out.println("os sélectionnée : " + os);
	}
}

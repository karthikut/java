package com.xworkz.photography.dto;

public class CameraDTO {
	
	private int cameraId;
	private int cost;
	private String type;
	private String name;
	private int pixels;
	
	public CameraDTO() {
		
		System.out.println("CREATE" + getClass().getSimpleName());
	}
	
	

	@Override
	public String toString() {
		return "CameraDTO [cameraId=" + cameraId + ", cost=" + cost + ", type=" + type + ", name=" + name + ", pixels="
				+ pixels + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cameraId;
		result = prime * result + cost;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pixels;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraDTO other = (CameraDTO) obj;
		if (cameraId != other.cameraId)
			return false;
		if (cost != other.cost)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pixels != other.pixels)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public int getCameraId() {
		return cameraId;
	}

	public void setCameraId(int cameraId) {
		this.cameraId = cameraId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}

	
	

}

package gpcoder.java.exception.overide;

import java.io.IOException;

public class Vehicle {
	private String name;
	private int speed;

	public Vehicle(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	public Vehicle() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
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
		Vehicle other = (Vehicle) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", speed=" + speed + "]";
	}

	public void run() throws IOException {
		System.out.println("Vehicle is running...");
	}
}

package Task_2;

public class Helm {

	enum Material {
		LEATHER, 
		ALCANTARA
	};
	
	private float diameter;
	Material material;
	
	
	public Helm(float diameter, Material material) {
		//super();
		this.diameter = diameter;
		this.material = material;
	}

	public float getDiameter() {
		return diameter;
	}

	public Material getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Helm [diameter=" + diameter + ", material=" + material + "]";
	}

	

	

	
	
	
	
}


public class Player {

	private String name;
	private int age;
	private String featureName;
	private String featureDesc;
	private String featureDistance;

	public Player(String name, int age, String featureName, String featureDesc, String featureDistance) {
		this.name = name;
		this.setAge(age);
		this.featureName = featureName;
		this.featureDesc = featureDesc;
		this.featureDistance = featureDistance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getfeatureDesc() {
		return featureDesc;
	}

	public void featureDesce(String featureDesc) {
		this.featureDesc = featureDesc;
	}

	public String getFeatureDistance() {
		return featureDistance;
	}

	public void setFeatureDistance(String featureDistance) {
		this.featureDistance = featureDistance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [name:" + name + ", age:" + age + ", featureName:" + featureName + ", featureDesc:" + featureDesc
				+ ", featureDistance:" + featureDistance + "]";
	}

}

import java.util.List;

public class MobBrand {

	private String name;	
	private List<Mobile> mobileList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
	
	public MobBrand(String name, List<Mobile> mobileList) {
		super();
		this.name = name;
		this.mobileList = mobileList;
	}
	
	
}

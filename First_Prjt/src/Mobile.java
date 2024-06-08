import java.util.Date;

public class Mobile {
	
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;  
	private Date launchedDate;
	
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getLaunchedDate() {
		return launchedDate;
	}
	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	} 

	public static Mobile createMobile(String detail) 
		
		public Boolean removeMobileFromMobileBrand(String referenceId)
		
		public void displayMobiles()
	}
}

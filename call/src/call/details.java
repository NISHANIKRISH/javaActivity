package call;

public class details {
	int customerId;
    String phoneNo;
    String feedBackDescription;
    int rating;
	public details(int customerId, String phoneNo, String feedBackDescription,
			int rating) {
		super();
		this.customerId = customerId;
		this.phoneNo = phoneNo;
		this.feedBackDescription = feedBackDescription;
		this.rating = rating;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getFeedBackDescription() {
		return feedBackDescription;
	}
	public void setFeedBackDescription(String feedBackDescription) {
		this.feedBackDescription = feedBackDescription;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
public String toString(){
	return "details[customerId="+customerId+",phoneNo="+phoneNo+",feedBackDescription="+feedBackDescription+",rating="+rating+"]";
}
}

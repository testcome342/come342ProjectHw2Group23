package homework2;

public class Campaign implements AssignStaffUI
{	private int campaignID; 
	private String campaignTitle;
	private double estimatedCost;

	public Campaign(String ctitle,double eCost ) {
		campaignTitle=ctitle;
		estimatedCost=eCost;
	}

	public int getCampaignID(){
		return campaignID;
	}
	public void setCampignID(int campaignID){
		this.campaignID=campaignID;
	}
	
	public String getCampaignTitle(){
		return campaignTitle;
	}
	public void setCampignTitle(String campaignTitle){
		this.campaignTitle=campaignTitle;
	}

	public double getEstimatedCost(){
		return estimatedCost;
	}
	public void setCampignTitle(double estimatedCost){
		this.estimatedCost=estimatedCost;
	}

	public void createCampaignTeam(){
	
}

	@Override
	public void startInterface() {
		
	}

	@Override
	public void selectStaff() {
		
	}


}
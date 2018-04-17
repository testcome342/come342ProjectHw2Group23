package homework2;
//ahsenavsar 201431002
public  class Staff implements AssignStaffUI
{
	private int staffID;
	private String staffName;
	private String staffSurname;


	public Staff(int staffID, String staffName, String staffSurname) {
		
		staffID=staffID;
		staffName=staffName;
		staffSurname=staffSurname;
	}

	public int getStaffID(){
		return staffID; 
	}
	public void setStaffID(int staffID){
		this.staffID=staffID;
	}



	public String getStaffName(){
		return staffName;
	}
	public void setStaffName(String staffName){
		this.staffName=staffName;
	}
	
	
	public String getStaffSurname(){
		return staffSurname;

	}
	public void setStaffSurname(String sSurname){
		this.staffSurname=sSurname;
	}


	public void assignStaff(){

	
}

	@Override
	public void startInterface() {
		
	}

	@Override
	public void selectStaff() {
		
	}

	@Override
	public void createCampaignTeam() {
		
		
	}


}
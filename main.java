package homework2;

public class main {

	public static void main(final String[] args) {
		
		
		
		Staff worker1=new Staff();
		worker1.setStaffID(199431001);
		System.out.println(worker1.getStaffID());
		worker1.setStaffName("Sumeyye");
		System.out.println(worker1.getStaffName());
		worker1.setStaffSurname("Arslan");
		System.out.println(worker1.getStaffSurname());
		
		Staff worker2=new Staff();
		worker2.setStaffID(201431002);
		System.out.println(worker2.getStaffID());
		worker2.setStaffName("Ahsen");
		System.out.println(worker2.getStaffName());
		worker2.setStaffSurname("Avsar");
		System.out.println(worker2.getStaffSurname());

		Staff worker3=new Staff();
		worker3.setStaffID(201531075);
		System.out.println(worker3.getStaffID());
		worker3.setStaffName("Tugba");
		System.out.println(worker3.getStaffName());
		worker3.setStaffSurname("Ayvaz");
		System.out.println(worker3.getStaffSurname());


	}

}

package pharma.medicoz.service;

import java.util.List;

import pharma.medicoz.pojo.MedicinePojo;
import pharma.medicoz.pojo.UserLoginPojo;



public interface MedicineService 
{
  
    MedicinePojo save( MedicinePojo medicozPojo);
    
    
    
	List<MedicinePojo> list();
	
	MedicinePojo get(int serialnumber);
	
	void update(MedicinePojo medicozPojo);
	
	void delete(int serialnumber);

	List<MedicinePojo> findByMedName(String medicinename);
	
	

	

	//List<MedicinePojo> list1();
	
	//MedicinePojo findMedicines(int medname);
	


    
}


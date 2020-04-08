package pharma.medicoz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pharma.medicoz.entity.Medicine;
import pharma.medicoz.entity.UserLogin;
import pharma.medicoz.pojo.MedicinePojo;
import pharma.medicoz.pojo.UserLoginPojo;
import pharma.medicoz.repository.MedicineRepository;
import pharma.medicoz.repository.UserLoginRepository;



@Service("medicozService")
@Transactional
public class MedicineServiceImpl implements MedicineService
{
	@Autowired
	private MedicineRepository medicozRepository;
	
	@Autowired
	private UserLoginRepository medicozLoginDetailRepository;
	
	

	@Override
	public MedicinePojo save(MedicinePojo medicozPojo) 
	{
		Medicine medicoz=new Medicine();
		medicoz.setSerialnumber(medicozPojo.getSerialnumber());
		medicoz.setMedicinename(medicozPojo.getMedicinename());
		medicoz.setPrice(medicozPojo.getPrice());
		medicoz.setType(medicozPojo.getType());
		medicoz.setQuantity(medicozPojo.getQuantity());
		medicoz.setExpdate(medicozPojo.getExpdate());
		medicozRepository.save(medicoz);
		
		return null;
	}

	
	@Override
	public List<MedicinePojo> list() 
	{
		List<MedicinePojo> medicozPojoList=new ArrayList<MedicinePojo>();
		List<Medicine> medicozList=medicozRepository.findAll();
		for(Medicine medicoz : medicozList)
		{
			MedicinePojo medicozPojo=new MedicinePojo();
			medicozPojo.setSerialnumber(medicoz.getSerialnumber());
			medicozPojo.setMedicinename(medicoz.getMedicinename());
			medicozPojo.setPrice(medicoz.getPrice());
			medicozPojo.setType(medicoz.getType());
			medicozPojo.setQuantity(medicoz.getQuantity());
			medicozPojo.setExpdate(medicoz.getExpdate());
			medicozPojoList.add(medicozPojo);
		}
		return medicozPojoList;
	}
	@Override
	public void update(MedicinePojo medicozPojo) 
	{
		
		Medicine medicoz=new Medicine();
		medicoz.setSerialnumber(medicozPojo.getSerialnumber());
		medicoz.setMedicinename(medicozPojo.getMedicinename());
		medicoz.setPrice(medicozPojo.getPrice());
		medicoz.setType(medicozPojo.getType());
		medicoz.setQuantity(medicozPojo.getQuantity());
		medicoz.setExpdate(medicozPojo.getExpdate());
		medicozRepository.save(medicoz);
			
	}

	@Override
	public void delete(int serialnumber) 
	{
		medicozRepository.deleteById(serialnumber);
	}
	@Override
	public MedicinePojo get(int serialnumber) 
	{
		Medicine medicoz=medicozRepository.getOne(serialnumber);
		MedicinePojo medicozPojo=new MedicinePojo();
		medicozPojo.setSerialnumber(medicoz.getSerialnumber());
		medicozPojo.setMedicinename(medicoz.getMedicinename());
		medicozPojo.setPrice(medicoz.getPrice());
		medicozPojo.setType(medicoz.getType());
		medicozPojo.setQuantity(medicoz.getQuantity());
		medicozPojo.setExpdate(medicoz.getExpdate());
		return medicozPojo;
		
	}
	
	@Override
	public List<MedicinePojo> findByMedName(String medicinename) {
		
		List<MedicinePojo> medicinePojoList = new ArrayList<MedicinePojo>();

		List<Medicine> medicineList = medicozRepository.findByMnameLike(medicinename);

		
		for (Medicine medicine : medicineList) {
			MedicinePojo medicinePojo = new MedicinePojo();
			medicinePojo.setSerialnumber(medicine.getSerialnumber());
			medicinePojo.setMedicinename(medicine.getMedicinename());
			medicinePojo.setPrice(medicine.getPrice());
			medicinePojo.setType(medicine.getType());
			medicinePojo.setQuantity(medicine.getQuantity());
			medicinePojo.setExpdate(medicine.getExpdate());
			medicinePojoList.add(medicinePojo);
			System.out.println(medicine.getMedicinename());
		}

		return medicinePojoList;

	}
	
}

	

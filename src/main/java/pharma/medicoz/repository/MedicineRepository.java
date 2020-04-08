package pharma.medicoz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pharma.medicoz.entity.Medicine;



@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Integer>
{

	@Query("SELECT m FROM Medicine m WHERE m.medicinename LIKE %:medicinename%")
	List<Medicine> findByMnameLike(@Param("medicinename") String medicinename);

	

	
}

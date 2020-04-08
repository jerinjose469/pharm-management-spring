package pharma.medicoz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pharma.medicoz.entity.UserLogin;


@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Integer>
{

}

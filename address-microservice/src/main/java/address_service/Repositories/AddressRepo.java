package address_service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import address_service.Models.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

}

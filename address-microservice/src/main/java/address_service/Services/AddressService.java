package address_service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import address_service.Models.Address;
import address_service.Repositories.AddressRepo;
import address_service.RequestDto.CreateAddressRequest;
import address_service.ResponseDto.AddressReponse;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addressRepo;

	// create address

	public AddressReponse createAddress(CreateAddressRequest requestAddress) {
		
		Address address = new Address();
		address.setCity(requestAddress.getCity());
		address.setStreet(requestAddress.getStreet());
		Address result = addressRepo.save(address);
		AddressReponse response = new AddressReponse();
		response.setId(result.getId());
		response.setCity(result.getCity());
		response.setStreet(result.getStreet());
		return response;
	}
	// get address by id
	public AddressReponse getById(long id) {
		Address address=addressRepo.findById(id).get();
		return new AddressReponse(address.getId(),address.getStreet(),address.getCity());
	}

}

package address_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import address_service.RequestDto.CreateAddressRequest;
import address_service.ResponseDto.AddressReponse;
import address_service.Services.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	private AddressService addressService;

	// create address
	@PostMapping("/create")
	public ResponseEntity<AddressReponse> createAddress(@RequestBody CreateAddressRequest address) {
		return new ResponseEntity<>(addressService.createAddress(address), HttpStatus.CREATED);
	}

	// get address by id
	@GetMapping("/getById/{id}")
	public ResponseEntity<AddressReponse> getById(@PathVariable long id) {
		return new ResponseEntity<>(addressService.getById(id), HttpStatus.OK);
	}
}

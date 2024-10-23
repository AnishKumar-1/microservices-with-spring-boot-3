package address_service.ResponseDto;

public class AddressReponse {

	private long id;
	private String street;
	private String city;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public AddressReponse(long id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}
	public AddressReponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

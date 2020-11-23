package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;
	private String postalCode;
	private String city;
	private String country;

	public Publisher()
	{
	}

	public Publisher(String name, String address, String postalCode, String city, String country)
	{
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	@Override
	public String toString()
	{
		return "Publisher{" +
			"id=" + id +
			", name='" + name + '\'' +
			", address='" + address + '\'' +
			", postalCode='" + postalCode + '\'' +
			", city='" + city + '\'' +
			", country='" + country + '\'' +
			'}';
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Publisher publisher = (Publisher) o;

		return id != null ? id.equals(publisher.id) : publisher.id == null;
	}

	@Override
	public int hashCode()
	{
		return id != null ? id.hashCode() : 0;
	}
}

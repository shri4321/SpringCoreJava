package com.springcore.collection;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class emp {
	private String name;
	private List<String> Phones;
	private Set<String> Addresses;
	private Map<String, String> UserPass;
	private  Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return Phones;
	}
	public void setPhones(List<String> phones) {
		Phones = phones;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getUserPass() {
		return UserPass;
	}
	public void setUserPass(Map<String, String> userPass) {
		UserPass = userPass;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public emp(String name, List<String> phones, Set<String> addresses, Map<String, String> userPass,
			Properties props) {
		super();
		this.name = name;
		Phones = phones;
		Addresses = addresses;
		UserPass = userPass;
		this.props = props;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", Phones=" + Phones + ", Addresses=" + Addresses + ", UserPass=" + UserPass
				+ ", props=" + props + "]";
	}
	
	
	
	
	
}

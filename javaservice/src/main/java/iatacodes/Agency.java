package iatacodes;
/**
 * 	
	[
	 {
	 "code": "12345678",
	 "last-data-refresh": "201605110616",
	 "response": "Valid",
	 "agency-name": "SAMPLE AGENCY",
	 "approval-date": "6-10-2005",
	 "agency-class": "PASSENGER",
	 "site-type": "Branch Office",
	 "address": "33 MAIN STREET",
	 "city": "MONTREAL",
	 "postal-code": "H0H 1H2",
	 "state": "Quebec",
	 "country": "Canada",
	 "phone-number": "1 514 874 0202"
	 }
	]
*/

public class Agency {

    private final String code;
    private final String lastdatarefresh;
    private final String response;
    private final String agencyname;
    private final String approvaldate;
    private final String agencyclass;
    private final String sitetype;
    private final String address;
    private final String city;
    private final String postalcode;
    private final String state;
    private final String country;
    private final String phonenumber;

    
	public Agency(String code, String lastdatarefresh, String response,
			String agencyname, String approvaldate, String agencyclass,
			String sitetype, String address, String city, String postalcode,
			String state, String country, String phonenumber) {
		super();
		this.code = code;
		this.lastdatarefresh = lastdatarefresh;
		this.response = response;
		this.agencyname = agencyname;
		this.approvaldate = approvaldate;
		this.agencyclass = agencyclass;
		this.sitetype = sitetype;
		this.address = address;
		this.city = city;
		this.postalcode = postalcode;
		this.state = state;
		this.country = country;
		this.phonenumber = phonenumber;
	}
	
	public String getCode() {
		return code;
	}
	public String getLastdatarefresh() {
		return lastdatarefresh;
	}
	public String getResponse() {
		return response;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public String getApprovaldate() {
		return approvaldate;
	}
	public String getAgencyclass() {
		return agencyclass;
	}
	public String getSitetype() {
		return sitetype;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
}

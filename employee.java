package employment;


public class employee {
	String id;
	String name;
	
	//constructor
	public employee(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String toString() {
		return "ID : "+id+" Name: "+name;
	}
	public boolean equals(employee emp) {
		if (!name.equals(emp.getname())) return false; //compares name first and returns false if there is a mismatch
		else if (!id.equals(emp.getid())) return false;//compares IDs next and returns false if there is a mis match
		return true;                                   //returns true if there is a match
	}
	public int compareTo(employee emp) {
		int comp = this.name.compareTo(emp.getname());//compares names first and results in a number other than zero if there is a mismatch
		if (comp == 0) comp = this.id.compareTo(emp.getid());//compares IDs next and results in a number other than 0 if there is a mismatch
		return comp;   //returns zero if there a match otherwise a positive or a negative number
	}
	public int compare(employee a,employee b) {
		int comp = a.getname().compareTo(b.getname());//compares names first and results in a number other than zero if there is a mismatch
		if (comp == 0) comp = a.getid().compareTo(b.getid());//compares IDs next and results in a number other than 0 if there is a mismatch
		return comp;   //returns zero if there a match otherwise a positive or a negative number
	}
}

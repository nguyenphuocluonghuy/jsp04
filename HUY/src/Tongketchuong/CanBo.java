package Tongketchuong;

public abstract class CanBo {
	public String name;// trường
	public int year;
	public String sex;
	public String address;

	public CanBo(String name, int year, String sex, String address) {
		this.name = name;// gán giá trị cho các trường CanBo
		this.year = year;
		this.sex = sex;
		this.address = address;
	}

}

package bai04.vidu1;
import java.time.LocalDate;

public class Nguoi {
	private String hoten;
	private int namsinh;
	public Nguoi(String hoten, int namsinh) {
		super();
		this.setHoten(hoten);
		this.setNamsinh(namsinh);
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		LocalDate ngayhientai = LocalDate.now();
		int namhientai = ngayhientai.getYear();
		if((namsinh <= 0) || (namsinh > namhientai)){
			System.out.print("nam sinh khong hop le");
		}else {
			this.namsinh = namsinh;	
		}
	}
	@Override
	public String toString() {
		return "Nguoi [hoten=" + hoten + ", namsinh=" + namsinh + "]";
	}
	
}

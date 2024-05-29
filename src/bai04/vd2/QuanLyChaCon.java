package bai04.vd2;

public class QuanLyChaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LopCha obj1 = new LopCha("Lop cha ", 15, 3.123);
		obj1.thuoctinh2 = 16;
		obj1.thuoctinh3 = 7.5;
		System.out.println(obj1);
		obj1.phuongthuc2();
		obj1.phuongthuc3();
		obj1.vidugoiprivate();
		System.out.println(obj1);
		
		LopCon obj2 = new LopCon("hjbdf ", 100, 9.9,"CNTT k21");
		obj1.phuongthuc2();
	}

}

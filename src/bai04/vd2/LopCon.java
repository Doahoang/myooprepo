package bai04.vd2;

public class LopCon extends LopCha {
	private String thuoctinhrieng;

	public LopCon(String thuoctinh1, int thuoctinh2, double thuoctinh3, String thuoctinhrieng) {
		super(thuoctinh1, thuoctinh2, thuoctinh3);
		this.thuoctinhrieng = thuoctinhrieng;
	}

	public String getThuoctinhrieng() {
		return thuoctinhrieng;
	}

	public void setThuoctinhrieng(String thuoctinhrieng) {
		this.thuoctinhrieng = thuoctinhrieng;
	}

	@Override
	public String toString() {
		return "LopCon [thuoctinhrieng=" + thuoctinhrieng + ", toString()=" + super.toString() + "]";
	}
	
}

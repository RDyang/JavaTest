package Student;

/**
 * 定义一个表示学生信息的类Student，要求如下： 
 * （1）类Student的成员变量： 
 * sNO表示学号；
 * sName表示姓名；
 * sSex表示性别；
 * sAge表示年龄；
 * sJava：表示Java课程成绩。 
 * （2）类Student带参数的构造方法：
 * 在构造方法中通过形参完成对成员变量的赋值操作。 
 * （3）类Student的方法成员： 
 * getNo（）：获得学号； 
 * getName（）：获得姓名；
 * getSex（）：获得性别； 
 * getAge（）获得年龄； 
 * getJava（）：获得Java 课程成绩
 * （4）根据类Student的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生Java语言成绩的平均值，
 * 以及计算并输出他们Java语言成绩的最大值和最小值。
 * 
 * @author Administrator
 *
 */
public class Student {
	private String sNo;
	private String sName;
	private String sSex;
	private Integer sAge;
	private double sJava;
	
	Student(){
		
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsSex() {
		return sSex;
	}

	public void setsSex(String sSex) {
		this.sSex = sSex;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public double getsJava() {
		return sJava;
	}

	public void setsJava(double sJava) {
		this.sJava = sJava;
	}

	public Student(String sNo, String sName, String sSex, Integer sAge, double sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
				+ "]";
	}
	
}

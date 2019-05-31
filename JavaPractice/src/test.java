public class test {
	public static void main(String[] args) {

		StudentBean bean = new StudentBean();

		if (bean.getStudent() != null)
			System.out.println(bean.getStudent().getRegno());

	}

}

class StudentBean {
	private Student student = new Student();

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}

class Student {

	private Integer regno = new Integer(0);

	public Integer getRegno() {
		return regno;
	}

	public void setRegno(Integer regno) {
		this.regno = regno;
	}

}

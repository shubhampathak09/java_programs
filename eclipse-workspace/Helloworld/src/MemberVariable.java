
public class MemberVariable {
	 private String girlName;
	 public MemberVariable(String name)
	 {
		 girlName=name;
	 }
	 public void setname(String name)
	 {
		 girlName=name;
	 }
	 public String getname()
	 {
		 return girlName;
	 }
	 public void display()
	 {
		 System.out.printf("Your First gf name was %s",getname());
	 }
}

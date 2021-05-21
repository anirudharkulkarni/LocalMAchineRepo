package Test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ClassA Emp1 = new ClassA(1000,"Anirudha","Google");
//		
////		Emp1.Name="Anirudha";
////		Emp1.OrgName="Google";
////		Emp1.Salary=1000;
//		
//		Emp1.Display();
//		
//		ClassA Emp2 = new ClassA(5000,"Shara","Google");
////		
////		Emp1.Name="Shara";
////		Emp1.OrgName="Google";
////		Emp1.Salary=10000;
////		
//		Emp2.Display();
//		
//		SubClass obj1 =new SubClass();
//		
//		obj1.Name="Andy";
//		obj1.OrgName="FB";
//		obj1.Salary=50000;
//		
//		obj1.Display();
//		
//		SubClassC obj2 =new SubClassC();
//		
//		obj2.Display();
		
		MethodOverloading obj3 =new MethodOverloading();
				obj3.add(1, 2);
		obj3.add(1.1,5.5);
		
		Childoverride obj4 =new Childoverride();
		obj4.display();
		
		Encapsulation obj7 =new Encapsulation();
		
		obj7.setSalary(1000);
		
		System.out.println(obj7.getSalary());
		

	}

}

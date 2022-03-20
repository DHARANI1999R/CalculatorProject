
public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calculator=new Calculator();
System.out.println(calculator.square(16));
int sum=calculator.add(100, 200);
float average=sum/2.0f;
calculator.add(10,20,55);
calculator.add(65.43f,12.90f);
	}

}

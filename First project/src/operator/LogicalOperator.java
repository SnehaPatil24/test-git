package operator;

public class LogicalOperator {
	public static void main(String[] args) {
		int var=5;//assignment operator 
		
		System.out.println("-------------AND Condition---------------------------");
		
		//true  && true---final result will be true
		System.out.println("Both condition is true so final result is  " + (5<6 && 6>3));
		//false  && true---final result will be false
		System.out.println("First condition is false so final result is  " + (7<6 && 6>3));
		//true  && false---final result will be false
		System.out.println("Second condition is false so final result is  " + (3<6 && 1>3));
		//false  && false---final result will be false
		System.out.println("Both condition is false so final result is " + (7<6 && 1>3));
		
		
		System.out.println("-----------------------------------OR condition _________________________________________________");
		
		//true  || true---final result will be true
		System.out.println("Both condition is true so final result is  " + (5<6 || 6>3));
		//false  || true---final result will be true
		System.out.println("First condition is false so final result is  " + (7<6 || 6>3));
		//true  || false---final result will be true
		System.out.println("Second condition is false so final result is  " + (3<6 || 1>3));
		//false  || false---final result will be false
		System.out.println("Both condition is false so final result is " + (7<6 || 1>3));

	}
}

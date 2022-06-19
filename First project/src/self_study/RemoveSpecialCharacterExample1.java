package self_study;

public class RemoveSpecialCharacterExample1 {
	public static void main(String args[]) {
		String str = "This#string%contains^special*characters&.-dfs";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);

		// declare a string having special characters
		String str1 = "Pr!ogr#am%m*in&g Lan?#guag(e";
		String resultStr = "";
		// loop execute till the length of the string
		for (int i = 0; i < str1.length(); i++) {
			// comparing alphabets with their corresponding ASCII value
			if (str1.charAt(i) > 64 && str1.charAt(i) <= 122) // returns true if both conditions returns true
			{
				// adding characters into empty string
				resultStr = resultStr + str1.charAt(i);
			}
		}
		System.out.println("String after removing special characters: " + resultStr);
	}
}

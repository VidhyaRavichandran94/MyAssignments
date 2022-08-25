package week3.day2.java;

public class PolidromeUsingString {

	public static void main(String[] args) {
		{

			String str="madam";

			{

				// TODO Auto-generated method stub
				String rev = "";
				boolean ans = false;

				for (int i = str.length() - 1; i >= 0; i--)
				{
					rev = rev + str.charAt(i);
				}
				if (str.equals(rev))
				{
					System.out.println(rev);
				}
				else
				{
					System.out.println("Given value is not polindrom");
				}


			}
		}

	}


}


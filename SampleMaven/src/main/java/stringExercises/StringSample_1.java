package stringExercises;

public class StringSample_1 {

	public static void main(String[] args) {
			
			String a ="Hello";
			char b = a.charAt(4);
			System.out.println(b);
			System.out.println(a.length());
			//concate
			String c ="World";
			System.out.println(a.concat(c));
			//contains
			String e = "Today is Monday";
			System.out.println(e.contains("Monday"));
			System.out.println(e.contains("Today is"));
			System.out.println(e.contains("Tuesday"));
			//ismpty
			System.out.println(a.isEmpty());
			String f ="";
			System.out.println(f.isEmpty());
			// equals
			String g = "java";
			String h = "Java";
			String i = "java"; 
			String j = "Selenium";
			System.out.println(g.equals(h));
			System.out.println(g.equals(i));
			System.out.println(g.equals(j));
			System.out.println(h.equals(h));
			System.out.println(h.equals(i));

			//equalsIgnoreCase - only will check the data not the casesensitive.
			System.out.println(g.equalsIgnoreCase(h));
			System.out.println(g.toUpperCase());
			System.out.println("value of g:"+ g);
			System.out.println(g.toLowerCase());
			//value of  - type convertion method,every type of data can convert to string
			int k = 340;
			String l = String.valueOf(k);
			System.out.println(l);
			String m = new String("Welcome");
			String n = new String("java");
			System.out.println(m.equals(j));
			System.out.println(m == n);
			System.out.println(n == i );
			// as the string mentioned using new keyword ,use reference to compare.so the result will be false
			System.out.println(g == i );


			{
				
			}








	}

}

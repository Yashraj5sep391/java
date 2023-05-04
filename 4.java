class Student
{
		int x;
		static int y;
		static void show()
		{
			System.out.println("Insert The Method");
		}
		public static void main(String s[])
		{
			int i=10;
			//System.out.println(1);
			Student obj=new Student();
			System.out.println(obj.x);
			System.out.println(y);
			show();
		}
}


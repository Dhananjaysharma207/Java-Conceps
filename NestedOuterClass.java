package com.dev;

public class NestedOuterClass {
	private static int counter;
	public NestedOuterClass() {
		System.out.println("Outer Class Constructor");
	}
	public static class StaticInnerClass{
		public void static_method(){
			counter++;
			System.out.println("Static inner class");
		}
	}
	public class NonStaticInnerClass{
		public void nonstatic_method(){
			counter++;
			System.out.println("Nonstatic inner class");
		}
	}
	public void outermet() {
		class Insidemet{
			public void innermet() {
				System.out.println("local memeber innerr clss");
			}
		}
		Insidemet local = new Insidemet();
		local.innermet();
	}
}

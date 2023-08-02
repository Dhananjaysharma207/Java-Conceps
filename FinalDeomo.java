package com.calculator;
import com.dev.Book;
public class FinalDeomo {
	double PI=3.14;
	
	public void a() {
		Book b1 = new Book();
		Book b2 = new Book();
		b1=b2;
	}
	public void b() {
		PI++;
	}
	 public void c() {
		 
	 }

}
class Demo extends FinalDeomo{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		super.a();
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		super.b();
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		super.c();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

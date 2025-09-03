class Lab1P1{
	public static void main(String...args){
		byte b = 127;
		Byte bb = b; //AUTO BOXING
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(bb.MIN_VALUE);
		System.out.println(bb.SIZE);
		System.out.println(bb.TYPE);
		System.out.println(bb.BYTES);
		System.out.println("-------------SHORT------------");
		
		short s = 127;
		Short ss = s;
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(ss.MIN_VALUE);
		System.out.println(Short.SIZE);
		System.out.println(ss.TYPE);
		System.out.println(ss.BYTES);
		System.out.println("-------------INTEGER----------");
		
		int i = 127;
		Integer ii = i;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(ii.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(ii.TYPE);
		System.out.println(ii.BYTES);
		System.out.println("---------------LONG-----------");
		
		long l = 127;
		Long ll = l;
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(ll.MIN_VALUE);
		System.out.println(ll.SIZE);
		System.out.println(Long.TYPE);
		System.out.println(ll.BYTES);
		System.out.println("-------------FLOAT------------");
		
		float f = 127;
		Float ff = f;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(ff.MIN_VALUE);
		System.out.println(ff.SIZE);
		System.out.println(ff.TYPE);
		System.out.println(ff.BYTES);
		System.out.println("-------------DOUBLE------------");
		
		double d = 127;
		Double dd = d;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(Double.SIZE);
		System.out.println(dd.TYPE);
		System.out.println(dd.BYTES);
		System.out.println("-----------BOOLEAN--------------");
		
		boolean p = 127;
		Boolean pp = p;
		
		System.out.println(Boolean.MAX_VALUE);
		System.out.println(pp.MIN_VALUE);
		System.out.println(Boolean.SIZE);
		System.out.println(pp.TYPE);
		System.out.println(pp.BYTES);
		System.out.println("-------------------------------");
	
	}
}


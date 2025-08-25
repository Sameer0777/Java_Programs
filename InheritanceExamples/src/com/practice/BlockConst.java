package com.practice;

public class BlockConst {
	static {
		System.out.println("running static block of BlockConst class");
	}
	{
		System.out.println("running non-static block of BlockConst class");
	}
	BlockConst(){
		System.out.println("running constructor of BlockConst class");
	}
}

class BlockConst1 extends BlockConst{
	static {
		System.out.println("running static block of BlockConst1 class");
	}
	{
		System.out.println("running non-static block of BlockConst1 class");
	}
	BlockConst1(){
		System.out.println("running constructor of BlockConst1 class");
	}
}

class BlockConst2 extends BlockConst1{
	static{
		System.out.println("running static block of BlockConst2 class");
	}
	{
		System.out.println("running non-static block of BlockConst2 class");
	}
	BlockConst2(){
		System.out.println("running constructor of BlockConst class");
	}
}

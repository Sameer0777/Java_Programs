package com.practice;

public class Sample {
	Sample(){
		System.out.println("running sample() constructor");
	}
}

class Sample1 extends Sample{
	Sample1(){
		System.out.println("running sample1() constructor");
	}
}

class Sample2 extends Sample1{
	Sample2(){
		System.out.println("running sample2() constructor");
	}
}

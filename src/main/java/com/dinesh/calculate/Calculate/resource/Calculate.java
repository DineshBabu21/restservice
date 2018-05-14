package com.dinesh.calculate.Calculate.resource;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Calculate")
public class Calculate {
	
	private int Op1,Op2;

	public Calculate(){
		
	}
	
	public Calculate(int Op1,int Op2){
		this.Op1=Op1;
		this.Op2=Op2;
	}
	
	@XmlElement(name="Op1")
	public int getOp1() {
		return Op1;
	}

	public void setOp1(int op1) {
		Op1 = op1;
	}
	@XmlElement(name="Op2")
	public int getOp2() {
		return Op2;
	}

	public void setOp2(int op2) {
		Op2 = op2;
	}
	
	

}

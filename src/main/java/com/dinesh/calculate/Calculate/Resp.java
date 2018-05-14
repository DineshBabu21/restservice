package com.dinesh.calculate.Calculate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")
public class Resp {
	private int result;
	@XmlElement(name="result")
	public int getResult() {
		return result;
	}

	public void setResult(int op1) {
		result = op1;
	}
}

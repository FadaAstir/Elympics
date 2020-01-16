package com.astir.tag;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class LogoTag extends SimpleTagSupport{
	private String height="100";
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public void doTag() throws JspException, IOException {
	      JspWriter out = getJspContext().getOut();
	      out.println("<img src='img/logoAstir.jpg' height='"+this.height+"'/>");
	 } 
}
package com.thecrunchycorner.runlogweb.week;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;


public class DurationTag extends SimpleTagSupport {
    private StringWriter sw = new StringWriter();
    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    public void doTag() throws JspException, IOException     {
        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString());
    }
}

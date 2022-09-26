package com.commend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Commend {
	void execute(HttpServletRequest request, HttpServletResponse response);

}

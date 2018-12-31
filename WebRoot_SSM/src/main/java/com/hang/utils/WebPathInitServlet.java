package com.hang.utils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author: 陈书航
 * @Description:
 * @Date: 16:48 2018/12/31 48
 */
@WebServlet(urlPatterns = {},loadOnStartup = 2)
public class WebPathInitServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().setAttribute("RootPath",config.getServletContext().getContextPath());
        super.init(config);
    }
}
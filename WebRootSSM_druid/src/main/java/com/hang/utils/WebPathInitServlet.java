package com.hang.utils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author: 陈书航
 * @Description:
 * 不匹配任何路径，跟随服务器启动而启动
 * 在上下文中存储了一个RootPath的值，值为根路径,使用方式  ${RootPath}
 * @Date: 11:33 2018/12/29 33
 */
@WebServlet(urlPatterns = {},loadOnStartup = 2)
public class WebPathInitServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().setAttribute("RootPath",config.getServletContext().getContextPath());
        super.init(config);
    }
}

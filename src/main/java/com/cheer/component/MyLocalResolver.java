package com.cheer.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 可以在连接上携带区域信息
 */
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest Request) {
        Locale locale=null;
        String parms = Request.getParameter("l");

        if(!StringUtils.isEmpty(parms)){
            String[] strings = parms.split("_");
            locale=new Locale(strings[0],strings[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}

package com.jovi.magic.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author fanjiawei
 * @date Created on 2019/3/7
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}

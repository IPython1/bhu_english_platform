package com.dyj.myspringboot.service;

public interface SendEmail {

    void SendEmail(String to, String subject, String content);
}

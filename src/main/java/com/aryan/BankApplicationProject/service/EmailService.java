package com.aryan.BankApplicationProject.service;

import com.aryan.BankApplicationProject.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}

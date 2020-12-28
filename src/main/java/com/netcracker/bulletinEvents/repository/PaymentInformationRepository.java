package com.netcracker.bulletinEvents.repository;

import com.netcracker.bulletinEvents.models.PaymentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInformationRepository extends JpaRepository<PaymentInformation, Integer> {
}

package com.zerobase.houseutils.service;

import com.zerobase.houseutils.exception.ErrorCode;
import com.zerobase.houseutils.exception.HouseUtilsException;
import com.zerobase.houseutils.repository.ApartmentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Transactional
    public Long getPriceOrThrow(Long apartmentId) {
        return apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND))
                .getPrice();
    }
}

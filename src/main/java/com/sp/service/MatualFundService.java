package com.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.entity.MatutalFund;
import com.sp.repository.MataulFundRepository;

@Service
public class MatualFundService {
    @Autowired
    private MataulFundRepository mfr;

    public MatutalFund getMatualFundetailbyOwnname(String own) {
        MatutalFund mf = mfr.getbyown(own);
        if (mf == null) {
            // Handle the case where no record is found
            throw new RuntimeException("No Matual Fund found for owner: " + own);
        }
        return mf;
    }
    
    public List<MatutalFund> getnumGreatherThen(int num) {
        return  mfr.findByNumGreaterThan(num);
        
    }
}

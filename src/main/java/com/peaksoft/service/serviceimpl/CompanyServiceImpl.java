package com.peaksoft.service.serviceimpl;

import com.peaksoft.entity.Company;
import com.peaksoft.repository.CompanyRepository;
import com.peaksoft.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void saveCompany(Company company) {
        companyRepository.saveCompany(company);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.getCompanyById(id);
    }

    @Override
    public List<Company> getAllCompany() {
        return companyRepository.getAllCompany();
    }

    @Override
    public void updateCompany(Company company) {
        companyRepository.updateCompany(company);
    }

    @Override
    public void removeCompanyById(Long id) {
        companyRepository.removeCompanyById(id);
    }
}

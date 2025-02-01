package com.processinginvoice.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.processinginvoice.server.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice,Long>{
    
}

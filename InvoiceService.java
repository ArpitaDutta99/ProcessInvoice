package com.processinginvoice.server.services;

import java.util.List;

import com.processinginvoice.server.model.Invoice;

public interface InvoiceService {
    
    public Invoice addInvoice(Invoice invoice);  //This Method returns invoice type

    public List<Invoice> getInvoices();

    public Invoice deleteInvoice(long id);
}

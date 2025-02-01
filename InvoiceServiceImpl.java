package com.processinginvoice.server.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.processinginvoice.server.dao.InvoiceDao;
import com.processinginvoice.server.model.Invoice;
@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        invoiceDao.save(invoice);  //To save invoices into the database
        return invoice;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();
    }

    @Override
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceDao.findById(id).get();
        invoiceDao.delete(invoice);
        return invoice;
    }
}


package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){

        Product product1 = new Product("Product 1");
        Product product2= new Product("Product 2");
        Product product3 = new Product("Product 3");

        Item item1 = new Item(product1,new BigDecimal("111"),2, new BigDecimal("2"));
        Item item2 = new Item(product2,new BigDecimal("12"),3, new BigDecimal("4"));
        Item item3 = new Item(product3,new BigDecimal("223"),1, new BigDecimal("5"));

        Invoice invoice = new Invoice("1234");
        invoice.getItem().add(item1);
        invoice.getItem().add(item2);
        invoice.getItem().add(item3);

        invoiceDao.save(invoice);

        Integer id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        assertTrue(readInvoice.isPresent());
    }
}

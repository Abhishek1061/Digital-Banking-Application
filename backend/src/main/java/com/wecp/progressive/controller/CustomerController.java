package com.wecp.progressive.controller;


// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.service.CustomerService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.sql.SQLException;
// import java.util.List;

// @RestController
// public class CustomerController {

//     @Autowired
//     private CustomerService customerService;
    
    

    
//     @GetMapping("/customers")
//     public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
//         return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
//     }

//     @GetMapping("/customers/{customerId}")
//     public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) throws SQLException {
//         return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
//     }

//     @PostMapping("/customers")
//     public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException {
//         return new ResponseEntity<>(customerService.addCustomer(customers),HttpStatus.OK);
//     }

//     @PutMapping("/customers/{customerId}")
//     public ResponseEntity<Void> updateCustomer(@PathVariable int customerId,@RequestBody Customers customers) throws SQLException {
//         customerService.updateCustomer(customers);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     @DeleteMapping("/customers/{customerId}")
//     public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) throws SQLException {
//         customerService.deleteCustomer(customerId);

//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//     }


//     // public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
//     //     //return new ResponseEntity<>(transactionSer);
//     //     return null;
        
//     // }

//     @GetMapping("/customers/fromArrayList/{customerId}")
//     public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(@PathVariable int cutomerId) throws SQLException {
//         return null;
//     }
// }

import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerService;
import com.wecp.progressive.service.TransactionService;
 
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.sql.SQLException;
import java.util.List;
 
@RestController
 
public class CustomerController {
 
    @Autowired
    private CustomerService customerService;
 
    @Autowired
    private TransactionService transactionService;
 
    @GetMapping("/customers")
    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
    }
 
    @GetMapping("/customers/{customerId}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) throws SQLException {
        return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
    }
 
    @PostMapping("/customers")
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException {
        return new ResponseEntity<>(customerService.addCustomer(customers),HttpStatus.OK);
    }
 
    @PutMapping("/customers/{customerId}")
    public ResponseEntity<Void> updateCustomer(@PathVariable int customerId,@RequestBody Customers customers) throws SQLException {
        customerService.updateCustomer(customers);
        return new ResponseEntity<>(HttpStatus.OK);
   
 
    }
 
    @DeleteMapping("/customers/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) throws SQLException {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
 
    @GetMapping("/customers/fromArrayList/{customerId}")
    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(@PathVariable int cutomerId) throws SQLException {
        return null;
    }
}
 

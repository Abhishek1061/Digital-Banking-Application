import { Component } from '@angular/core';
// import { FormGroup, FormBuilder, Validators, FormsModule } from '@angular/forms';
// import { of } from 'rxjs';
// import {  CustomerTS } from '../../types/tstypes/Customerts';
import {  CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customerarray',
  // standalone: true,
  imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {

    customers: CustomerTS[] =[
      new CustomerTS("1","Jhon", "john@1061", "1234asdf", "jhon@01910", "Developer"),
      new CustomerTS("2","Jhon Cena", "john@1061", "1234asdf", "jhon@01910", "Developer"),
      new CustomerTS("3","Jhonny Bravo", "johnny@1061", "1234asdf", "jhonny@01910", "Developer")

    ];
      
}

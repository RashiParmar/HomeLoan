import { Component, OnInit } from '@angular/core';
import { Previewdetails } from '../previewdetails';
import { DetailsService } from '../details.service';

@Component({
  selector: 'app-show-details',
  templateUrl: './show-details.component.html',
  styleUrls: ['./show-details.component.css']
})
export class ShowDetailsComponent implements OnInit {
  preview:Previewdetails;
  public isValid:number=0;
  constructor(private personalservice:DetailsService) 
  {
this.preview=new Previewdetails();
   }

 

  ngOnInit(): void {
  }
  
  saveData()
  {
  //  console.log(this.preview.Address)
   this.personalservice.addValue(this.preview).subscribe(
    (data)=>
    {
      console.log("Return Value From Rest"+data);
    }


   )
  }
}

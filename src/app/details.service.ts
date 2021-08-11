import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Previewdetails } from './previewdetails';
@Injectable({
  providedIn: 'root'
})
export class DetailsService {

  constructor(private httpClient:HttpClient) { }

  baseUrl:string="http://localhost:8189/rest/api"

  // RETRIEVING PERSONAL DETAILS

 /*
  getAllDetails()
  {
    return this.httpClient.get(this.baseUrl+"/personal");
  }

addValue(preview:Previewdetails)
{
  return this.httpClient.post(this.baseUrl+"/personal",preview);

}
*/

getAll()
{
  return this.httpClient.get(this.baseUrl+"/personal");
}

addValue(preview:Previewdetails)
{
  return this.httpClient.post(this.baseUrl+"/personal",preview);
}


}

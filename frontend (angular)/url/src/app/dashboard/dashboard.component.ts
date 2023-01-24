import { Component, OnInit } from '@angular/core';
import { UrlShortService } from '../services/url-short.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  url : string = "";
  constructor(private urlShortService : UrlShortService) { }

  ngOnInit(): void {

  }

  generateShortUrl() {
    this.urlShortService.getShortUrl(this.url).subscribe(res=>{
      console.log(res);
    }, err=>{
      console.log(err);
    })
  }
}

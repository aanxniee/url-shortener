import { Component, OnInit } from '@angular/core';
import { UrlShortService } from '../services/url-short.service';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  url : string = "";
  isUrlGenerated : boolean = false;
  isErrorGenerated : boolean = false;
  shortUrl : string = "";
  originalUrl : string = "";
  constructor(private urlShortService : UrlShortService) { }

  ngOnInit(): void {
    this.isUrlGenerated = false;
  }

  generateShortUrl() {
    this.urlShortService.getShortUrl(this.url).subscribe(res=>{
      if (res==null) {
        this.isErrorGenerated = true;
      }
      else {
        this.isErrorGenerated = false;
        this.isUrlGenerated = true;
        this.shortUrl = res.shortURL;
        this.originalUrl = res.originalURL;
        console.log(this.originalUrl);
      }
    }, err=>{
      this.isUrlGenerated = false;
      this.isErrorGenerated = true;
    })
  }
}

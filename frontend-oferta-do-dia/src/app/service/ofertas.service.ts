import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PromocaoService {

  private apiUrl = 'http://localhost:8080/api/promocoes';

  constructor(private http: HttpClient) { }

  getPromocoes(): Observable<string[]> {
    return this.http.get<string[]>(this.apiUrl);
  }
}

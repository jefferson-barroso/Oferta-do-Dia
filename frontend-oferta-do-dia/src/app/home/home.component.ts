import { Component, OnInit } from '@angular/core';
import { PromocaoService } from '../service/ofertas.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent implements OnInit {

  promocoes: string[] = [];

  constructor(private promocaoService: PromocaoService) { }

  ngOnInit(): void {
    this.promocaoService.getPromocoes().subscribe(data => {
      this.promocoes = data;
    });
  }
}

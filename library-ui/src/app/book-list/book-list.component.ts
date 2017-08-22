import { Component, OnInit } from '@angular/core';
import {BookService} from "../service/book.service";
import {BookResource} from "../model/book-resource";

@Component({
  selector: 'lib-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  public books: BookResource[];

  constructor(private _bookService: BookService) { }

  ngOnInit() {
    this._bookService.findAllBooks().subscribe(
      bl => this.books = bl._embedded.books
    );
  }

}

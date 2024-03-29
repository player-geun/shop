package jpabook.shop.web;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {

    private Long id;
    private String name;
    private int stockQuantity;
    private int price;
    private String isbn;
    private String author;
}

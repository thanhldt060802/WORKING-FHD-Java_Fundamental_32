package bai05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> bookList;

    public Library(){
        this.bookList =new ArrayList<>();
    }

    public void showAllBooks(){
        if (bookList.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public void addBook(Book book) {
        if (searchBookById(book.getId()) != null) {
            System.out.println("Lỗi: Mã số sách '" + book.getId() + "' đã tồn tại trong thư viện!");
        } else {
            bookList.add(book);
            System.out.println("Thêm thành công sách: " + book.getName());
        }
    }

    public void updateBook(Book book) {
        Book existingBook = searchBookById(book.getId());
        if (existingBook != null) {
            existingBook.setName(book.getName());
            existingBook.setPublicationDate(book.getPublicationDate());
            existingBook.setCategoryName(book.getCategoryName());
            existingBook.setAuthorName(book.getAuthorName());
            existingBook.setPrice(book.getPrice());
            existingBook.setDiscountRate(book.getDiscountRate());
            System.out.println("Cập nhật thành công thông tin sách ID: " + book.getId());
        } else {
            System.out.println("Lỗi: Không tìm thấy sách có ID '" + book.getId() + "' để cập nhật.");
        }
    }

    public void removeBookById(String id) {
        Book book = searchBookById(id);
        if (book != null) {
            bookList.remove(book);
            System.out.println("Đã xóa sách có ID: " + id);
        } else {
            System.out.println("Lỗi: Không tìm thấy sách có ID '" + id + "' để xóa.");
        }
    }

    public Book searchBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    
    // Hàm cần có trong lớp Library.java
    public ArrayList<Book> searchBookListByPublicationDateInRange(String dateFrom, String dateTo) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : this.bookList) {
            // // So sánh chuỗi ngày xuất bản nằm trong khoảng từ dateFrom đến dateTo
            // if (book.getPublicationDate().compareTo(dateFrom) >= 0 && book.getPublicationDate().compareTo(dateTo) <= 0) {
            //     result.add(book);
            // }
            try {
                if (Util.compareDateString(book.getPublicationDate(), dateFrom, Util.VN_DATE_FORMAT) >= 0 &&
                    Util.compareDateString(book.getPublicationDate(), dateTo, Util.VN_DATE_FORMAT) <= 0) {
                    result.add(book);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    // 16/05/2026
    // 30/04/2026

    public ArrayList<Book> searchBookListByDiscountRateInRange(double minDiscountRate, double maxDiscountRate) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getDiscountRate() > minDiscountRate && book.getDiscountRate() < maxDiscountRate) {
                result.add(book);
            }
        }
        return result;
    }
    public void sortBookListByPriceAscending() {
        for(int i = 0; i < this.bookList.size() - 1; i++) {
			int min = i;
			for(int j = i + 1; j < this.bookList.size(); j++) {
				if(this.bookList.get(min).getPrice() > this.bookList.get(j).getPrice()) {
					min = j;
				}
			}
			Book temp = this.bookList.get(i);
			this.bookList.set(i, this.bookList.get(min));
			this.bookList.set(min, temp);
		}
        System.out.println("Đã sắp xếp danh sách sách theo giá TĂNG DẦN.");
    }
    public void sortBookListByNameDescending() {
        // Collections.sort(bookList, new Comparator<Book>() {
        //     @Override
        //     public int compare(Book b1, Book b2) {
        //         return b2.getName().compareTo(b1.getName()); // b2 so với b1 tạo thứ tự giảm dần
        //     }
        // });
        for(int i = 0; i < this.bookList.size() - 1; i++) {
			int max = i;
			for(int j = i + 1; j < this.bookList.size(); j++) {
				if(this.bookList.get(max).getName().compareTo(this.bookList.get(j).getName()) < 0) {
					max = j;
				}
			}
			Book temp = this.bookList.get(i);
			this.bookList.set(i, this.bookList.get(max));
			this.bookList.set(max, temp);
		}
        System.out.println("Đã sắp xếp danh sách sách theo tên GIẢM DẦN.");
    }
    public ArrayList<Book> searchBookListByCategoryName(String categoryName) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getCategoryName().equalsIgnoreCase(categoryName)) {
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> searchBookListByAuthorName(String authorName) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthorName().equalsIgnoreCase(authorName)) {
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> searchBookListByPriceInRange(double minPrice, double maxPrice) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getPrice() > minPrice && book.getPrice() < maxPrice) {
                result.add(book);
            }
        }
        return result;
    }
}

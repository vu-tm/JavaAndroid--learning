# Mảng
## Mảng một chiều
### Cú pháp:
```<kiểu dữ liệu>[<kích thước>];```
<br> 

---
## Mảng đa chiều
### Cú pháp:
```<kiểu dữ liệu>[<số hàng>][<số cột>];```
<br> 

---
### Khai báo
```<kiểu dữ liệu>[] <tên mảng>```
<br> 

---
### Khởi tại
```kiểuDữLiệu[] tênMảng = new kiểuDữLiệu[kíchThướcMảng];```
<br> 

---
### Gán giá trị
```<tên_mảng>[<chỉ_số>] = <giá_trị>;```
<br> 
Ví dụ, để gán giá trị 10 cho phần tử thứ 2 trong mảng myArray:<br> 
```java
myArray[2] = 10;
```

---

### Khai báo, khởi tạo và gán giá trị cho mảng đồng thời   
Trong Java, chúng ta cũng có thể khai báo, khởi tạo và gán giá trị cho mảng đồng thời trong cùng một dòng mã.   
Để làm điều này, chúng ta sử dụng cú pháp:   
```type[] arrayName = {value1, value2, value3, …};```
<br>

---
## Các thao tác với phần tử của mảng
Phần tử của mảng là giá trị được lưu trữ trong mảng tại một vị trí cụ thể. Mỗi phần tử của mảng có một chỉ số (index) riêng biệt để truy cập và thao tác với nó.

### Tìm kiếm phần tử trong mảng
Để tìm kiếm phần tử trong mảng, bạn có thể sử dụng vòng lặp để duyệt qua từng phần tử và so sánh giá trị của chúng với giá trị cần tìm.

Cú pháp:
```java
for (int i = 0; i < array.length; i++) {
if (array[i] == valueToFind) {

// Làm gì đó với vị trí tìm được

}

}
```

<br><br>Ví dụ:
```java
int[] numbers = {1, 2, 3, 4, 5};
int valueToFind = 3;

for (int i = 0; i < numbers.length; i++) {

if (numbers[i] == valueToFind) {

System.out.println(“Found ” + valueToFind + ” at index ” + i);

break;

}

}
```
<br>

---
### Truy cập phần tử trong mảng
Truy cập phần tử trong mảng giúp lấy giá trị của phần tử tại một chỉ số nhất định. Để truy cập phần tử trong mảng, bạn sử dụng chỉ số của phần tử đó:

```<kiểu_dữ_liệu> element = <tên_mảng>[<chỉ_số_phần_tử>];```
<br><br>Ví dụ:
```java
int[] numbers = {1, 2, 3, 4, 5};
int elementAtIndex2 = numbers[2];

System.out.println(“Element at index 2: ” + elementAtIndex2); // Output: Element at index 2: 3

Thay đổi phần tử trong mảng
Thay đổi phần tử trong mảng giúp cập nhật giá trị của phần tử tại một chỉ số nhất định. Để thay đổi phần tử trong mảng, bạn sử dụng chỉ số của phần tử đó và gán giá trị mới:

<tên_mảng>[<chỉ_số_phần_tử>] = <giá_trị_mới>;
```
<br>Ví dụ:
```java
int[] numbers = {1, 2, 3, 4, 5};
numbers[2] = 7;

System.out.println(“Updated element at index 2: ” + numbers[2]); // Output: Updated element at index 2: 7
```
<br>

---
### Độ dài mảng
Độ dài mảng giúp xác định số lượng phần tử trong mảng, từ đó hỗ trợ việc duyệt qua mảng, cũng như kiểm soát không truy cập ngoài phạm vicủa mảng, tránh gây ra lỗi ArrayIndexOutOfBoundsException. Để lấy độ dài của mảng, bạn sử dụng thuộc tính length của mảng:

```int length = <tên_mảng>.length;```
<br><br>
Ví dụ:
```java
int[] numbers = {1, 2, 3, 4, 5};
int length = numbers.length;

System.out.println(“Length of the array: ” + length); // Output: Length of the array: 5
```
<br>

---
### Duyệt phần tử của mảng
Duyệt phần tử giúp ta lần lượt truy cập từng phần tử trong mảng từ đó giúp thực hiện các thao tác xử lý dữ liệu như tính tổng, tìm giá trị lớn nhất…Để duyệt phần tử của mảng có thể sử dụng vòng lặp for hoặc vòng lặp for-each.
```java
Vòng lặp for:  sử dụng một biến đếm để truy cập các phần tử trong mảng
for (int i = 0; i < <tên_mảng>.length; i++) {
<kiểu_dữ_liệu> element = <tên_mảng>[i];

// Làm gì đó với phần tử ‘element’

}

Vòng lặp for-each:  sử dụng một biến để lưu trữ giá trị của từng phần tử trong mảng.
for (<kiểu_dữ_liệu> element : <tên_mảng>) {
// Làm gì đó với phần tử ‘element’

}
```
<br>

---
## Phương thức và mảng trong Java
Trong Java, bạn có thể sử dụng mảng như một tham số đầu vào hoặc kết quả trả về của một phương thức. Điều này giúp chúng ta xử lý các tác vụ liên quan đến mảng một cách hiệu quả và linh hoạt hơn, giúp giảm thiểu sự trùng lặp mã, tăng tính tái sử dụng và đảm bảo tính ổn định của chương trình và giảm thiểu khả năng xảy ra lỗi.

### Truyền mảng vào phương thức
Bạn có thể truyền một mảng vào phương thức như một tham số bình thường. Để làm điều này, bạn chỉ cần khai báo kiểu dữ liệu của mảng và tên biến trong danh sách tham số của phương thức. Ở đây, chúng ta sử dụng phương thức  printArray
<br><br>
Ví dụ:
```java
public static void printArray(int[] array) {
for (int number : array) {

System.out.print(number + ” “);

}

System.out.println();

}
```
<br>

---
### Trả về mảng từ phương thức
Để trả về một mảng từ phương thức, bạn cần khai báo kiểu dữ liệu của mảng và sử dụng từ khoá return để trả về mảng đó. Ngoài ra, khii trả về mảng từ phương thức, chúng ta cũng cần lưu ý về việc quản lý bộ nhớ và đảm bảo tính toàn vẹn của dữ liệu. Ở đây, chúng ta sử dụng phương thức createArray:
<br><br>
Ví dụ:
```java
public static int[] createArray(int size) {
int[] newArray = new int[size];

for (int i = 0; i < size; i++) {

newArray[i] = i + 1;

}

return newArray;
```
<br>

---
### Sử dụng mảng tham số biến
Trong Java, bạn có thể sử dụng tham số biến (varargs) để truyền một số lượng tham số tùy ý vào phương thức. Để sử dụng varargs, bạn cần khai báo kiểu dữ liệu của tham số, kèm theo dấu ba chấm (…) trước tên biến. Ở đây, chúng ta sử dụng phương thức printVarargs
<br><br>
Ví dụ:
```java
public static void printVarargs(int… numbers) {
for (int number : numbers) {

System.out.print(number + ” “);

}

System.out.println();

}
```

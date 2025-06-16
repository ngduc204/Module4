<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Currency Converter</title></head>
<body>
<h2>Chuyển đổi từ USD sang VND</h2>
<form method="post" action="convert">
    Tỉ giá (VND/USD): <input type="text" name="rate"><br><br>
    Số tiền USD: <input type="text" name="usd"><br><br>
    <input type="submit" value="Chuyển đổi">
</form>

<c:if test="${not empty result}">
    <h3>Kết quả: ${result} VNĐ</h3>
</c:if>
</body>
</html>

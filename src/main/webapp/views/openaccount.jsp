<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body style="background-image: url(download.png);background-repeat: no-repeat;background-size: cover;" >
<center>
    <h1>SDFC BANK</h1>
<fieldset style="border-radius: 25px;background-color: aqua;width: 25%;color: black;">
<h2>EXTRAORDINARY SERVICES</h2>
</fieldset><p></p>
<fieldset style="border-radius: 15px;border-color: aquamarine;background-color: yellow;width: 50%;">
<a href="/">Home</a>&nbsp&nbsp&nbsp&nbsp
<a href="/openaccount">New Account</a>&nbsp&nbsp&nbsp&nbsp
<a href="/viewbalance">Balance</a>&nbsp&nbsp&nbsp&nbsp
<a href="/">Deposit</a>&nbsp&nbsp&nbsp&nbsp
<a href="/">Withdraw</a>&nbsp&nbsp&nbsp&nbsp
<a href="/">Transfer</a>&nbsp&nbsp&nbsp&nbsp
<a href="/">CloseA/C</a>&nbsp&nbsp&nbsp&nbsp
<a href="/">AboutUs</a>&nbsp&nbsp&nbsp&nbsp
</fieldset><p>
<fieldset style="width: 30%">
<form:form method="POST" modelAttribute="bank" action="/register">
<h1 style="color:red">ENTER CUSTOMER DETAILS HERE</h1>
Account NO: <form:input path="acno" /><p></p>
Name: <form:input path="name" /><p></p>
Password: <form:input path="password" /><p></p>
Amount: <form:input path="amount" /><p></p>
Address: <form:input path="address" /><p></p>
Mobile No: <form:input path="mobile_no" /><p></p>
<input type="submit" value="Submit"><p></p>
<input type="submit" value="Clear">


</form:form>
</fieldset>
</center>
</body>
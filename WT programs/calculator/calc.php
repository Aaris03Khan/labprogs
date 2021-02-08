<html>
<head>
<title>calculator</title>
<script language="javascript">
function validateForm()
{
first=document.f1.fvalue.value;
second=document.f1.lvalue.value;
if(first=="")
{
alert("enter value");
document.f1.fvalue.focus();
return false;
}
if(isNaN(first))
{
alert("must enter number");
document.f1.fvalue.focus();
return false;
}
if(document.f1.operator.value=="")
{
alert("choose operator");
document.f1.operator.focus();
return false;
}
if(second=="")
{
alert("enter value");
document.f1.lvalue.focus();
return false;
}
if(isNaN(second))
{
alert("must enter number");
document.f1.lvalue.focus();
return false;
}
return true;
}
</script>
</head>
<body>
<form name="f1" method="post" action="success.php" onsubmit="return validateForm();">
<table cellpadding="5" cellspacing="5" border="0">
 <tr>
 <td>Enter First Number</td>
 <td colspan="1"><input name="fvalue" id="fvalue" type="text"/></td>
 <tr>
 <td>Select Operator</td>
 <td><select name="operator">
<option selected value=""> choose operator</option>
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option>
<option value="%">%</option>
</select></td>
 </tr>
 <tr>
 <td>Enter second Number</td>
 <td><input name="lvalue" type="text" id="lvalue"/></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" name="calculate" value="Calculate" /></td>
 </tr>
 </table>
</form>
</body>
</html>

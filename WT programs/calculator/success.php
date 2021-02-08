<?php
if (isset($_REQUEST['calculate']))
{
    $operator = $_REQUEST['operator'];
    if ($operator == "+")
    {
        $add1 = $_REQUEST['fvalue'];
        $add2 = $_REQUEST['lvalue'];
        $res = $add1 + $add2;
        $result = 'SUM';
    }
    if ($operator == "-")
    {
        $add1 = $_REQUEST['fvalue'];
        $add2 = $_REQUEST['lvalue'];
        $res = $add1 - $add2;
        $result = 'DIFFERENCE';
    }
    if ($operator == "*")
    {
        $add1 = $_REQUEST['fvalue'];
        $add2 = $_REQUEST['lvalue'];
        $res = $add1 * $add2;
        $result = 'PRODUCT';
    }
    if ($operator == "/")
    {
        $add1 = $_REQUEST['fvalue'];
        $add2 = $_REQUEST['lvalue'];
        $res = $add1 / $add2;
        $result = 'DIVISION';
    }
    if ($operator == "%")
    {
        $add1 = $_REQUEST['fvalue'];
        $add2 = $_REQUEST['lvalue'];
        $res = $add1 % $add2;
        $result = 'REMAINDER';
    }
}
?>
<?php echo "The <strong>" . $result . "</strong> Of <strong>" . $add1 . "</strong> And
<strong>" . $add2 . "</strong> Is <strong>" . $res . "</strong>"; ?>
<br/><br/><a href="calc.php">click Here</a> To Go Back To Calculator

<?php
$str1 = 'The quick brown fox jumps over the lazy dog.';
if (strpos($str1, 'jumps') !== false)
{
    echo 'The specific word is present.';
}
else
{
    echo 'The specific word is not present.';
}
?>
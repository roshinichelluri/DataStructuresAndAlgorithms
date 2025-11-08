# ***Sentinel Search***

 

***-This is also a kind of linear Search, Generally in linear search, In worst case We perform n + 1 comparisions and there's a chance of index out of bounds exception. Now in sentinel search we perform only n comparisions in worst case and there's no possibility of out of bounds exception.***

***-In linear search we compare elements based on array size, here we compare all the elements one by one but without using array size.***

* ***The following is the procedure*** 

&nbsp;	Step 1 : store last element in a temporary variable 

&nbsp;	Step 2 : Place target element into last position, This is called sentinel

&nbsp;	Step 3 : Now check each and every element in array one by one until there's a match 

&nbsp;	Step 4 : If there's a match with target, then stop the process

&nbsp;	Step 5 : If index is not last position then return index

&nbsp;		 if index is the last position, then check target with temporary variable and if there's a match return n - 1.

* Ex : \[2, 6, 3, 7, 12, 8, 15, 4], n = 8 and target = 6

Fangen </br>
I believe, everything is easy.</br>


FZISTEF</br>
It's easy too </br>


PA05_POT</br>
We must notice, that only the last number of integer is important. Look at possibilities.
If last number is </br>
0,1,5,6 then we always get the same number.
9 we can get only 1 and 9. If we choose 4 we get 4 or 6.
If we get 2,3,7,8 we have 4 possibilities.
So we can create algorithm O(4) ;) </br>


Skarbfi </br>
Notice, that this function return 0 or 1.
Math.signum((double)directionAndStepArray[0])+1)/2 </br>
And  directionAndStepArray[(direction/2)]+=Math.pow(-1,(direction+1)%2)*steps; substract if direction is 0 or 2 and adding when direction is 1 or 3.


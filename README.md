# Web-based-Calculator
Web based Calculator with fancy GUI using Vue.js and spring boot  

By :
&nbsp;Mostafa Ahmed Abd El-hamed
<br/><br/>
&nbsp;18011774

*I a m running my project from the same file spring main/ java and vue js from main/resources 
but in next project s I will separate them*


## In spring boot there is 3 packages.
<br/><br/>
&nbsp;-1. Objects :
which has one class calculator to get first number , second number and the operation
<br/><br/>
&nbsp;-2. Controller :
to link frontend with spring boot, which has one post http request that get object “calculator” and return the result
<br/><br/>
&nbsp;-3. Services :
has all main function needed to calculate results
<br/><br/><br/><br/>

## assumption
<br/><br/>
&nbsp;&nbsp;*you can only do one calculate per time as if you want to calculate “10+15+3”
first you enter “10+15” if you press “+” it will automatically calculate 10+15 = 25 and on the display you will see “25+” not “10+15+” as shown below*
<br/><br/><br/><br/>
![Capture](https://user-images.githubusercontent.com/59110598/126708112-8265d7ba-d20f-4fe8-a2e2-14cf6aa48a16.JPG)
<br/><br/><br/><br/>


&nbsp;&nbsp;Power 2
<br/><br/><br/><br/>
if you enter one number then press power2
It will be calculated immediately you can see this by pressing power2 so many times in row
<br/><br/><br/><br/>
![Capture](https://user-images.githubusercontent.com/59110598/126708317-75b62e0a-e2a9-4fbd-b2e9-59481e755984.JPG)

<br/><br/><br/><br/><br/><br/><br/><br/>

&nbsp;&nbsp;if you enter like “10+2” and then press power2 then if will considered as (10+2)^2 so this will show the answer of “12^2” not “10+2^2”
as figure below
<br/><br/><br/><br/>
![Capture](https://user-images.githubusercontent.com/59110598/126708405-e466e0ce-f0bd-4c74-8c10-c2a40290918f.JPG)


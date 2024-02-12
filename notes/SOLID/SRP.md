### SRP [Single Responsibility Principle]
> A single code unit should have only one responsibility.
> SRP is very subjective in nature.

Refer the code given [Version 1](../../code/SRP/v1/Bird.java)

It is evident from the code that it is:
- Not readable
- Not testable
- No re-usability
> There are multiple reasons to change the code.Therefore, we got introduced to **SRP**.

We make code unit SRP once we make sure that there is only 1 reason is needed to change.
For example:
```java
 public void fly(BirdType type){
        if(type == BirdType.EAGLE){
            System.out.println("Eagle flies");
        } else if (type==BirdType.PENGUIN) {
            System.out.println("Penguin cannot fly");
        } else if (type==BirdType.VULTURE) {
            System.out.println("Vulture flies");
        }
    }
```
We need to change the fly method everytime if we update a new bird type,we can modify the current bird type.
```
 saveToDB(user){
    1.Connect to DB
    2.Create a query
    3.Execute the query
    4.Close the connection
 }
```
In the code above we can see there are 4 methods or 4 reason to change the code.

`Since SRP is very subjective in nature so with experience and practise the principle will be commanded over.`
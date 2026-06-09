What Is collection | Why we need It | Benefits of using collection framework | Advantages of using it | Usecases of it |

What is collection Interface | | Why we need It | Benefits of using it | Make a diagram What data structure(children Interfaces) lies in it

Difference between collection framework and Collection Interface

What is Map Interface  | Why we need it| Benefits of using it | Make a diagram What data structure lies in it

What is Iterator Interface. | Why we need it| Benefits of using it | Make a diagram What data structure lies in it

Lets talk about collection Interface:
    1. List interface [What it is | What it does | Advantages of using them and add one examnple and also explain that example]

    2. Array list [What it is | What it does| Advantages of using them and add one examnple and also explain that example]

    ```java
    // public class LearnArrayList {
        
    //     public static void main(String[] args){
    //         String[] studentName = new String[30];//Here we can only store the data of 30 Students
    //         //but if we want to store the data of 31st student then we can not do that, then we have to change the Size of the Array, but it is not the scalable solution.
    //     }
        
    // }

    //there is one problem in Array, we can not change the size of ArrayList dynamically. But there is a solution for this, which is ArrayList class | What ArrayList class is | What it does |How it solves the problem| advantage of using Array lIst class Over Arrays.

    import java.util.ArrayList;

    public class LearnArrayList {
        
        public static void main(String[] args){
            ArrayList<String> studentName = new ArrayList<>();
            studentName.add("Rakesh"); //Now we can add as many elements as we want to |
        }
        
    }

    ```
    How it solves the problem internally:
         It uses Array internally | It increases its size according to this formula = if the size is "n" then the next size will be [n + n/2 + 1]and it will copy the older Array to the newer Arra and Older Array will be dumped.


    Functionalities Provided In ArrayList(Also mention the time complexity For each function):
    i. add funtion and Type of add functions | Explain and Add example

    ii. get function |Explain, What it does 

    I am adding a code for your refrence for the Type of add function, get function

    ```java
    import java.util.ArrayList; 
    import java.util.List;

    public class LearnArrayList {

        public static void main(String[] args){

            List<Integer> list = new ArrayList<>(); //Explain this line
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list);//[1, 2, 3]

            //1st type
            list.add(4); //This will add 4 at the end of the list
            System.out.println(list);//[1, 2, 3, 4]

            //2nd type
            list.add(1, 50);//this will ad 50 at 1st index
            System.out.println(list);//[1, 50, 2, 3, 4]

            //3rd type : We can add another list in the current list
            List<Integer> newList = new ArrayList(); //Creating a new list
            newList.add(150);
            newList.add(160);

            list.addAll(newList);//This will add all the elementa of the new list in the current list
            System.out.println(list);//[1, 50, 2, 3, 4, 150, 160] 

            //get function
        }
    }
    ```

    iii. Remove elements and clear() from ArrayList |Explain, What it does 


    ```java
    import java.util.ArrayList; 
    import java.util.List;

    public class LearnArrayList {

        public static void main(String[] args){
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);
            
            System.out.println(list);//[10, 20, 30, 40, 50, 60, 70, 80]

            list.remove(1);//this will remove the elements from 1st Index.
            System.out.println(list);//[10, 30, 40, 50, 60, 70, 80]


            //This will remove that type of element that you have specified
            list.remove(Integer.valueOf(30));
            System.out.println(list);//[10, 40, 50, 60, 70, 80]

            // This will remove all the elements from the list
            list.clear();
            System.out.println(list); //[]
        }

    }

    // Output:
    // [10, 20, 30, 40, 50, 60, 70, 80]
    // [10, 30, 40, 50, 60, 70, 80]
    // [10, 40, 50, 60, 70, 80]
    // []

```

    iv. Set function | What it does
    v. Contains function | What it does

    ```java

    import java.util.ArrayList; 
    import java.util.List;

    public class LearnArrayList {

        public static void main(String[] args){
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);
            
            System.out.println(list);//[10, 20, 30, 40, 50, 60, 70, 80]

            list.set(2, 1000);

            System.out.println(list);//[10, 20, 1000, 40, 50, 60, 70, 80]

            System.out.println(list.contains(50)); //It will return True and false as answer
        }
    }

```

Important: 
[whenever we write any object in "System.out.println(list);" then toString method of that object will be Invoked] 
Every class has toString method, when we are writing list in "System.out.println(list);" the toString Method of ArrayList is getting invoked, Explain what this toString Method is and What it does.|How it internaly do the work.
Explain this in simple terms.


Traversing On Array Elements:
    We have multiple Ways to do that:
    1. using for loop
    2. using For Each loop
    3. using iterator | What it is | Why we use it | Advanatges of using It

    ```java
    import java.util.ArrayList; 
    import java.util.List;

    public class LearnArrayList {

        public static void main(String[] args){
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);
            
            System.out.println(list);//[10, 20, 30, 40, 50, 60, 70, 80]

            //using for loop
            for(int i = 0; i<list.size(); i++){
                System.out.println("The element is " + list.get(i));
            }

            //2. using For Each loop
            for(Integer element: list){
            System.out.println("foreach element is " + element);
            }

            //3. using Iterator
            //uptill that time, the iterator has next element, it will iterate
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                System.out.println("iterator " + it.next());//by the help of it.next the next value of Iterator will be accessible.
            }
        }

    }
    ```





    










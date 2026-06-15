class Demo{

    // this is my first java program
    /* i 
    have 
    learned
    some thing about 
    java */
    public static void main(String[] args){
        System.out.print("I like coffee!!\n");
        System.out.println("It's very good!!");


        /*variable is reusable memory location to store value. It is a name of memory location. Variable is used to store data. In java, variable must be declared before use. Variable declaration includes data type and variable name. Data type specifies the type of data that can be stored in the variable. Variable name is the identifier for the variable.*/

        float age;
        age=30.6f;
        System.out.println(age);
        int quantity =1;
        System.out.println(quantity);
        int year = 5236;
        System.out.println("The year is "+ year);
        double price = 6325.23;
        System.out.println("The price is ₹ "+ price);
        double gpa = 3.5;
        double temperature = 32.5;

        char grade ='A';
        char symbol = '!';
        char currency = '₹';
        System.out.println("The currency is "+ currency);

        boolean isjavafun = true;
        boolean isfighting = false;
        boolean isonline = false;

        if (isjavafun){
            System.out.println("is java fun");

        }else{
            System.out.println("is java not fun");
        }

        String name ="cygnus Vale";
        String founds="14th june 2026";
        System.out.println(name + founds);
        
        

    }

    
}


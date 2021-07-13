
OOPs
------------------------------------------------------------------

    Class & Object

        class is a user defiend data type,
        to represent a real time entity
        in terms of its properties and behaviours,.
        proeprties are represented by data members,
        and behaviours are represented by methods.


        class User{

            //Fields - Instance Variables
            private long userId;
            private String firstName;
            private String lastName;
            private String emailId;
            private String mobile;
            private String password;

            //constructors....
            //getters and setters...

        }

        Object is a instcne of a class, is a variable of class type.

    Encapsulation

            is a process of data hiding.

            using access specifiers ang getter/setters


            public
            private
            protected
            default

        constructor?
                is a special method that gets executed immediatly
                after the object getting allocated.

                is used mostly to initilie the object state.

                must have the same name as that of the class, and shall
                not return anything even not void.

                default constructors            does not have params
                paramatrized cosntructors       have one or more params
                copy constructor                one or more params are of the class type.

        'this'
                refers to the current object of a method.
                alkso be sued to call one construcotr from another in  a class

        'static'
                applied on
                    field           static fields are called class variables
                                    non-static fields are called instance variable

                                    each instance will have a common copy
                                    of the class variables and disticnt copies of the instance variables.

                    method          static methdo only can access the static members
                                    directly.

                                    static public methods or fields can be accessed
                                    directly on class name.

                    class           the outmost classes can not be static
                                    but inner classes can be static and 
                                    static inner class is called nested class.

                    static block

                                    static{

                                    }

    Inheretence

                    deriving a class from another
                    classes support the belwo type of inheretences only
                                Simple
                                Multi-Level
                                Hyrarchial
                                Hybrid

                    'extends'

                    constructor chaining

                    'super'

    Polymorphisim

                    Static Polymorphisim / overlaoding

                        class LivingBeing{
                            
                            public Energy eat(Apple apple){
                                Energy e = new Energy();
                                while(apple.isRemnaining()){
                                    e.accumalate(biteAndChew(apple));
                                }
                                return e;
                            }

                            public Energy eat(Meat meat){
                                Energy e = new Energy();
                                while(meat.isRemnaining()){
                                    Bite b = tearAPiece(meat);
                                    e.accumalate(chew(b));
                                }
                                return e;
                            }

                            public Energy eat(IceCream ic){
                                Energy e = new Energy();
                                while(ic.isRemnaining()){
                                    e.accumalate(lick(b));
                                }
                                return e;
                            }
                        }

                    Dynamic Polymorphisim / overriding

                        class Dog extends LivingBeing{

                        }

                        class Human extends LivingBeing{
                            public Energy eat(Apple apple){
                                wash(apple);
                                Piece[] ps = cut(apple);
                                Energy e = new Energy();
                                for(Piece p : ps){
                                    e.accumalate(chew(p));
                                }
                                return e;
                            }

                            public Energy eat(Meat meat){
                                Piece[] ps = cut(meat);
                                cook(ps);
                                Energy e = new Energy();
                                for(Piece p : ps){
                                    e.accumalate(chew(p));
                                }
                                return e;
                            }
                        }

                'super'         calling an overden method from its overrdien sub-copy.

                'final'         can be applied on
                                            class               it can not be extended furhtur
                                            methods             can not be overriden 
                                            fields/variables    are going to be constants so-forth

    Abstraction

                is a process of behaviour (implementation) hiding.


                'abstract'

                            abstract method         that has no known implementation

                            abstract class          that has atleast one abstract method
                                                    or the class can not be instantiated.

                            interfaces              is a user defiend data type that 
                                                    serves as a complete multi inhrertable abstract role.


                                                            abstract class    interface
                                                    -----------------------------------------------
                    private non-abstract methods                possible        possible

                    public non-abstract methods                 possible        possible (using defautl keyword)

                    public abstract methods                     possible        possible

                    static mehtods                              possible        possible

                    fields                                     all-possible     public static final fields 

                    inheretence                         multiple not supprted   multiple is supported


    Java Standard Libraries
    -----------------------------------------------------------------------------------------------------------

        Lang Package                         java.lang

                            Object
                                        hashcode()
                                        equals(Object)
                                        toString()

                            String
                            StringBuffer
                            StringBuilder

                            Wrapper Classes

                            System
                            Math

        Exceptions

                                    Throwable
                                        |
                                    --------------
                                    |             |
                                    Error         Exception
                                                        |
                                                ----------------------
                                                |                     |
                                                RuntimeException      CHECKED EXCEPTIONS
                                                |
                                                UNCHEKCED EXCEPTIONS

                                CHECKED EXCEPTIONS are checked by the compiler 
                                if thrown or handled using try..catch
                                where as UNCHEKCED EXCEPTIONS are not 
                                checked so by the compiler.


                                UNCHECKED EXCEPTIONS can be avoided by defensive programming, we 
                                need not wati until they occur and then handle them.

                                we have to avoid UNCHECKED EXCEPTIONS but not handle them.....!

                                NullPointerException

                                    public void raisePay(Employee e){
                                        e.setSal(e.getSal()*2);
                                    }

                                Handle NullPointerException --- is the wrong way of doing
                                    public void raisePay(Employee e){
                                        try{
                                            e.setSal(e.getSal()*2);
                                        }catch(NullPointerException e){
                                            //...
                                        }
                                    }
                                
                                Avoid NullPointerException --- is the right way
                                    public void raisePay(Employee e){
                                        if(e!=null){
                                            e.setSal(e.getSal()*2);
                                        }
                                    }

                        Suppressed Exception

                            Connection con=null;
                            PreparedStatement p1=null;
                            PreparedStatement p2=null;

                            try{
                               
                                con = DriverManager.getConnection(url,uid,pwd);
                                p1 = con.prepareStatement(qry1);
                                p2 = con.prepareStatement(qry2);
                               
                                //jdbc code
                            }catch(SQLException e){
                                //handling code..
                            }finally{
                                try{
                                 p1.close();
                                 p2.close();
                                 con.close();
                                }catch(SQLException e){
                                    //handling code.. and the exception '
                                    //in the main try block is ignored and ehnce called
                                    //suppressed exception.
                                }
                            }
                    
                        try-with-mulit catch

                            try{
                                //code that throws an exception
                            }catch(ExceptioType1 | ExceptionTyp2 | ExceptionType3 e){
                                //handleing code..
                            }

                        try-with-resources

                            try(
                                Connection con = DriverManager.getConnection(url,uid,pwd);
                                PreparedStatement p1 = con.prepareStatement(qry1);
                                PreparedStatement p2 = con.prepareStatement(qry2);
                                ){
                                //jdbc code
                            }catch(SQLException e){
                                //handling code..
                            }

                            //the conenction  con is clsoed automatically.
                            //inside the try face, only Closable objects can be declared.

        Date Tiem API
        --------------------

            java.time
                        LocalDate
                        LocalDateTime

                                        .now()
                                        .of(year,month,day)
                                        .of(year,month,day,hour,min)

                        ZonedDateTime

                        Period          
                        Duration
                                        .between(start,end)

                        DateTimeFormatter
                                        .ofPattern("");

                                        .parse("");
                                        .format(dateObj)


                        Accept the dob of a person in dd-MM-yyyy format
                        and assuming 60 years is the age of retirement,
                        compute and display the possible retirement date of
                        that person.

        Generics and Collections
        --------------------------------------

                Generic ?
                    Aribattary data type that is realized at runtime...
                    Used for crating ADT (Abstract data types)

                    Swapping    e1 and e2

                            temp = e2;
                            e2 = e1;
                            e1 = temp;

                    Wildcards
                                Upper Bounded       <? extends T>
                                unbounded           <?> 
                                Lower Bounded       <? super T>


                Collections ?
                                java.util

                                    Collection                  Map
                                     |--Set                      |--HashMap
                                        |--HashSet               |--LinkedHashMap   
                                        |--LinkedHashSet         |--SortedMap 
                                        |--SortedSet                    |--TreeMap
                                                |--TreeSet
                                     |--List
                                         |--ArrayList
                                         |--LinkedList
                                         |--Vector


                              Set                   a non-linear data structure
                                                    allows only one null at most
                                                    allows no duplicates
                                                    allows no randoem access (using index)
                                HashSet             does not ensure any order of retrival  
                                LinkedHashSet       ensures the entry order as order of retrival
                                TreeSet             ensures the sorted order as order of retrival
                              
                              List                  a linear data structure
                                                    allows nulls
                                                    allows uplicates
                                                    allows randoem access (using index)
                                ArrayList           is a grwable array,is not synchronized
                                Vector              is a gowablke array,is synchronized
                                LibnkedList         is dblly lnked list,


                              Map                   is a collection of key-value pairs
                                                    allows no duplicate keys
                                HashMap             does not ensure any order of retrival
                                LinkedHashMap       ensures the entry order as order of retrival
                                TreeMap             ensures the sorted order on keys as order of retrival

                             Collections
                             Comparator
                             java.lang.Comparable

        IO Streams           java.io              


        Multi-Layer Archetecture
       
                PerssitenceUnit   <--->          APPLICATION         <--->    EndUser
              FielSystem/DB..etc

                                          MODEL, EXCEPTIONS, UTIL ..etc
                PerssitenceUnit   <---> [ DAO <--> SERVICE <--> UI ] <--->    EndUser
              FielSystem/DB..etc


                DAO             interact with the Persistant Unit
                SERVICE         host all the bussiness logic like computations,validations...etc
                UI              interact with the End User

                Each layer comprises of a Abstract Type (interface) and its Implementation to
                compliement the isolation and loose coupled ness of the layers.

        Interfaces Enhancements
            1. static methods
            2. default methods (methods with implementation)
            3. Functional Interfaces
            
                static and default methods
                ------------------------------------------------------------------
                interface Shape{
                    public abstract double area();
                    public abstract double perimeter();

                    public static Shape greaterOf(Shape s1,Shape s2) {
                        return s1.area()>s2.area()?s1:s2;
                    }

                    public default double estimatePainitngCost(double paintingRate){
                        return area()*paintingRate;
                    }

                }

                
                Functional Interfaces
                ------------------------------------------------------------------

                    is any interface that has not more than one abstract method.

                    @FunctionalInterface annotation is a compil-time check annotation
                    to ensure that the appleid interface has only one abstract menthod.

                                    that the abstract method in the functional interface
                    ----------------------------------------------------------------------------------
                    Supplier        does not accept any params but returns.    
                    
                    Consumer        does accept params but does not return.    
                    
                    Predicate       returns only boolean irrespective of having not having params.

                    Functiuonal     accepts params and returns a value.


                    the functional interface cna be implements using a lambda expression
                    or can hold a function reference.

                    java.util.function

        Lambda Expressions

                    (arg1,arg2...) -> returnExpression;

                    (arg11,arg2,..) -> {
                        code...
                        return vlaue;
                    }; 

                    
        Function References

            FunctionInterface var1 = accessor::methodName

        Streams API

                a stream is a flow data from a dataSource(Collection array/list/set/map) 

                java.util.stream.Stream

                            Stream s1 = Stream.of(array);
                            Stream s2 = list.stream();
                            Stream s2 = set.stream();

                            Stream Operations
                            ----------------------------
                                Terminal Operations - that return zero or one object
                                -----------------------------------------------------------

                                    forEach     accepts a consuemr and 
                                                executes the cosnumer on each value of the stream

                                    reduce      accepts a bianryOperator
                                                executes the binary operator on each pair of eles in the stream
                                                and returnt he untimate single ele.

                                                int[] a = new int[]{1,2,3,4,5,6,7,8,9};
                                                Stream s = Stream.of(a);
                                                BinaryOperator<Integer> bo = (v1,v2) -> v1+v2;
                                                a.reduce(bo); // bo(bo(bo(bo(bo(bo(bo(bo(1,2),3),4),5),6),7),8),9)
                                                            //45

                                    collect     accepts a Collector
                                                is used to collect all the eles of a stream into a list/set/map
                                                
                                                Collectors.toList()
                                                Collectors.toSet() ...etc.,

                                Intermediate Operations - that return a new stream
                                ------------------------------------------------------------
                                    filter      accepts a Predicate
                                                return a new stream of eles that belogn to
                                                older stream and that got true when applied with the
                                                predicate

                                    map         accepts a Transformer  (accepts a param and returns a value that
                                                after tranfroiming the param.)

                                                returns a new stream of transformed values of all eles
                                                in the older stream.

                                    flatMap     is used for flatting a stream of streams into
                                                one single stream.
                                    distict     returns a new stream of non-duplicat ele from older stream

        JDBC
                    DrivarManager
                    Connection
                    Statement
                    PreapredStatement
                    CallableStatment
                    ResultSet


        Case Study
        -----------------------------------------------------------------

            1. App should display a menu:

                1. Upload Report
                2. Display Summarry
                3. Quit

            2. When '1' is choosen 

                ask for the file names eg: 'sampleData.txt'
                verify if the sampleData.txt is a commas seprated records file:
                    1,Item1,CMR Shopping Mall,56,56000,1000,01-JUN-2021
                    ....
                    ....
                where each line represents a sales record with fields 
                receiptNumber,itemName,area,unitsSold,totalCollection,rate,saoldDate

                and convert each of the such line into a relevent java object
                and insert them into a table in the database (mysql).

                if any record format mismatches, a relevent err msg shall be displayed and
                the rest of the records mus tbe processed,

                finally diplay the numberOfRecordsSaved out of numberOfRecordsInFile
            
            3. When '2' is choosen 

                accept the start date and end date
                retrive all sales recoreds with in the given dates from the database table,
                and display a report as below

                        assuming dates range is 01-Feb-2021 to 31-Jun-2021

                        Feb2021     Mar2021     Apr2021     May2021 Jun2021

                Item1   26 26000    0 0         12  13450
                Item2
                Item3
                Item4
                ....

        



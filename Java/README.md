
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

        Generics and Collections

        Functional Interfaces

        Lambda Expressions

        Streams API

        IO Streams

        JDBC

        MultiThreading

        



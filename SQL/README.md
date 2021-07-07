SQL 
--------------------------------------------------------------

        databases
            tables
                records/rows/tuples
                    fields/cols/attributes

    DDL     Data Def Lang

                defining data base objects:
                                    Table
                                    View
                                    Sequence
                                    Procedure
                                    Function ......
            CREATE

                        CREATE DATABASE dbName;

                        CREATE TABLE tab_name(
                            col_name    data_type   constraint,
                            col_name    data_type   constraint,
                            col_name    data_type   constraint,
                            ....
                            entity_level_constraitns....
                        );

                        constraint?
                            rule bound to ensure data integrity (validity).

                            domain is a set of valid valeus for a field.

                            Field           Domain
                            -------------------------
                            isMarried       {true/false]
                            age             {n:n>=1}

                            Domain Constraints
                            ------------------------                                    
                            Not Null
                            Check
                            Default

                            Entity Constaints
                            ---------------------------
                            Primary Key         
                            Unique
                            Foreign Key
                            Check


                            CREATE TABLE movie_ticket(
                                seat_no int,
                                show_data_time data_time,
                                screen_no   int,
                                constraint pk_m_t PRIMARY KEY (seat_no,show_date_time,screen_no)
                            );

            ALTER           
                        ALTER TABLE tab_name
                        MODIFY col_name datatyep constaint

                        ALTER TABLE tab_name
                        DROP COLUMN col_name

                        ALTER TABLE tab_name
                        ADD column col_name col_def

                        ALTER TABLE tab_name
                        ADD CONSTRIANT const_def

                        ALTER TABLE tab_name
                        DROP CONTRAINT const_def

            DROP
                        DROP TABLE tab_name
                        DROP DATABASE db_name

    DML     Data Mani Lang

            INSERT INTO table_name VALUES(........)
            INSERT INTO table_name(col_nmes...) VALUES(........)

            UPDATE TABLE tab_name SET col_name=value..... WHERE cond

            DELETE FROM table_name WHERE cond

    DRL     Data Retri Lang

            SELECT *|col_names....                  PROJECTION
             FROM tables                            DATA SOURCE and JOINS
             WHERE cond                             FILTER
             GROUP BY cols...                       GROUPING and AGGREGATION
             HAVING cond                            POST_GROUP FILTER
             ORDER BY cols...                       SORT

             JOINS
                        INNER JOIN

                        OUTER JOIN
                            LEFT
                            RIGHT
                            FULL
                 
                        SELF JOIN
                        NATURAL JOIN
                        CROSS JOIN

    DCL     Data Control Lang

                GRANT
                REVOKE

    TCL     Txn Control Lang

                SAVEPOINT
                COMMIT
                ROLLBACK
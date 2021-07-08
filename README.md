Case Study: BudgetTracker
-----------------------------------------------------------------

    High Level SRS
    -------------------------------------------------------------
    1. users can register and login
            User            uid,firstName,lastName,emailId,mobile,password
    2. logged in users can
        2.1. See Monthly Statement 
            (month,Year,openingBal,totalCredit,totalDebit,closingBal)
        2.2. See Annual Statement 
            (Year,openingBal,totalCredit,totalDebit,closingBal)
        2.3. Add a Transaction
        2.4. Remove a Transaction
        2.5. Modify a Transaction
            Transaction     txnId,amount,header,type(CREDIT/DEBIT),dateOfTransaction



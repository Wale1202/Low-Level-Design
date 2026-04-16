#Identify Entities
-Deposit
-Withdrawal
-Balance
-Account Number
-Iban
-Transfer



#Define Responsibilities
-Deposit - Add money to the bank
-Withdrawal-- Removing Money from bank
-Balance-- Remaing Money in the bank
-Account Number-- Identification to transfer money 
-Iban-- Means of identification other than account number
-Transfer-- Sending money 

#Define Relationships
- Deposit

#Add Key Methods
- deposit()
- withdrawal()
- accountBalance()
- accountNumber()
- transfer()

#Edge Cases
- sending money twice and it only goes once
- negative money(overdraft)
- float or double issues
- 
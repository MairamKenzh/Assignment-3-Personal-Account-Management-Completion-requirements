**TransactionType Enum**
- DEPOSIT: Represents a deposit transaction.
- WITHDRAWAL: Represents a withdrawal transaction.
Amount Class
- Fields:
1. amount: The transaction amount.
2. type: The type of transaction (TransactionType).
   
**Methods:**
- Amount(double amount, TransactionType type): Constructor for initialization.
- toString(): Returns a string with transaction information.
  
PersonalAccount Class
**Fields:**
- accountNumber: Unique account identifier.
- accountHolder: Name of the account holder.
- balance: Current balance.
- transactions: List of transactions (ArrayList<Amount>).
  
**Methods:**
- PersonalAccount(int accountNumber, String accountHolder): Constructor for initialization.
- deposit(double amount): Deposits money into the account.
- withdraw(double amount): Withdraws money from the account.
- printTransactionHistory(): Prints the transaction history.
- getBalance(): Returns the current balance.

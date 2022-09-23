# Exercício

Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta.<br>


### Exemplos

### Exemplo1

Enter account data<br>
Number: 8021<br>
Holder: Bob Brown<br>
Initial balance: 500.00<br>
Withdraw limit: 300.00<br>
Enter amount for withdraw: 100.00<br>

### Exemplo2

Enter account data<br>
Number: 8021<br>
Holder: Bob Brown<br>
Initial balance: 500.00<br>
Withdraw limit: 300.00<br>
Enter amount for withdraw: 400.00<br>
Withdraw error: The amount exceeds withdraw limit<br>

### Exemplo3

Enter account data<br>
Number: 8021<br>
Holder: Bob Brown<br>
Initial balance: 500.00<br>
Withdraw limit: 300.00<br>
Enter amount for withdraw: 800.00<br>
Withdraw error: The amount exceeds withdraw limit<br>

### Exemplo4

Enter account data<br>
Number: 8021<br>
Holder: Bob Brown<br>
Initial balance: 200.00<br>
Withdraw limit: 300.00<br>
Enter amount for withdraw: 250.00<br>
Withdraw error: Not enough balance<br>

Fiz em formato de lista e com do while, para poder testar vários sem ter que ficar reiniciando e no final mostrar todas as contas<br>
Exemplo:<br>
Account [balance=500.0, holder=Bob Brown, number=8021, withdrawLimit=300.0]<br>
Account [balance=200.0, holder=Gabriel Marchiori, number=8022, withdrawLimit=300.0]

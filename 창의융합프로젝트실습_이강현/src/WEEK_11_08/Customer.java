package WEEK_11_08;

public class Customer extends Thread{
	Account _Account;
	Customer(Account _Account, String Name){
		this._Account = _Account;
		setName(Name);
	}
	public void run() {
		while(true) {
			_Account.withdraw(getName());
			if(_Account.getTotal() <=0) break;
		}
	}

}

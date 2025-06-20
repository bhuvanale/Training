class Account{
      double balence = 1000;
      // if we keep private modifier
}

class DataHiding {
   public static void main(String[] args) {
    Account a = new Account();
    System.out.println("balence is "+a.balence);
    // genreates an error 
   }

}

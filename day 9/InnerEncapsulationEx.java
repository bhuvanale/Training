class Bank {

    private String name;
    private long acNo;
    private double balence;
    
    public void setName(String name){
            this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAcno(long acNo){
        this.acNo = acNo;
    }
    public long getAcno(){
        return acNo;
    }

    public void setBalence(double balence){
        this.balence= balence;
    }
    public double getBalence(){
        return balence;
    }
    
}


class EncapsulationEx {
    public static void main(String[] args) {

 

        Bank  user1 = new Bank();

        user1.setBalence(10000.0);
        user1.setAcno(234168767);
        user1.setName("bhuvana");;
        System.out.println("name: "+user1.getName()+" account number: "+user1.getAcno()+" Balence : "+user1.getBalence());
    }
}

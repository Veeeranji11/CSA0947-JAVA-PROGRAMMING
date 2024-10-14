public Class factorial{
    public static void main(String[] args) {
        int num=5,fact=1,i;
        for(i=2;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
}
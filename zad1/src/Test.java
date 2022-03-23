class Test{
    public static void main(String[] args){
        try{
            WierszTrojkataPascala Tp = new WierszTrojkataPascala(Integer.parseInt(args[0]));
            for(int i = 1; i < args.length; i++){
                try{
                    int n = Integer.parseInt(args[i]);
                    System.out.println(args[i] + " - " + Tp.wspolczynnik(n));
                }catch(Exception2 ex){
                    System.out.println(args[i] + " - liczba spoza zakresu");
                }catch(NumberFormatException ex){
                    System.out.println(args[i] + " - nieprawidlowa dana");
                }
            }
        }catch(Exception1 | NumberFormatException ex){
            System.out.println(args[0] + " - Nieprawidłowy numer wiersza");
        }
    }
}